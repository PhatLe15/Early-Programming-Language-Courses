/*CS145
lab:1
Date 4/18/2016 */

//EXERCISE 3:  [Ch2  | Ex15 |  p130] printDesign.java

/*print "-"
lines    "-"   -1*lines    -1*lines +6
1        5        -1
2        4        -2 
3        3        -3 
4        2        -4
5        1        -5

print number
lines    number   2*lines    2*lines -1
1        1        2             
2        3        4 
3        5        6 
4        7        8
5        9        10

*/
public class printDesign {
   public static void main(String[] args){
      for (int line = 1; line <=5;line++){
      //print "-"
         for (int minus = 1;minus <= -1*line+6;minus++){
            System.out.print("-");
         }
         //print out the number of number in a collum
         for (int num = 1; num <= 2*line-1;num++){
               System.out.print(2*line-1);
            
         }
      //print "-"
         for (int minus = 1;minus <= -1*line+6;minus++){
            System.out.print("-");
         }
         System.out.println();     
      }
   }
}// end class