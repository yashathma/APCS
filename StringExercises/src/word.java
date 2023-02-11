public class word {
    String word;
    int syllables;
    public word(String Word, int Syllables){
        this.syllables=Syllables;
        this.word=Word;
    }

    public int getSyllables() {
        return syllables;
    }
    public String getWord(){
        return word;
    }
}
