public class WordThing {
    public static void main(String[] args) {
        Dictionary dict = Dictionary.buildDictionary("data/words.txt");
        String[] words = dict.getWordList();

        String[] testwords = {"banana","kite", "queen", "arduous"};

        for (String testword : testwords){
            int syllables =syllablesFor(testword);
            System.out.println(testword);
            System.out.println(syllables);
        }
    }

    private static int syllablesFor(String testword) {
        int syllables = 0;
        for (int i = 0; i < testword.length(); i++) {

            if (isVowel(testword.substring(i,i+1))){
                if (nextcharisnotVowel(testword.substring(i+1,i+2))){
                    syllables++;
                }
            }
        }
        return syllables;
    }

    private static boolean nextcharisnotVowel(String letter) {
        if (!letter.equals("a")&&!letter.equals("e")&&!letter.equals("i")&&!letter.equals("o")&&!letter.equals("u")){
            return true;
        }
        return false;
    }

    private static boolean isVowel(String letter) {
        if (letter.equals("a")||letter.equals("e")||letter.equals("i")||letter.equals("o")||letter.equals("u")){
            return true;
        }
        return false;
    }
}
