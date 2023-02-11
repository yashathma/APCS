import java.util.Scanner;
/*
public class ProblemSet3 {
    public static void main(String[] args) {

        //Problem 1 A
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int valueOne=keyboard.nextInt();
        int valueTwo=keyboard.nextInt();
        int valueThree=keyboard.nextInt();
        int maxNum=max(valueOne,valueTwo,valueThree);
        System.out.println(maxNum);


        //Problem 2 B
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int valueOne=keyboard.nextInt();
        int valueTwo=keyboard.nextInt();
        double avgNum=avg(valueOne,valueTwo);
        System.out.println(avgNum);


        //Problem 2 C
        displayNTimes("bird",3);



        //Problem 1 d
        String msg=getRepeatedMessage("techlabrocks!",3);
        System.out.println(msg);
         */

/*
        //Problem 2 A
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 4 numbers:");
        int valueOne=keyboard.nextInt();
        int valueTwo=keyboard.nextInt();
        int valueThree=keyboard.nextInt();
        int valueFour=keyboard.nextInt();
        double maxNum=maxP2(valueOne,valueTwo,valueThree,valueFour);
        System.out.println(maxNum);


        //Problem 2 B
        int a=countFactors(10);
        System.out.println(a);

        //Problem 2 C

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




    private static boolean isPrime(int userInput) {
        for (int i = 2; i < userInput; i++) {
            if (userInput % i == 0) {
                return false;
            } else {
                return true;
            }
        }
    }



    public static int countFactors(int num) {
        int amountOfFactors=0;
        for (int i=1;i<=num;i++){
            if (num%i==0){
                amountOfFactors++;
            }
        }
        return amountOfFactors;
    }

    private static double maxP2(int valueOne, int valueTwo, int valueThree, int valueFour) {
        double max2;
        double max3;
        double finalMax;
        max2=Math.max(valueOne,valueTwo);
        max3=Math.max(valueThree,valueFour);
        finalMax=Math.max(max2,max3);
        return finalMax;
    }

    private static String getRepeatedMessage(String word, int i) {
        String msg="";
        for (int a=1;a<=i;a++){
           msg=msg+word;
        }
        return msg;
    }

    private static void displayNTimes(String word, int i) {
        for (int a=1;a<=i;a++){
            System.out.print(word);
        }
    }

    private static double avg(int valueOne, int valueTwo) {
        double avgNum;
        avgNum=(valueOne+valueTwo)/2;
        return avgNum;
    }

    private static int max(int valueOne, int valueTwo, int valueThree) {
        int maxNum;
        maxNum=Math.max(valueOne,valueTwo);
        maxNum=Math.max(valueThree,maxNum);


        return maxNum;
    }
    */


//}

