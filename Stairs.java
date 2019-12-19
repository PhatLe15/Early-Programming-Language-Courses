/*
CS 145 
Lab 1
April 27th 2016
Phat Le
Program behaviour: print out stickmans standing on every stair with a constant variable.

                        O  *******
                     /|\ *     *
                     / \ *     *
                 O  ******     *
                /|\ *          *
                / \ *          *
            O  ******          *
           /|\ *               *
           / \ *               *
       O  ******               *
      /|\ *                    *
      / \ *                    *
  O  ******                    *
 /|\ *                         *
 / \ *                         *
  ********************************

print back space
stair spaces 5*line      5*line  
---------------------------------------------------------
1     5        5      
2     10       10
3     15       15
4     20       20
5     25       25

print spaces
line spaces -5*line  -5*line+25
---------------------------------------------------------
1     20        -5      
2     15        -10
3     10        -15
4     5        -20
5     0        -25

line  5
5     25  => a =5 => -5*line+5*STAIRS
6     30
*/
public class Stairs {
   public static final int STAIRS = 5;// STAIR is a constant variable
   public static void main(String[] args) {
       // print out 5 stair
      for (int line = 1; line <=STAIRS; line++){
      //print top part of the stick man
         //print leading spaces
         for (int space = 1; space <= -5*line+5*STAIRS; space++){
            System.out.print(" ");
         }
         //print head
         System.out.print("  O  ******");
         // print spaces
         for (int space = 1; space <= 5*line-5; space++){ //because the fist stair does not need back spaces so 5*line-5
            System.out.print(" ");
         }
         //print "*"
         System.out.println("*");
         
      //print middle part of stick man
         // print leading spaces
         for (int space = 1; space <= -5*line+5*STAIRS; space++){
            System.out.print(" ");
         }
         //print body
         System.out.print(" /|\\ *");
         for (int space = 1; space <= 5*line; space++){// print leading spaces
            System.out.print(" ");
         }
         //print "*"
         System.out.println("*");
         
      //print bottom 
         // print leading spaces
         for (int space = 1; space <= -5*line+5*STAIRS; space++){
            System.out.print(" ");
         }
         //print legs
         System.out.print(" / \\ *");
         // print back spaces 
         for (int space = 1; space <= 5*line; space++){
            System.out.print(" ");
         }
         //print "*"
         System.out.println("*");
         
      }
      // print a line of "*" in the last line
      for (int space = 1; space <= 5*STAIRS+7; space++){
            System.out.print("*");
      }
   }//end class
}