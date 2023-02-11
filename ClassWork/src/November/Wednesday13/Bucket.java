package November.Wednesday13;

public interface Bucket {
    void add(String word);
    void add(String word,long count);
    int size();
    long getCountOf(String word);
    int getFreq(String word);
    int getNumUnique();
}
