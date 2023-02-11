package October;

public class W7HW {
    public static void main(String[] args) {
        //Problem 1
        /*
        String input ="Hi my name is Yash";
        String seperation =" ";
        int time = 3;
        String NthValue = getNthValue(input, seperation, time);
        System.out.println(NthValue);
         */

        //Problem 2
        /*
        String input ="Hi my name is Yash";
        String seperation =" ";
        int time = 4;
        String removeNth = removeNthValue(input, seperation, time);
        System.out.println(removeNth);
         */
    }

    private static String removeNthValue(String input, String seperation, int time) {
        String words[] = input.split(seperation);
        String badWord = words[time];
        String partOne = input.substring(0, time);
        String partTwo = input.substring(time+ badWord.length(), input.length());
        return partOne+partTwo;

    }

    private static String getNthValue(String input, String seperation, int time) {
        String words[] = input.split(seperation);
        return words[time];
    }
}
