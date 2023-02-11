package Wednesday28;

public class BruteForceProblem3 {
    public static void main(String[] args) {
        abcd();


    }

    private static void abcd() {
        int count=0;
        int bignum=150;
        for (long e = 1; e < bignum ; e++) {
            for (long a = 1; a < e; a++) {
                for (long b = a; b < e; b++) {
                    for (long c = b; c < e; c++) {
                        for (long d = c; d <e ; d++) {
                            count++;
                            if ((a*a*a*a*a)+(b*b*b*b*b)+(c*c*c*c*c)+(d*d*d*d*d)==(e*e*e*e*e)){
                                System.out.println(a+" "+b+" "+c+" "+d+" "+e);
                                System.out.println(count);
                            }
                        }
                    }
                }
            }
        }
    }
}
