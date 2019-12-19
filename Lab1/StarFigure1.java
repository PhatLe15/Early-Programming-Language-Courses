/*CS145
lab:1
Date 4/18/2016 */

//EXERCISE 4:  [Ch2  | Ex20 |  p131] StarFigure1.java
/*
/*print "/"
lines    "/"   -4*lines    -4*lines +20
1        16        -4
2        12        -8 
3        8        -12 
4        4        -16
5        0        -20

/*print "*"
lines    "*"   8*lines    8*lines-8
1        0        8
2        8       16 
3        16       24 
4        24       32
5        42       40

*/

public class StarFigure1 {
   public static void main(String[] args){
      //print for collum   
      for (int line = 1; line<=5; line++){
         //print "/"
         for (int up = 1; up<= -4*line +20;up++){
            System.out.print("/");
         }
         //print "*"
         for (int star = 1; star<= 8*line-8; star++){
            System.out.print("*");
         }
         //print "\" is similar to "/" just change the print out put from "/" to "\"
         for (int up = 1; up<= -4*line +20;up++){
            System.out.print("\\");
         }

         System.out.println();
      }
   }
}// end class