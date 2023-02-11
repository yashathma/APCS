//import java.util.ArrayList;
//
//public class AP_Test {
//
////476Z9Y05
////Y.A.
//
//    public class Airport {
//        public double getTotalrevenue(ArrayList<Flight> flights){
//            double total = 0;
//            for (int i = 0; i < flights.size(); i++) {
//                double price = flights.get(i).getPrice();
//
//                if (flights.get(i).getNumPassengers()>flights.get(i).getCapacity()){
//                    total+=price*flights.get(i).getCapacity();
//                }else {
//                    total+=price*flights.get(i).getNumPassengers();
//                }
//
//            }
//
//            return total;
//        }
//
//        public int updateFlights(ArrayList<Flight> flights){
//            int count = 0;
//            for (int i = 0; i < flights.size(); i++) {
//                if (flights.get(i).getCapacity()*0.2>flights.get(i).getNumPassengers()){
//                    count+=flights.get(i).getNumPassengers();
//                    flights.remove(i);
//                }
//            }
//            return count;
//
//        }
//
//        public Flight getMostLuggageCapacity(ArrayList<Flight> flights){
//            //I would need to add a variable in the flight class called amountOfLuggage
//            //This would then be set to the luggage amount which would be specified in the constructor of Flight
//            //Lastly, I would need to add a method called getLuggageStorage which would return the amount of luggage a flight can hold
//            //Using that information along with an input of a list of flights you can then use a loop to iterate over all the flights to check which flight can hold the most. This would be done in the getMostLuggageCapacity method in the airport class.
//
//        }
//
//    }
//
//
//
//
////476Z9Y05
////Y.A.
//
//    public class GradeAnalysis{
//
//        public static double gradeSimulation(){
//            double total = 0;
//            double count = 0;
//            while(true){
//                double grade = getGrade();
//                if (grade>=90){
//                    total++;
//                }
//                count++;
//                if (grade==-1){
//                    break;
//                }
//            }
//            return total/count;
//
//        }
//
//        //You would first need to create a variable in the GradeAnalysis class called maxGrade to store the value
//        //Next in the gradeSimulation method after you get the grade and store it to the variable "grade" you will need to check to see if it is greater than max grade which would originally be -1
//        //Since getGrade always gives you a grade at least once before giving a negative 1 even if the grade is 0 that will be saved as its maximum grade
//        //If the grade is greater than the max grade you will save it as the new max grade and ignore it if it is smaller
//
//    }
//
//
//}
