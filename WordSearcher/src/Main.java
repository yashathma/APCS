import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> dict = wordRunner.buildDictionary("words.txt");

        String input = "time";

        ArrayList<String> posWords = getPosWords(input);

        ArrayList<String> noReWords = removeRe(posWords);

        ArrayList<String> realWords = getRealWords(noReWords, dict);

        System.out.println(realWords);


    }

    private static ArrayList<String> getRealWords(ArrayList<String> words, ArrayList<String> dict) {
        ArrayList<String> out = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            if (!isNotInArrayList(words.get(i), dict)) {
                out.add(words.get(i));
            }
        }
        return out;
    }

    private static ArrayList<String> removeRe(ArrayList<String> posWords) {
        ArrayList<String> noReWords = new ArrayList<>();
        noReWords.add(posWords.get(0));

        for (int i = 1; i < posWords.size(); i++) {
            if (isNotInArrayList(posWords.get(i), noReWords)) {
                noReWords.add(posWords.get(i));
            }
        }

        return noReWords;
    }

    private static boolean isNotInArrayList(String word, ArrayList<String> noReWords) {
        for (int i = 0; i < noReWords.size(); i++) {
            if (word.equals(noReWords.get(i))) {
                return false;
            }
        }
        return true;
    }


    private static ArrayList<String> getPosWords(String input) {
        ArrayList<String> out = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {

            for (int j = 0; j < input.length() - 1; j++) {

                for (int k = 0; k < input.length() - 2; k++) {

                    for (int l = 0; l < input.length() - 3; l++) {

                        String constant = input.substring(0, 3);

                        input = input.substring(3);

                        String first = input.substring(0, 1);

                        input = input.substring(1);

                        input += first;

                        input = constant + input;

                        out.add(input);


                    }

                    String constant = input.substring(0, 2);

                    input = input.substring(2);

                    String first = input.substring(0, 1);

                    input = input.substring(1);

                    input += first;

                    input = constant + input;

                    if (input.length() <= 3) {
                        out.add(input);
                    }

                }

                String first = input.substring(0, 1);

                input = input.substring(1);

                String firstin = input.substring(0, 1);

                input = input.substring(1);

                input += firstin;

                input = first + input;

            }

            String first = input.substring(0, 1);

            input = input.substring(1);

            input += first;

        }

        return out;

    }

}
