


import java.util.Scanner;
 public class PrimeSolve {

        public static void main(String[] args) {


            int counter;
            boolean isPrime = true;

            Scanner myScanner = new Scanner(System.in);
            System.out.println("Enter");

            int inputUser = myScanner.nextInt();

            myScanner.close();

            for (int i = 2; i <= inputUser / 2; i++)


            {
                counter = inputUser % i;
                if (counter == 0) {
                    isPrime = false;
                    break;
                }
            }
    if(isPrime)
        System.out.println("true");

    else
        System.out.println("false");
    }
}


