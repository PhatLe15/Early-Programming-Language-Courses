/*
CS 145 
Lab 3
may 3th 2016
Phat Le

*/

import java.util.*;
public class Lab3 {
   public static void main(String[] args){
      //create a single scanner object for all 5 methods
      Scanner console = new Scanner(System.in);
      
      //Ex1: print Square      
      System.out.println("Exercise 1:");
      // get 2 int inputs from the user
      System.out.print("Enter min value: ");
      int min = console.nextInt();

      System.out.print("Enter max value: ");
      int max = console.nextInt();
      
      printSquare(min,max);
      System.out.println();
      
      
      //Exercise 2:
      System.out.println("Exercise 2:");
      
      //input
      System.out.print("Enter collum value: ");
      int row = console.nextInt();

      System.out.print("Enter row value: ");
      int collum = console.nextInt();
      
      printGrid(row,collum);
      System.out.println();

      
      
      //Exercise 3:
      System.out.println("Exercise 3:");
      //input
      System.out.print("Enter a word: ");
      String word = console.next();
      
      System.out.print("Enter the length of the word: ");
      int length = console.nextInt();
      
      padString(word,length);
      System.out.println();
      //since my program got too many inputs so the system might stop after I input exercise 4.One way to make exercise 4 run is to switch the console into the next positon.
      console.nextLine(); 

      //Exercise 4:
      System.out.println("Exercise 4:");
      //input
      System.out.print("Enter a sentence: ");
      String line = console.nextLine();
      
      String reversed = printReverse(line);
      System.out.println();
      
      //Exercise 5:
      System.out.println("Exercise 5:");
      //input
      System.out.print("Enter your full name: ");
      String full = console.nextLine();
      
      processName(full);
   }//end main
   
   
   
   
   //Exercise 1 method
   //takes in two ints, min and max prints the numbers in the range from min to max
      //inclusive in a square pattern
   public static void printSquare(int m ,int n ){
      for (int row = m; row <= n;row ++){
         for (int col = row; col<=n; col++){
            System.out.print(col);
         }
         for (int col = m; col<= row-1; col++){
            System.out.print(col);
         }
         System.out.println();//new line after a row is completed
       }
   }//end method 
   
   //Exercise 2:
   //Write a method named printGrid that accepts two integer parameters rows and cols.
   public static void printGrid(int min , int max){
      for (int col = 1; col<= min; col++){// print collum
         int n = col; 
         for (int row = 1; row <= max; row++){//print row      
            System.out.print(n+" ");
            n = n+min; 
         }
         System.out.println();// after a row to jum into new line
      }      
   }//end method 
   
   //Exercise 3:
   //Write a method padString that accepts two parameters: a String and an integer representing a length. 
   //The method should pad the parameter string with spaces until its length is the given length.
   //Write a method called printReverse that accepts a String as its parameter 
   //and prints the characters in opposite order.   
   public static void padString(String a , int n){
      int j = a.length();
      for (int i = 1; i <= n-j; i++){//loop the space 
         System.out.print(" ");
      }
      System.out.println(a);//then add the word
   }//end method

 //Exercise 4:
 //Write a method called printReverse that accepts a String as its parameter 
 //and prints the characters in opposite order.
   public static String printReverse(String sentence){
      int length = sentence.length();//find the length 
      String opposite = "";
      for (int i = length-1; i >= 0; i--){
         opposite = opposite + sentence.charAt(i);// print the word in opposite using its length as a position
      }
      System.out.println(opposite);
      return sentence;
   }
//Exercise 5:
 //Write a method called printReverse that accepts a String as its parameter 
 //and prints the characters in opposite order.
   public static void processName(String fullname){
      int i = fullname.indexOf(" ");// " " is a string so I cannot put in the substring as an integer-> find it index position first
      String first = fullname.substring(0,i);// find first name in the input
      String last = fullname.substring(i);//find last name in the input
      System.out.print("Your name in reverse order is"+ last +", " + first);//print our fullname in reverse
   }
}
     