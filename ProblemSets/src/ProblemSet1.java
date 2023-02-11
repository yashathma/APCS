import java.util.Scanner;

public class ProblemSet1 {
    public static void main(String[] args) {
        /*

        //Program 1
     //Creating Variables
        Scanner keyboard = new Scanner(System.in);
        double radius;
        double circumference;
        double area;
     //Asking for radius to do math
        System.out.println("What is your radius?");
        radius = keyboard.nextDouble();
     //Using the radius to find the circumference and area
        circumference = 2*Math.PI*radius;
        area = Math.PI*radius*radius;
     //Writing out what the circumference and area is
        System.out.println("Your circumference is "+ circumference +" and your area is "+area);

        */

/*
        //Program 2 A
        Scanner keyboard = new Scanner(System.in);
        double side1;
        double side2;
        double side3;

        //Asking what the sides are
        System.out.println("Side 1:");
        side1 = keyboard.nextDouble();
        System.out.println("Side 2:");
        side2 = keyboard.nextDouble();
        System.out.println("Side3:");
        side3 = keyboard.nextDouble();

        //Calling the Math method (doing math)
        double area;
        area = heronsmethod(side1, side2, side3);
        System.out.println("The area of that triangle is " + area);
*/

/*
        //Program 2 B
        //Creating Variables
        Scanner keyboard = new Scanner(System.in);
        double side1;
        double side2;
        double side3;
        //Asking what the sides are
        System.out.println("Side 1:");
        side1 = keyboard.nextDouble();
        System.out.println("Side 2:");
        side2 = keyboard.nextDouble();
        System.out.println("Side3:");
        side3 = keyboard.nextDouble();
        //Math for the S value
        double othernumber;
        othernumber = (side1 + side2 + side3) / 2;
        //Math for the area using the S value
        double area;
        area = Math.sqrt(othernumber * (othernumber - side1) * (othernumber - side2) * (othernumber - side3));
        //Writing to the user what the area is
        System.out.println("The area of that triangle is " + area);
*/

/*
        //Program 3
        Scanner keyboard = new Scanner(System.in);
        double temp;
        double mph;
        double windchill;
        System.out.println("Temperature:");
        temp = keyboard.nextDouble();
        System.out.println("Wind Speed in Miles Per Hour:");
        mph = keyboard.nextDouble();
        windchill = Windchillcalc(temp, mph);
        if (windchill != 0) {
            System.out.println("The wind chill is " + windchill);
        }

 */

/*
        //Program 4
        int counter = 1;
        while (counter <= 20) {
            int randomnum = (int) (Math.random() * 6 + 1);
            int randomnum2 = (int) (Math.random() * 6 + 1);
            System.out.println("Die 1: " + randomnum + " Die 2: " + randomnum2 + " Sum: " + (randomnum + randomnum2));
            counter++;
        }
*/

    }

    //Program 3 Method
    public static double Windchillcalc(double temp, double mph) {
        double windchill;
        if (3 < mph && mph < 120 && -50 < temp && temp < 50) {
            windchill = 35.74 + (0.6215 * temp) + ((0.4275 * temp) - 35.75) * Math.pow(mph, 0.16);
            return windchill;
        } else if (mph < 3 || mph > 120 && -50 > temp || temp > 50) {
            System.out.println("The temperature must be between -50 and 50 degrees fahrenheit and The speed of the " +
                    "wind must be between 3 and 120 miles/hour");
            windchill = 0;
            return windchill;

        } else if (mph < 3 || mph > 120 && -50 < temp && temp < 50) {
            System.out.println("The speed of the wind must be between 3 and 120 miles/hour");
            windchill = 0;
            return windchill;
        } else if (3 < mph && mph < 120 && -50 > temp || temp > 50) {
            System.out.println("The temperature must be between -50 and 50 degrees fahrenheit");
            windchill = 0;
            return windchill;
        }
        windchill = 0;
        return windchill;

    }

    //Program 2 A Method
    public static double heronsmethod(double side1, double side2, double side3) {

        //Math for the S value
        double othernumber;
        othernumber = (side1 + side2 + side3) / 2;
        //Math for the area using the S value
        double area;
        area = Math.sqrt(othernumber * (othernumber - side1) * (othernumber - side2) * (othernumber - side3));
        return area;
    }


}
