import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Dictionary dict = Dictionary.buildDictionary("data/words.txt");
        String[] words = dict.getWordList();

        //Problem1
        /*
        ArrayList<String> List=getWordswithout("e",words);
        PrintArrayList(List);
         */


        //Problem2
        /*
        String badletter="e";
        String LongestWord=getlongestwordWithoutLetter(words,badletter);
        System.out.println(LongestWord);
         */

        //Problem3
        /*
        String necessaryletters[]={"x","q"};
        getswordscontaining(words,necessaryletters);
         */

        //Problem4
        /*
        ArrayList<String> good = getgoodspellingwords(words);
        System.out.println("Good Words:");
        printarr(good);
        System.out.println();
        System.out.println("BadWords:-----------------------------------------------------");
        ArrayList<String> bad = getbadspellingwords(words);
        printarr(bad);
         */

        //Problem5

        ArrayList<String> ProCon = new ArrayList<>();
        ProCon = getWordPairsForJoke(words);
        printarrylist(ProCon);
        System.out.println(ProCon.size());



    }

    private static ArrayList<String> getWordPairsForJoke(String[] words) {
        ArrayList<String> ProCon = new ArrayList<>();
        ArrayList<String> HasPro = new ArrayList<>();
        ArrayList<String> HasCon = new ArrayList<>();
        for (String word : words) {
            if (word.length() >= 3) {
                if (word.substring(0, 3).equals("pro")) {
                    HasPro.add(word);
                } else if (word.substring(0, 3).equals("con")) {
                    HasCon.add(word);
                }
            }
        }

        for (int i = 0; i < HasCon.size(); i++) {
            for (int j = 0; j < HasPro.size(); j++) {
                if (HasCon.get(i).substring(3,HasCon.get(i).length()).equals(HasPro.get(j).substring(3,HasPro.get(j).length()))){
                    ProCon.add(HasPro.get(j)+", "+HasCon.get(i));
                }
            }
        }

        return ProCon;
    }

    private static void printarrylist(ArrayList<String> proCon) {
        for (int i = 0; i < proCon.size(); i++) {
            System.out.println(proCon.get(i));

        }
    }

    private static ArrayList<String> getbadspellingwords(String[] words) {
        //good is cei and ie
        //bad is cie and ei
        ArrayList<String> bad = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("cie") || words[i].contains("ei")) {
                bad.set(i, words[i]);
            }
        }
        return bad;
    }

    private static void printarr(ArrayList<String> arraylist) {
        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }
    }

    private static ArrayList<String> getgoodspellingwords(String[] words) {
        //good is cei and ie
        //bad is cie and ei
        ArrayList<String> good = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("cei") || words[i].contains("ie")) {
                good.set(i, words[i]);
            }
        }
        return good;
    }


    private static void getswordscontaining(String[] words, String[] necessaryletters) {
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < necessaryletters.length; j++) {
                if (words[i].contains(necessaryletters[j])) {
                    System.out.println(words[i]);
                }
            }
        }
    }

    private static String getlongestwordWithoutLetter(String[] words, String badletter) {
        int max = words[0].length();
        String bigWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > max && !words[i].contains(badletter)) {
                max = words[i].length();
                bigWord = words[i];
            }
        }
        return bigWord;
    }

    private static void PrintArrayList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static ArrayList<String> getWordswithout(String letter, String[] words) {
        ArrayList<String> List = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (!words[i].contains(letter)) {
                List.add(words[i]);
            }
        }
        return List;
    }


}
