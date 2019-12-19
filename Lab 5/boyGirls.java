//exercise 6 :Boygirls
import java.util.*;
import java.io.*;

public class boyGirls{
   public static void main(String[] args) throws FileNotFoundException{
      Scanner input = new Scanner(new File("tas.txt"));
      boyGirl(input);
   }//end main
   public static void boyGirl(Scanner inp){
      int boysTotal = 0;
      int boysNumTotal = 0;
      int girlsTotal = 0;
      int girlsNumTotal = 0;
      boolean boys = true;
      while (inp.hasNext()){
         if (boys){//just let it statement to be true to get in the condition 
            inp.next(); //to pick the number instead of name           
            boysNumTotal += inp.nextInt();
            boysTotal++;
            boys = !boys;// changing the true statement to find the girlsTotal
         } else {
            inp.next();           
            girlsNumTotal += inp.nextInt();
            girlsTotal++;
            boys = !boys;
         }
      }//end loops
      System.out.println(boysTotal + "boys, " + girlsTotal + "girls");
      System.out.println("difference between boys' and girls' sums: " + Math.abs(boysNumTotal - girlsNumTotal));
   }//end method
}//end class 