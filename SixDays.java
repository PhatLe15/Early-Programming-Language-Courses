/* Phat Le
CS145, Spring 2016
Programing Assignment#1, 4/19/2016
This program is created to run the song "Six Days of Xmas" 
*/
public class SixDays {
   public static void main(String[] args){
      System.out.println("On the 1st day of \"Xmas\", my true love sent to me");
      DayOne();
      System.out.println("On the 2nd day of \"Xmas\", my true love sent to me");      
      VerseTwo();
      System.out.println("On the 3rd day of \"Xmas\", my true love sent to me");      
      VerseThree();
      System.out.println("On the 4th day of \"Xmas\", my true love sent to me");      
      VerseFour();
      System.out.println("On the 5th day of \"Xmas\", my true love sent to me");      
      VerseFive();
      System.out.println("On the 6th day of \"Xmas\", my true love sent to me");      
      VerseSix();
      

   }
// create static method for all the six repeated lyrics.
// all need comma except DayOne() 
   public static void DayOne() {
      System.out.println("a patridge in a pear tree.");
      System.out.println(); // create to skip line after every verse of the song.
   }
   public static void DayTwo() {
      System.out.println("two turttle dove, and"); // "and" only appear after "two turttle dove" so I can put it in DayTwo()
   }
   public static void DayThree() {
      System.out.println("three French hens,");
   }
   public static void DayFour() {
      System.out.println("four calling birds,");
   }
   public static void DayFive() {
      System.out.println("five golden ring,");
   }
   public static void DaySix() {
      System.out.println("six gees a-laying,");
   }
// create static method for six verses
// does not need to create VerseOne() since it is similar to DayOne()
   public static void VerseTwo(){ 
      DayTwo();
      DayOne();
   }
   public static void VerseThree() {
      DayThree();
      DayTwo();
      DayOne();
   }
   public static void VerseFour() {
      DayFour();
      DayThree();
      DayTwo();
      DayOne();
   }
   public static void VerseFive() {;
      DayFive();
      DayFour();
      DayThree();
      DayTwo();
      DayOne();
   }
   public static void VerseSix() {
      DaySix();
      DayFive();
      DayFour();
      DayThree();
      DayTwo();
      DayOne();
   }
}


