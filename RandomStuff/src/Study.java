//import java.util.ArrayList;
//
//class Main {
//    public class WordPair {
//        public String first;
//        public String second;
//
//        public WordPair(String first, String second) {
//            this.first = first;
//            this.second = second;
//        }
//
//        public String getFirst() {
//            return first;
//        }
//
//        public String getSecond() {
//            return second;
//        }
//    }
//
//    public class WordPairList {
//        private ArrayList<WordPair> allPairs;
//
//        public WordPairList(String[] words) {
//            for (int i = 0; i < words.length; i++) {
//                for (int j = i + 1; j < words.length; j++) {
//                    allPairs.add(new WordPair(words[i], words[j]));
//                }
//            }
//        }
//
//        public int numMatches() {
//            int matches = 0;
//            for (int i = 0; i < allPairs.size(); i++) {
//                if (allPairs.get(i).getFirst().equals(allPairs.get(i).getSecond())) {
//                    matches++;
//                }
//            }
//            return matches;
//        }
//    }
//
//
//    public class CodeWordChecker implements StringChecker {
//
//        int min;
//        int max;
//        String check;
//
//        public CodeWordChecker(int min, int max, String check) {
//            this.min = min;
//            this.max = max;
//            this.check = check;
//        }
//
//        public CodeWordChecker(String check) {
//            this.min = 6;
//            this.max = 20;
//            this.check = check;
//        }
//
//        public boolean isValid(String word) {
//            if (word.length() > max || word.length() < min) {
//                return false;
//            }
//
//            for (int i = 0; i < word.length() - check.length(); i++) {
//                if (word.substring(i, i + check.length()).equals(check)) {
//                    return false;
//                }
//            }
//            return true;
//        }
//
//
//    }
//
//
//    public class Seat {
//
//        private boolean available;
//
//        private int tier;
//
//        public Seat(boolean isAvail, int tierNum) {
//
//            available = isAvail;
//
//            tier = tierNum;
//
//        }
//
//        public boolean isAvailable() {
//            return available;
//        }
//
//        public int getTier() {
//            return tier;
//        }
//
//        public void setAvailability(boolean isAvail) {
//            available = isAvail;
//        }
//
//    }
//
//
//    public class Theater {
//
//        private Seat[][] theaterSeats;
//        public int seatPR, tier1rows, tier2rows;
//
//        public Theater(int seatPR, int tier1rows, int tier2rows){
//            this.seatPR=seatPR;
//            this.tier1rows=tier1rows;
//            this.tier2rows=tier2rows;
//
//            theaterSeats = new Seat[tier1rows+tier2rows][seatPR];
//
//            for (int i = 0; i < theaterSeats.length; i++) {
//                for (int j = 0; j < theaterSeats[0].length; j++) {
//
//                    if (i<tier1rows){
//                        theaterSeats[i][j] = new Seat(true,1);
//                    } else {
//                        theaterSeats[i][j] = new Seat(true,2);
//                    }
//                }
//            }
//        }
//
//        public boolean reassignSeat(int fromRow, int fromCol, int toRow, int toCol){
//            if (!theaterSeats[toRow][toCol].isAvailable()){
//                return false;
//            } else{
//                theaterSeats[fromRow][fromCol].setAvailability(true);
//                theaterSeats[toRow][toCol].setAvailability(false);
//                return true;
//            }
//        }
//
//    }
//
//    public class HiddenWord{
//        String target;
//        public HiddenWord(String word){
//            this.target=word;
//        }
//
//        public String getHint(String guess){
//            String hint = "";
//            for (int i = 0; i < target.length(); i++) {
//                for (int j = 0; j < guess.length(); j++) {
//                    if (target.substring(i,i+1).equals(guess.substring(j,j+1))){
//                        hint+=target.substring(i,i+1);
//                    } else if(target.indexOf(guess.substring(j,j+1))<0){
//                        hint+="*";
//                    }else {
//                        hint+="+";
//                    }
//
//
//                }
//            }
//            return hint;
//
//        }
//
//    }
//
//
//
//    public interface NumberGroup{
//        public boolean contains(int num);
//    }
//
//    public class Range implements NumberGroup{
//        public int max, min;
//        public Range(int min, int max){
//            this.max=max;
//            this.min=min;
//        }
//
//        public boolean contains(int num) {
//            if (num>=min&&num<=max){
//                return true;
//            }
//            return false;
//        }
//    }
//
//
//    public class MultipleGroups{
//
//        private ArrayList<NumberGroup> groupList;
//
//        public MultipleGroups(NumberGroup group){
//            groupList.add(group);
//        }
//        public boolean contains(int num) {
//            for (int i = 0; i < groupList.size(); i++) {
//                if (groupList.get(i).contains(num)){
//                    return true;
//                }
//            }
//            return false;
//        }
//    }
//
//
//
//
//
//
//
//
//    public class OnlinePurchaseManager
//    {
//
//        private ArrayList<Gizmo> purchases;
//
//        public boolean hasAdjacentEqualPair(){
//            if (purchases.size()<2){
//                return false;
//            }
//            for (int i = 0; i < purchases.size()-1; i++) {
//                if (purchases.get(i).equals(purchases.get(i+1))){
//                    return true;
//                }
//            }
//            return false;
//        }
//      public Gizmo getCheapestGizmoByMaker(String maker){
//
//          //Saving the cheapest price and index as the first purchase
//          double cheapest = purchases.get(0).getPrice();
//          int cheapIndex = 0;
//          for (int i = 1; i < purchases.size(); i++) {
//              if (purchases.get(i).getPrice()<cheapest){
//
//                  //Setting the new cheapest price and index
//                  cheapest = purchases.get(i).getPrice();
//                  cheapIndex = i;
//              }
//          }
//          return purchases.get(cheapIndex);
//      }
//
//        public int countElectronicsByMaker(String maker){
//            int count = 0;
//            for (int i = 0; i < purchases.size(); i++) {
//                if (!purchases.get(i).getMaker().equals(maker)){
//                    if (purchases.get(i).isElectronic()){
//                        count++;
//                    }
//                }
//            }
//            return count;
//        }
//    }
//
//
//    public class Gizmo
//    {
//        /** Returns the name of the manufacturer of this Gizmo. */
//        public double getPrice(){
//            //this would return the price of the gizmo bought
//            //Now that I am ble to access the price I can see which one is the cheapest
//
//        }
//        public String getMaker()
//        { /* implementation not shown */ }
//        /** Returns true if this Gizmo is electronic, and false
//         otherwise.
//         */
//        public boolean isElectronic()
//        { /* implementation not shown */ }
//        /** Returns true if this Gizmo is equivalent to the Gizmo
//         object
//         * represented by the parameter, and false otherwise.
//         */
//        public boolean equals(Object other)
//        { /* implementation not shown */ }
//        // There may be instance variables, constructors, and methods
//        not shown.
//    }
//
//
//
//
//
//
//
//
//
//    public class CheckDigit {
//        //I would creat a variable here called numTimesIsValidFalse
//        //I would then add an if statement in the isValid method saying that is the return value is false numTimesIsValidFalse++;
//        public static int getCheck(int num)
//        { /* implementation not shown */ }
//
//        public static boolean isValid(int numWithCheckDigit) {
//            int guessnum= numWithCheckDigit%10;
//            int num = numWithCheckDigit/10;
//            return (getCheck(num)==guessnum);
//        }
//    }
//
//
//
//
//
//
//
//
//
//
//}