package September.Wednesday18;

public class StringWarmup {
    public static void main(String[] args) {
        String inputstring="hello there";
        String inputletter="e";
        int find=returnletter(inputletter,inputstring);
        System.out.println(find);
    }

    private static int returnletter(String inputletter, String inputstring) {
        int count=0;
        for (int i = 0; i < inputstring.length(); i++) {
           if (inputstring.substring(i,i+1).equals(inputletter)){
               count++;
           }

        }
        return count;
    }
}
