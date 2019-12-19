/*
Programming assignment2
Date: 30/5/2017
Phat Le
 
This assignment will give you practice with while loops and pseudorandom numbers.  
You are going to write a program that allows the user to play a simple guessing game 
in which your program thinks up an integer 
and allows the user to make guesses until the user gets it right.  
For each incorrect guess you will tell the user whether the right answer is higher or lower.  
Your program is required to exactly reproduce the format 
and behavior of the log of execution at the end of this write-up.
*/
import java.util.*;
public class Guess {
   public static final int LIMIT = 100;
   public static void main (String[] args){
      Scanner console = new Scanner(System.in);
      intro();
      int [] game = {0,0};// position 0 is bestgame and 1 is the total guess 
      play(game);
      int totalguess = game[1];//to count the number of guesses on the first game you played
      System.out.print("Do you want to play again? ");
      String ans = console.next();
      int countgames = 1;//count the game you played
      int countguessagain = 0;//count the guess on the other time
      while (ans.charAt(0) == 'Y' || ans.charAt(0) == 'y'){
            System.out.println();
            System.out.println();
            play(game);
            countguessagain += game[1];// count the total guess in all other games
            System.out.print("Do you want to play again? ");
            ans = console.next();
            countgames++;
      }
      totalguess += countguessagain;//sum up all the guess
      System.out.println();
      System.out.println();
      result(countgames,totalguess,game[0]);
   }
   
   //print out the introduction
   public static void intro(){
      System.out.println("This program allows you to play a guessing game.");
      System.out.println("I will think of a number between 1 and");
      System.out.println(LIMIT+" and will allow you to guess until you get it.");//if the LIMIT change it still right
      System.out.println("For each guess, I will tell you");
      System.out.println();
      System.out.println("whether the right answer is higher or lower");
      System.out.println("than your guess.");
      System.out.println();
      System.out.println();
   }
   
   
    public static void play(int [] array){// I use array because I need to return 2 variables, one is the best game and the other is the total guess
        System.out.println("I'm thinking of a number between 1 and "+LIMIT+ "...");
        Scanner console = new Scanner(System.in);
        Random r = new Random();
        
        int num = r.nextInt(LIMIT)+1;
        System.out.println("number generated = " +num);
        
        System.out.print("Your guess? ");//priming the loop
        int guess = console.nextInt();
        int count = 1; 
        int totalguess =0;
        int bestgame=0;
        while(num !=guess){//loop until I guess the right answer
            if (num < guess){//if it's lower
               System.out.println("It's lower");
            } else if(num > guess){//if it's higher
               System.out.println("It's higher");
            }   
            System.out.print("Your guess?: ");
            guess = console.nextInt();
            count++;// count time that you guess                                              
        }
        
        // I need 'If' statment incase that we guess it right for the first attempt
        if (count !=1){
            System.out.println("You got it right in " + count + " guesses");
        } else{
            System.out.println("You got it right in 1 guess");
        }
        
        //find the total guess
        totalguess +=count;
        
        //find the best game 
        if (bestgame < count){
            bestgame = count;
        }
               
        //put them all in an array so it can return 2 variables.
        array[0] = bestgame;// the position 0 is the best game 
        array[1] = totalguess;// the position 1 is the totalguess
        //return totalguess;
        
        
   }
   
  
  //print out the overall results. 
   public static void result(int a,int b,int c){
      System.out.println("Overall results:");
      System.out.println("    totalgames    = "+ a);
      System.out.println("    total guesses = "+ b);
      System.out.printf("%19s %.1f %n","guesses/game  =",(double) b/a);
      System.out.println("    best game     = "+ c); 
   }

}   