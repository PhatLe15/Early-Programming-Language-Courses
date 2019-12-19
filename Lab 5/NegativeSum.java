/* Write a method named negativeSum that accepts a Scanner as a parameter 
reading input from a file containing a series of integers, 
and determine whether the sum starting from the first number is ever negative. 
The method should print a message indicating whether a negative sum is possible 
and should return true if a negative sum can be reached and false if not. */

import java.util.*;
import java.io.*;
public class NegativeSum{
   public static void main(String[] args) throws FileNotFoundException{
      Scanner input = new Scanner(new File("num.txt"));
      negativeSum(input);
   }
   
   public static boolean negativeSum(Scanner inp){//set it to boolean to get the return true false value
      int sum = 0;
      int count = 0;//to count the stepp
      
      while (inp.hasNextInt()){
         int next = inp.nextInt();
         sum += next;//adding up to get the total
         count++;
         if (sum<0){// if the sum is negative it start to print out
            System.out.println(sum +" after "+ count+" steps ");
         return true;
         }  //if the sum is negative is just gonna skip this step        
      }//end loop
      System.out.println("no negative sum ");// and print out the statement that there is no negative sum
      return false;
      }//end method  
}//end class


      