import javax.swing.JOptionPane;
public class Snake {
    public static void main(String[] args) {
        //setting variables
        int playerTotal=0;
        int compTotal=0;
        int turn=1;
        int turnscore;
        int maxscore=100;
        String HoldOrRoll;
        while(playerTotal<maxscore && compTotal<maxscore) { //<----game loop
            //Player 1
            while (turn==1) {
                HoldOrRoll=JOptionPane.showInputDialog("Player 1, Would you like to hold or roll?");
                //if you hold
                if(HoldOrRoll.equals("hold")){
                    turn=2;
                    System.out.println("Player 1 score is "+playerTotal);
                //if you roll
                }else if(HoldOrRoll.equals("roll")){
                    turnscore=roll();
                    playerTotal+=turnscore;
                    if(turnscore<=1){
                        turn=2;
                    }
                    if (turnscore==0){
                        System.out.println("You rolled 1 and 1");
                        playerTotal=0;
                    }
                    System.out.println("Player 1 score is "+playerTotal);
                    System.out.println("You get to play again");
                }
                if(playerTotal>=maxscore){
                    break;
                }
            }
            //This makes sure that if player one wins in its round player 2 does not get to play during this loop
            if(playerTotal>=maxscore){
                break;
            }



//Player 2
            while (turn==2) {
                HoldOrRoll=randomchoice();
                if(HoldOrRoll.equals("roll")){
                    System.out.println("Player 2 has rolled");
                }else if(HoldOrRoll.equals("roll")){
                    System.out.println("Player 2 has held");
                }
                if(HoldOrRoll.equals("hold")){
                    turn=1;
                    System.out.println("Player 2 has held");
                    System.out.println("Player 2 score is "+compTotal);
                }else if(HoldOrRoll.equals("roll")){
                    turnscore=roll();
                    compTotal+=turnscore;
                    if(turnscore<=1){
                        turn=1;
                    }
                    if (turnscore==0){
                        System.out.println("Player 2 rolled 1 and 1");
                        compTotal=0;
                    }
                    System.out.println("Player 2 score is "+compTotal);
                    System.out.println("Sorry player 2 gets to play again");
                }
                if(compTotal>=maxscore){
                    break;
                }
            }

        }
        //this checks who won and says it
        if(playerTotal>=maxscore){
            System.out.println("You Won!");
        } else if(compTotal>=maxscore){
            System.out.println("Sorry The Computer Won");
        }
    }

    private static String randomchoice() {
        // is just a rondom choise for if player 2 holds or plays
        int randomnum=(int)(Math.random()*6+1);
        if(randomnum>=4){
            return "hold";
        }else{
            return "roll";
        }

    }

    private static int roll() {
        //This is the roll
        int die1=(int)(Math.random()*6+1);
        int die2=(int)(Math.random()*6+1);
        System.out.println("die 1: "+die1+" die 2: "+die2);

        //This is all the weird rules for the dice
        if (die1==1 && die2!=1) {
            return 1;
        } else if (die1!=1 && die2==1) {
            return 1;
        } else if (die1==1 && die2==1) {
            return 0;
        } else if (die1==die2){
            return 2*(die1+die2);
        } else {
            return die1+die2;
        }

    }
}
