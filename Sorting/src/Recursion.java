public class Recursion {
    public static void main(String[] args) {
        System.out.println(remove("axb"));
    }

    private static String remove(String string) {
        if (string.equals("x")) return "";
        if (string.length()>=1&&string.contains("x")) return string;
        int mid = string.length()/2;

        String left = string.substring(0,mid);
        String right = string.substring(mid);

        String lefta = remove(left);
        String righta = remove(right);

        return lefta+righta;
       /*
       if (string equals x) return ""
       if (string is length 1 and not x) return string;
       mid = find a middle index of string

       left = substring up to mid
       right = substring from mid to end

       leftAnswer = remove(left);
       rightAnswer = remove(right);

       return leftAnswer + rightAnswer;
        */


    }


}
