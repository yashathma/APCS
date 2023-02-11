import java.util.Scanner;
public class ProblemSet2 {
    public static void main(String[] args) {
        //Problem 0
       /*
        int counter=1;
        while (counter<=100){
           if(counter%3==0&&counter%2==0){
               System.out.println("Wonk");
           }else if (counter%2==0&&counter%3!=0){
               System.out.println("*"+counter);
           }else if(counter%2!=0&&counter%3==0){
               System.out.println(counter+" hi");
           }else if(counter%2!=0&&counter%3!=0){
               System.out.println(counter);
           }

            counter++;
        }
        */
        //Problem 1
        /*
        Scanner keyboard = new Scanner(System.in);
        double firstRandNum = (int) (1+Math.random()*20);
        double secondRandNum=(int) (1+Math.random()*20);

        System.out.println("Guess a Number:");
        int guess=keyboard.nextInt();
        while (guess<firstRandNum&&guess>secondRandNum||guess>firstRandNum&&guess<secondRandNum){
            firstRandNum = (int) (1+Math.random()*20);
            secondRandNum=(int) (1+Math.random()*20);
            System.out.println("Guess a Number:");
            guess=keyboard.nextInt();
            System.out.println(firstRandNum+" "+secondRandNum);
        }
         */

        //Problem 2 A
        /*
        if (n==0){
            doSomethingWith(n);
        }

        if (runTest()!=true){
            doSomethingWith(n);
        }
         */

        //Problem 2 B
       /*
        method1();
        z=method2(x);
        if (x>0){
            x=-x;
        }else{
            x++;
        }
        */

        //Problem 2 C
        /*
       int[] a=new int[9];
       for (int i=0;i<=8;i++){
           a[i]=30+(10*i);
       }
        */
        //Problem 3
        /*
        for (int i=0;i<=20;i++){
            System.out.println("x = "+i+" and f("+i+") = "+(((2*(i*i*i))-i)+1));
        }
        */
        //Problem 6 A
        /*
        for (int i=0; i<5;i++){
            for (int j=0;j<i;j++){
                System.out.println(j+" ");
            }
            System.out.println();
        }

         */
        //This counts up to the number of times the first for loop has been used
        //Problem 6 B
        /*
        for (int i=5; i>=-1;i--){
            for (int j=5;j>i;j--){
                System.out.println(j+" ");
            }
            System.out.println();
        }
         */

        //Problem 6 C
/*
        for (int i=4; i>=0;i--){
            for (int j=5;j>i;j--){
                System.out.print(j);
                System.out.print(0);
            }

                System.out.println();
        }
*/
        //Problem 7
        /*
        Scanner keyboard = new Scanner(System.in);
        for (int i=keyboard.nextInt(); i>=1;i--){
            for (int j=i+1;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
         */

        //Problem 8
/*
        int times=0;
        double firstRandNum = (int) (1+Math.random()*6);
        double secondRandNum=(int) (1+Math.random()*6);
        double thirdRandNum=(int) (1+Math.random()*6);
        while(firstRandNum!=secondRandNum||firstRandNum!=thirdRandNum||thirdRandNum!=secondRandNum||firstRandNum!=3){
            firstRandNum = (int) (1+Math.random()*6);
            secondRandNum=(int) (1+Math.random()*6);
            thirdRandNum=(int) (1+Math.random()*6);
            times++;
           }
        System.out.println("It took "+times+" times");
 */
        //Problem 9 A
        /*
        Scanner keyboard = new Scanner(System.in);
        int guess=keyboard.nextInt();
        while (guess<10||guess>15){
            System.out.println("Wrong, try again:");
            guess=keyboard.nextInt();
        }
        System.out.println("Good Job!");
*/
        //Problem 9 B
        /*
        Scanner keyboard = new Scanner(System.in);
        int guess=keyboard.nextInt();
        while (guess<10||guess>20||guess%2==1){
            System.out.println("Wrong, try again:");
            guess=keyboard.nextInt();
        }
        System.out.println("Good Job!");
*/
        //Problem 10
        /*
        int num=10;
        while (num>2){
            System.out.println("Num is:" + num);
            num--;
            }

         */

    }

    }



