/*CS145
lab:1
Date 4/18/2016 */

//Exercise 2: Ch2 Ex14 p130
public class Numbers {
// print 9 times nine
   public static void main(String[] args){
      // print 4 collums
      for (int j = 1; j <= 4; j++){ 
         // loop each number from 9 to 1
         for (int n = 9; n >= 1; n--){
            //print number from 9-1 in a row
            for (int i = 1; i <= n ;i++){
               System.out.print(n);
            }
         }
         System.out.println();
      }
   }
}//end class Numbers
