import java.util.ArrayList;

public class kartik {
    public static void main(String[] args) {
        String names = "misha,,kartik,yash";
        String sep = ",";
        ArrayList<String> namers = newKartikisIdiot(names,sep);
        for (int i = 0; i < namers.size(); i++) {
            System.out.println(namers.get(i));
        }
    }

    private static int factorial(int input) {
        int total = 1;
        for (int i = 1; i <= input; i++) {
            total *= i;
        }

        return total;
    }

    private static ArrayList<String> newKartikisIdiot(String input, String sep) {
        ArrayList<String> names = new ArrayList<>();
        int startIndex = 0;
        for (int i = 0; i < input.length() - 1; i++) {

            if (check(input.charAt(i),sep)) {
                String w =loopdown(input, i, startIndex);
                if(w.length()>0) names.add(w);
                startIndex = i + sep.length();
            }

            if (i == input.length() - 2) {
                String name = "";
                for (int j = startIndex; j < input.length(); j++) {
                    name += input.charAt(j);
                }

                if (name.length() > 0) names.add(name);

            }
        }
        return names;
    }

    private static boolean check(char letter, String sep) {
        for (int i = 0; i < sep.length(); i++) {
            if (sep.charAt(i) == letter){
                return true;
            }
        }
        return false;

    }

    private static String loopdown(String input, int i, int startIndex) {
        String name = "";
        for (int j = startIndex; j < i; j++) {
            name += input.charAt(j);
        }

        return name;
    }


    private static ArrayList<String> ketikIsIdiot(String input) {
        ArrayList<String> names = new ArrayList<>();

        while (input.length() > 0) {
            if (input.indexOf(",") < 0) {
                names.add(input);
                return names;
            }
            int index = input.indexOf(",");
            names.add(input.substring(0, index));
            input = input.substring(index + 1);
        }
        return names;
    }

    private static int findWord(String word, String target) {

        for (int i = 0; i < word.length() - target.length() + 1; i++) {
            String check = "";
            for (int j = 0; j < target.length(); j++) {
                check += word.charAt(i + j);
            }
            if (check.equals(target)) return i;
        }
        return -1;
    }


}
