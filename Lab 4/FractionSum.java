/*BJP3 Exercise 4.1: fractionSum
In other words, the method should generate the following sequence:

1 + (1/2) + (1/3) + (1/4) + (1/5) + ...
*/
import java.util.*;
public class FractionSum{
   public static void main(String[] args){
      Scanner console = new Scanner(System.in);
      // get inputs from the user
      System.out.print("please enter a number: ");
      int num = console.nextInt();
      
      double result = fractionSum(num);
      System.out.println(result);
   }
   
   public static double fractionSum(int n){
      double sum = 0.0;
      for(int i = 1; i <=n; i ++){
         sum += 1.0/i;// 1 need to be double 
      }
      return sum;
      
   }//end method
}//end class