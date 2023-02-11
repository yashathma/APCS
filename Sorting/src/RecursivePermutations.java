public class RecursivePermutations {
    public static void main(String[] args) {
        permutate("1234");
    }

    private static void permutate(String string) {
        System.out.println(string);
        for (int c = 0; c < string.length(); c++) {
            for (int i = 0; i < string.length(); i++) {
                for (int j = i; j < string.length(); j++) {
                    if (j>i){
                        System.out.println(swap(string,i,j));
                    }

                }
            }
            string=turn(string);
        }
    }

    private static String turn(String string) {
        String start = string.substring(1,2);
        string=string.substring(2);
        return string+start;
    }

    private static String swap(String string, int i, int j) {
        String I = string.substring(i,i+1);
        String J = string.substring(j,j+1);
        String NEW = string.substring(0,i)+J+string.substring(i+1,j)+I+string.substring(j+1);
        return NEW;
    }
}