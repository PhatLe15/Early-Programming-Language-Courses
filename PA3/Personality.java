/*
CS145
Programming asignment 3
Phat Le
10/06/2016
Keirsey Test
*/

import java.util.*;
import java.io.*;
public class Personality {
   public static final int DIMENSIONS = 4;
   public static void main(String[] args) throws FileNotFoundException {
      //create a console to get input from user
      Scanner console = new Scanner(System.in);
      intro();
      //ask the user for input file 
      System.out.print("input file name? ");
      Scanner input = new Scanner(new File(console.next()));
      //ask user for output file name
      System.out.print("output file name? ");
      PrintStream output = new PrintStream(new File(console.next()));
      test(input,output);
   }  
   //a short intro
   public static void intro(){
      System.out.println("This program processes a file of answers to the Keirsey Temperament Sorter. It converts the various A");
      System.out.println("and B answers for each person into a sequence of B-percentages then into a four-letter personality");
      System.out.println("type.");
      System.out.println();
   }
   //check all the line of the input file
   public static void test(Scanner input,PrintStream output){
      while (input.hasNextLine()){
         String name = input.nextLine();
         output.print(name +":");
         String answer = input.nextLine();
         
         //count A and put in 4 groups
         int[] A = {0,0,0,0} ;//default group for A answer
         int charA = 65;
         int chara = 97;         
         count(A,answer,charA,chara);
         // count B and put in 4 groups
         int[] B = {0,0,0,0} ;//default group for B answer
         int charB = 66;
         int charb = 98;         
         count(B,answer,charB,charb);         
         
         //find the percentage of b and put it in 4 group base on group of answer A and B
         int[] percentOfB = {0,0,0,0};// create a default group to store the percentage of B 
         percentB(A,B,percentOfB);
         output.print("["+percentOfB[0]+", "+percentOfB[1]+", "+percentOfB[2]+", "+percentOfB[3]+"]=") ;// print the percentage of B
         //find personal type 
         String result= type(percentOfB);
         output.println(result); 
         output.println();
      }
   }
   //count the number of B
   public static void count(int [] array,String line,int upper,int lower){
      for (int i = 0; i<70; i+= 7){//divide 70 question into 9 groups of 7( 64 is the starting position of the 9th group)
         for (int j = 0;j<=6;j++){//scan each question from each group 1-7
            if (line.charAt(i+j) == upper || line.charAt(i+j) ==lower){// check if the answer is "A" or "B" or "a" or "b"
            //divide 7 questions into 4 groups of characteristics
            
               if (j == 0){ //The first question in each group is an Extrovert/Introvert question
                  array[0]++;//put it in group 1
                  
               } if (j==1 || j == 2){// check for the next two question Sensing/iNtuition group
                  array[1]++;//put it in group 2
                  
               } if (j==3 || j==4){//The next two questions are for Thinking/Feeling
                  array[2]++;//put it in group 3
                  
               } if (j==5 || j==6){// the final two questions in each group are for Judging/Perceiving
                  array[3]++;//put in group 4
               }
            }
         }//end j loop
      }//end i loops      
   }//end countB method
   
   //find the percentage of B
   public static void percentB(int[] A, int[] B,int[] percent){// doesn't have to count dash
      for (int i= 0; i <DIMENSIONS;i++){//scan through all the position of the group that store the percentage of B
         double percentage = B[i]*100.0/(B[i]+A[i]);//find the percentage of B
         percent[i]= (int)Math.round(percentage);//round the result to the nearest integer and put it in an array
      }
   }
   
   //find the personal type method
   public static String type(int[] percent){
      String result = "";// create an emty String
      //create 2 sides of personality so I can get information 
      String typeA = "ESTJ";
      String typeB = "INFP";
      for (int i = 0;i<DIMENSIONS; i++){
         if (percent[i]>50){//if the percentage of B > 50 choose typeB for each i position
            result += typeB.charAt(i);
         } else if(percent[i]<50){//if it's lower use typeA
            result += typeA.charAt(i);
         }else {//if it equal 50/50 
            result += "X";
         }
      }//end loops
      return result;
   }//end type method 
             
}//end class   
      
