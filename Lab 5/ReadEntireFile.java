/* Write a method named readEntireFile 
that accepts a Scanner representing an input file as its parameter, 
then reads that file and returns the entire text contents of that file as a String.*/

import java.util.*;
import java.io.*;
public class ReadEntireFile {
   public static void main(String[] args) throws FileNotFoundException{
      Scanner input = new Scanner(new File("file.txt"));
      readEntireFile(input);
   }//end main
   
   public static void readEntireFile(Scanner inp){
      while (inp.hasNext()){
         String word = inp.nextLine();//need to use nextLine to print out white spaces also
         System.out.println(word);//print out the whole thing
      }//end loops
      
   }//end method
}//end class
         
      
   