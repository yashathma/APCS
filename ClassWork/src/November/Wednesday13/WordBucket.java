package November.Wednesday13;

import java.util.ArrayList;

public class WordBucket implements Bucket {
    private ArrayList<String> word;
    private String mostFrequent;
    private int uniqueWords=0;
    private int countofmostFrequent;

    private WordBucket(ArrayList<String> word) {
        this.word = word;
        mostFrequent="";
        countofmostFrequent=0;
    }

    public void add(String item) {
        word.add(item);
        int count = (int) getCountOf(item);
        if ((count>countofmostFrequent)){
            countofmostFrequent=count;
            mostFrequent=item;
        }
    }

    public void add(String word, long count) {
        for (int i = 0; i < count; i++) {
            this.word.add(word);
        }
    }

    public int size() {
        return word.size();
    }

    public long getCountOf(String word) {
        long counter = 0;
        for (int i = 0; i < this.word.size(); i++) {
            if (this.word.get(i).equals(word)) {
                counter++;
            }
            uniqueWords++;
        }
        return counter;
    }

    public int getFreq(String word) {
        int count = 0;
        for (int i = 0; i < this.word.size(); i++) {
            if (this.word.get(i).equals(word)) {
                count++;
            }

        }
        return count;
    }

    public int getNumUnique() {
        return uniqueWords;
    }
}
