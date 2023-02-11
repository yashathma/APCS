


import java.util.ArrayList;

    public class SeveralRandomIntegers {


        public static ArrayList<Integer> makeRandomInts( int count, int max ) {
            if (count > max) {
                throw new IllegalArgumentException("Can't have " + count +
                        " different integers in the range  1 to " + max);
            }
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            while (numbers.size() < count) {
                int num = (int)(Math.random()*max) + 1;
                if ( numbers.indexOf(num) == -1 )
                    numbers.add( num );
            }
            return numbers;
        }

        private static void printList( ArrayList<Integer> numbers ) {
            System.out.print("    [ ");
            for (int i = 0; i < numbers.size(); i++) {
                if (i > 0)
                    System.out.print(", ");
                System.out.print( numbers.get(i) );
            }
            System.out.println(" ]");
        }

        public static void main(String[] args) {
            System.out.println("1000 integers chosen from the range 1 to 100:");
            for (int i = 0; i < 800; i++)
                printList( makeRandomInts(10,100) );
            System.out.println();
            System.out.println("10 integers chosen from the range 1 to 10:");
            for (int i = 0; i < 3; i++)
                printList( makeRandomInts(10,10) );
            System.out.println();
            System.out.println("25 integers chosen from the range 1 to 10000:");
            printList( makeRandomInts(25,1000) );
            System.out.println();
            System.out.println("End with an exception!");
            makeRandomInts(10,9);
        }

    }







