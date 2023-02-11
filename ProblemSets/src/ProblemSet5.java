
import java.util.Random;
import java.util.ArrayList;
import java.util.*;

import static java.util.Arrays.sort;


public class ProblemSet5 {

    public static void main(String[] args) {
        //Problem 0 A
        /*
        Random rand= new Random(10);
        int array[]=new int [1000];
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]= rand.nextInt(11));
        }
        */
        //Problem 0 B
        //Other class

        //ProblemSet 1
        /*
        int array[]={2,3,4,5,6,7,8,9,10,11,12,13,14};
        int cards=0;
        for(int i=0;i<array.length;i++){
            cards=cards+4;
        }
        System.out.println(cards);
         */
        //Problem 2
        /*
String[] adj={"crazy","weird","cool","fun","sweet","charming"};
String[] names={"Ben","Dominic","Zain","Yash","Misha","Eric","John"};
for(int i=0;i<100;i++){
    Random rand=new Random();
    System.out.println(names[rand.nextInt(6)]+" the "+adj[rand.nextInt(5)]);
}
         */
        //problem 3
//It will only say if it was found not if it was not found
        /*
        Random rand = new Random();

        int array[] = new int[rand.nextInt(100)];
        int answer = 7;
        int high = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        sort(array);
        System.out.println();
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        binarySearch(array, 0, high, answer);
         */

        //Problem 4
        //In this code you are trying to order the code from smallest to biggest
        /*
        int mid = (low + high)/2;
        while( low <= high ){
            if ( arr[mid] < answer ){
                low = mid + 1;
            }else if ( arr[mid] == answer ){
                System.out.println("Element is found on index: " + mid);
                break;
            }else{
                high = mid - 1;
            }
            mid = (low + high)/2;
        }
        if ( low > high ){
            System.out.println("Element was not found!");
        }
*/

        //Problem 5
        /*
        int array[]= {1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+", ");
        }
        System.out.println();
        shuffle(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+", ");
        }
         */
        //Problem 6 A
        /*
        Random rand= new Random();

        int nums[]=new int [rand.nextInt(10)];
        for(int i=0;i<nums.length;i++) {
            nums[i]=rand.nextInt(100);
            System.out.print(nums[i]+", ");
        }
        System.out.println();
        System.out.println();
        boolean oneOrThree=contains1or3(nums);
        if(oneOrThree==true){
            System.out.println("1 or 3 was found in the array");
        }else if(oneOrThree==false){
            System.out.println("1 or 3 was not found in the array");
        }
        
         */


        //Problem 7
/*
        int arrayOne[] = { 3, 5, 8, 5, 2 };
        int arrayTwo[] = { 2, 3, 5, 5, 2 };

        if (areEqual(arrayOne, arrayTwo))
            System.out.println("They are equal");
        else
            System.out.println("They are not equal");
        */
    }

    private static boolean contains1or3(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if (nums[i]==3||nums[i]==1) {
                return true;
            }
        }
        return false;
    }

    private static void binarySearch(int[] array, int i, int high, int answer) {
        int temp = 0;
        for (i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }

    public static boolean areEqual(int arrayOne[], int arrayTwo[]) {
        int sizeOfArrayOne = arrayOne.length;
        int sizeOfArrayTwo = arrayTwo.length;

        if (sizeOfArrayOne != sizeOfArrayTwo)
            return false;

        sort(arrayTwo);
        sort(arrayOne);

        for (int i = 0; i < sizeOfArrayOne; i++)
            if (arrayOne[i] != arrayTwo[i])
                return false;

        return true;
    }

}




/*
//Problem 7
	// Realized that you can import sorting method after I wrote the code so I just
	// used the imported one
	// however,I decided to put my sorting code so you can see it

	private static void sort(int[] arrayOne) {
		int temp = 0;
		for (int i = 0; i < arrayOne.length; i++) {
			for (int j = 0; j < arrayOne.length - 1; j++) {
				if (arrayOne[j] > arrayOne[j + 1]) {
					temp = arrayOne[j];
					arrayOne[j] = arrayOne[j + 1];
					arrayOne[j + 1] = temp;
				}
			}
		}
	}

	private static void sort2(int[] arrayTwo) {
		int temp = 0;
		for (int i = 0; i < arrayTwo.length; i++) {
			for (int j = 0; j < arrayTwo.length - 1; j++) {
				if (arrayTwo[j] > arrayTwo[j + 1]) {
					temp = arrayTwo[j];
					arrayTwo[j] = arrayTwo[j + 1];
					arrayTwo[j + 1] = temp;
				}
			}
		}
*/




