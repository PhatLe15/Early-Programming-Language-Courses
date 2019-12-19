/*CS145
lab:1
Date 4/18/2016 */

//EXERCISE 5:  [Ch2  | Ex21 |  p131] : StarFigure2.java

/*print "-"
lines    "/"   -4*lines    -4*lines +a => -4*line +4*LINES
1        16        -4
2        12        -8 
3        8        -12 
4        4        -16
5        0        -20      

5     a= 20
6     a = 24 => 4
7     a = 28
*/

public class StarFigure2 {
   public static final int LINES = 7; //declares a constant call LINES
   public static void main(String[] args){
      //print for collum   
      for (int line = 1; line <= LINES; line++){
         //print "/"
         for (int up = 1; up <= -4*line+4 * LINES; up++){
            System.out.print("/");
         }
         //print "*"
         for (int star = 1; star <= 8*line-8; star++){
            System.out.print("*");
         }
         //print "\" is similar to "/" just change the print out put from "/" to "\"
         for (int up = 1; up<= -4*line+4*LINES ; up++){
            System.out.print("\\");
         }

         System.out.println();
      }
   }
}// end class