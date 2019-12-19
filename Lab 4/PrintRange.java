/*BJP3 Exercise 4.6: printRange
Write a method called printRange that accepts two integers as arguments
and prints the sequence of numbers between the two arguments, 
separated by spaces. Print an increasing sequence 
if the first argument is smaller than the second; otherwise, print a decreasing sequence.
If the two numbers are the same, that number should be printed by itself.
2 3 4 5 6 7 
19 18 17 16 15 14 13 12 11 
5 
 */
import java.util.*;
public class PrintRange{
   public static void main(String[] args){
      Scanner console = new Scanner(System.in);
       // get 2 int inputs from the user
      System.out.print("Enter the first value: ");
      int first = console.nextInt();

      System.out.print("Enter the second value: ");
      int second = console.nextInt();
      printRange(first,second);
   }
   
   public static void printRange(int a, int b){
      if (a<b){//count from a to b 
         for(int i = a; i <= b ; i ++){
            System.out.print(i+" "); 
         }
         
      } else {//count from b to a if a>b
         for(int i = a; i >= b ; i--){ 
            System.out.print(i+" ");
         }
      }      
   }//end method
}//end class