/*BJP3 Exercise 4.18: wordCount
Write a method called wordCount that accepts a String as its parameter 
and returns the number of words in the String.
A word is a sequence of one or more nonspace characters 
(any character other than ' ').*/

import java.util.*;
public class WordCount{
   public static void main(String[] args){
      Scanner console = new Scanner(System.in);     
      // get inputs from the user
      System.out.print("Type a sentence: ");
      String sentence = console.nextLine();
      
      wordCount(sentence);
   }
   
   public static void wordCount(String line){
      int count = 0;
      if(line.equals(" ")){// count 0 if the sentence is a " "
         count = 0;
         }
      else{
         count = 1;// the condition can only count from the second number so we have to add 1 at first
         for (int i = 1; i < line.length();i++){
            if(line.charAt(i) == 32 && line.charAt(i-1)!= 32){// count if the position if a space and the next posititon is not a space
               count++;
            }       
         }
      }
      System.out.print("There are " + count+ " words!");//print out t
   }
}  
        