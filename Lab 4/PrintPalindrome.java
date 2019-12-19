/*BJP3 Exercise 4.16: printPalindrome
Write a method called printPalindrome that accepts a Scanner for the console as a parameter, 
and prompts the user to enter one or more words and prints whether the entered String is a palindrome 
(i.e., reads the same forwards as it does backwards, like "abba" or "racecar"). 
If the following Scanner object were declared:

Scanner console = new Scanner(System.in);
printPalindrome(console);
*/

import java.util.*;
public class PrintPalindrome {
   public static void main(String[] args){
      Scanner console = new Scanner(System.in);     
      // get inputs from the user
      System.out.print("Type one or more words: ");
      String word = console.nextLine();
      
      printPalindrome(word);
   }
      
   public static void printPalindrome(String sentence){
      int length = sentence.length();//find the length 
      String opposite = "";      
    
      
      for (int i = length-1; i >= 0; i--){
         opposite = opposite + sentence.charAt(i);// print the word in opposite using its length as a position
      }
      if (sentence.equals(opposite)){// run if the oppostie equal to sentence
         System.out.print(sentence+" is a palindrome!");
      } else{
         System.out.print(sentence+" is not a palindrome!");
      }
   }//end method
}//end class      
