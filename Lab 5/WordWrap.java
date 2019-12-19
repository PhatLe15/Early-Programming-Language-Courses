/* Write a method called wordWrap 
that accepts a Scanner representing an input file as its parameter 
and outputs each line of the file to the console, 
word-wrapping all lines that are longer than 60 characters. 
For example, if a line contains 112 characters, 
the method should replace it with two lines: one containing the first 60 characters 
and another containing the final 52 characters. 
A line containing 217 characters should be wrapped into four lines: three of length 60 
and a final line of length 37.*/

import java.util.*;
import java.io.*;
public class WordWrap {
   public static void main(String[] args) throws FileNotFoundException{
      Scanner input = new Scanner(new File("word.txt"));// my String gonna go to the next line after "0" since it is  the character 60th
      wordWrap(input);
   }
   
   public static void wordWrap(Scanner inp){
      
      while (inp.hasNext()){
         String content = inp.nextLine();// take all the contain in the file and store it in a String
         int length = content.length();//find the whole length of it
         if (content.length() <= 60){//if it smaller than 60 characters just print the whole thing
            System.out.println(content);
         } 
         else{ //when my string got more than 60 characters
            for(int character = 0;character < length;character++){
               if((character % 60) == 0 && character!= 0){// when it hits the character 60th , the string jump to another line
                  System.out.println();// for it to jump to a new line
                  System.out.print(content.charAt(character));//print out the character
               } else{
                     System.out.print(content.charAt(character));//print out character
                  }                           
            }//end for loop
         }
      }//end while loop
   }//end method
}//end class
         
         
         
         
         

            