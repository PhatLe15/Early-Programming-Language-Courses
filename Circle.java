/*Lab 6: Classes and Objects*/
//This is the starter file for Lab 6
//empty skeleton file; you should code the fields and methods as per the instructions


import java.awt.*; //required for graphics and Point

public class Circle{
   //2 fields; One is a Point and the other is an int
   private Point center;//center is a variable of type Point
   private int r;//variable by type int        
   
   //Constructs a new circle with a center specified by the given Point and with the given integer radius.
   public Circle(Point initCenter,int initR){
      this.center = initCenter;
      this.r = initR;
   }
   //Returns the circle's center Point.
   public Point getCenter(){
      return this.center;
   }
   //Returns the circle's radius.
   public int getRadius(){
      return this.r;
   }
   //Returns the area occupied by the circle, using the formula pi*r2.
   public double getArea(){
      return this.r*this.r*Math.PI;
   }
   //Returns the circle's circumference (distance around the circle), using the formula 2pir.
   public double getCircumference(){
      return 2*Math.PI*this.r;
   }
   //Returns a string representation of the circle, such as "Circle[center=(75, 20),radius=30]".
   public String toString(){
      return "Circle[center=("+center.x+", "+center.y+ "),radius="+r+"]";
   }
   
   //Draws the circle onto a DrawingPanel, labeling its center point 
   //and drawing an outline of the circle itself.
   public void draw(Graphics g){
   //since the circle is draw based on a rectangle with width and height so it need a diameter not radius
      g.drawOval(center.x-this.r,center.y-r,this.r*2,this.r*2);   
   //drawing a line with the same end points can create a point   
      g.drawLine(center.x,center.y,center.x,center.y);
   }
   
   //Returns whether the given point lies inside the circle.
   public boolean contains (Point p){
      double dx = p.x-center.x;
      double dy = p.y-center.y;
      return (dx*dx + dy*dy) <= this.r*this.r;
   }
      
   
}