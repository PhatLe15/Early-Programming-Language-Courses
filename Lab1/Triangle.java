/*CS145
lab:1
Date 4/18/2016 */

//Exercise 1: Ch2 Ex8 p129

/*print "-"
lines    spaces   -1*line    -1*line+ 5 
1        4        -1
2        3        -2 
3        2        -3 
4        1        -4
5        0        -5
//print num
lines    number   
1        1        
2        2        
3        3         
4        4       
5        5        


*/
public class Triangle {
   public static void main(String[] args){
      
      for (int line = 1; line <= 5; line++){     //row control       
         for(int space = 1; space <= -1*line+5 ; space++){  //col control
            System.out.print(" ");
         }
            //loop each number
         for (int num = 1; num <= line; num++){
            System.out.print(line);                      // adding number loops   
         }
         System.out.println();
      }
   }
}//end class
