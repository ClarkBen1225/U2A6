/*
 *                    Ben.C 
 *             Dwayne Paper Scissors
 * Allows the user to play Rock paper scissors against a computer
 */

package dwaynepaperscissors;

import java.util.Scanner;


public class DwaynePaperScissors {
    //Declares global variables for ties wins and loses
        static int lose=0;
        static int wins=0;
        static int ties=0;
        static int option;
        static int opponent; 
    public static void main(String[] args) {
          
        final int OPPONENTROLE = 2;
        Scanner keyedInput = new Scanner (System.in);
        int [] playerChoice = new int [3];
        //Opens a menu for the user to input what role is whats to select
        do{
        System.out.println("------------Rock Paper Scissors----------------");
        System.out.println("Please enter your choice between");
        System.out.println("1....Rock");
        System.out.println("2....Paper");
        System.out.println("3....Scissors");
        System.out.println("4....Exit");
       //Receives the users input
        option = keyedInput.nextInt();
        opponent = opponentChoice(OPPONENTROLE);
        winLose(option);
        }while(option !=4);
    }
        //Has all the possible out comes if the user were to pick rock
    public static void winLose(int n1){
     if(n1==1){
        System.out.println(" You have chosen Rock");
         if(opponent==1){
             System.out.println("Your opponent has chosen Rock");
             System.out.println("You have both chose Rock therefor it is a tie");
             amountTied();
             System.out.println("----------------Score-----------------------");
             System.out.println("Ties: "+ties + " Wins: "+wins + " Loses: " + lose);
         }
         else if(opponent==2){
             System.out.println("Your opponent has chosen Paper");
             System.out.println("Paper beats rock you have lost");
             amountLost();
             System.out.println("----------------Score-----------------------");
             System.out.println("Ties: "+ties + " Wins: "+wins + " Loses: " + lose);

         }
         else if(opponent==3){
         System.out.println("Your opponent has chosen scissors");
         System.out.println("Rock beats scissors you have won!");
         amountWon();
         System.out.println("----------------Score-----------------------");
         System.out.println("Ties: "+ties + " Wins: "+wins + " Loses: " + lose);

     }
     }
     //Has all the possible out comes if the user were to pick paper
     if(n1==2){
         System.out.println(" You have chosen Paper");
         if(opponent==1){
             System.out.println("Your opponent has chosen Rock");
             System.out.println("You have chose Paper and trapped rock therfore you win");
             amountWon();
             System.out.println("----------------Score-----------------------");
             System.out.println("Ties: "+ties + " Wins: "+wins + " Loses: " + lose);
      
         }
         else if(opponent==2){
             System.out.println("Your opponent has chosen Paper");
             System.out.println("Paper cant beat Paper so it is a tie");
             amountTied();
             System.out.println("----------------Score-----------------------");
             System.out.println("Ties: "+ties + " Wins: "+wins + " Loses: " + lose);

         }
         else if(opponent==3){
         System.out.println("Your opponent has chosen scissors");
         System.out.println("Scissors beats paper you have lost");
         amountLost();
         System.out.println("----------------Score-----------------------");
         System.out.println("Ties: "+ties + " Wins: "+wins + " Loses: " + lose);

     }
     }
      //Has all the possible out comes if the user were to pick scissors
      if(n1==3){
         System.out.println(" You have chosen Scissors");
         if(opponent==1){
             System.out.println("Your opponent has chosen Rock");
             System.out.println("You have been smashed by a rock");
             amountLost();
             System.out.println("----------------Score-----------------------");
             System.out.println("Ties: "+ties + " Wins: "+wins + " Loses: " + lose);

         }
         else if(opponent==2){
             System.out.println("Your opponent has chosen Paper");
             System.out.println("Paper gets chopped like fruit ninja");
             amountWon();
             System.out.println("----------------Score-----------------------");
             System.out.println("Ties: "+ties + " Wins: "+wins + " Loses: " + lose);

         }
         else if(opponent==3){
         System.out.println("Your opponent has chosen scissors");
         System.out.println("Scissors has met its match");
         amountTied();
         System.out.println("----------------Score-----------------------");
         System.out.println("Ties: "+ties + " Wins: "+wins + " Loses: " + lose);

     }
     }
      //Closes the do while loop when the number 4 is entered 
    
    }
    /**
     * opponentChoice
     * 
     * This method generates a random number which is then 
     * used as the computers selection between Rock, Paper or Scissors
     * Parameters: n1, The range for the random number generation
     * returns: int
     */
    public static int opponentChoice(int n1){
      int rNumber = (int)Math.round(Math.random()*n1+1);
      return rNumber;
    }
   /**
     * amountWon
     * 
     * This method increases the number of wins whenever called
     * Returns:Void
     */
    public static void amountWon(){
        wins++;
    }
    /**
     * amountTied
     * 
     * This method increases the number of ties whenever called
     * Returns:Void
     */
     public static void amountTied(){
        ties++;
    }
     /**
     * amountLost
     * 
     * This method increases the number of loses whenever called
     * Returns:Void
     */
     public static void amountLost(){
        lose++;
    }
}
    

    
   
