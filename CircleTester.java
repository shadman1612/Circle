package circle;
import java.util.ArrayList;

public class CircleTester 
{
   public static void main(String[] args)
   {
	   // Create a new circle object called c
	   // i.e. c is a reference variable that "points to" the circle object
	   // Use the default constructor i.e. no parameters
     
	   Circle c = new Circle();
       
	   // Use the getDescription() method of class Circle and print out the data stored in c 
	   // Expected Output: Circle[Radius = 1.0 X = 0 Y = 0]
	   System.out.println(c.getDescription());
	   
	   // Print the string "Area = " and then get and print the area of circle c using the 
	   // instance method getArea() in class Circle
	   // Expected: Area = 3.141593
	   System.out.println("Area = "+c.getArea());
	   
	   // Get and then print the area of a circle with radius 10.0 using class Circle's static method getArea()
	   // Print out "Area using static method =" followed by the area
	   // Expected: Area using static method = 314.1593
	   System.out.println("Area using static method ="+c.getArea(10.0));
	   
	   // Create an ArrayList of Circle object references
	   // You will need to import java.util.ArrayList
	   ArrayList<Circle> circleAr = new ArrayList<Circle>();
	   
	   // Add the c circle object to the array list (using the add method of class ArrayList) and
           circleAr.add(c);
	   // then create 4 more new circle objects, add each to the array list
           Circle d = new Circle(x=2, y=3, radius = 4.0);
           circleAr.add(d);
           Circle e = new Circle(x=4, y=7, radius = 9.0);
           circleAr.add(e);
           Circle f = new Circle(x=6, y=5, radius = 3.0);
           circleAr.add(f);
           Circle g = new Circle(x=0, y=8, radius = 2.0);
           circleAr.add(g);
	   // Use the following circle parameters:
	   // x=2,y=3, radius = 4.0
	   // x=4,y=7, radius = 9.0
	   // x=6,y=5, radius = 3.0
	   // x=0,y=8, radius = 2.0
	   
	   
	   // Print a message "Number of Circles = " followed by the number of circle objects by calling the 
	   // static method getNumCircles() of class Circle
	   // Expected output: "Number of Circle = 5"
	  System.out.println("Number of Circles = " + Circle.getCircleNum());
	   
	   // Use a for loop and print out the data stored in the 5 circle objects, one circle per line
           for(int i=0; i<5; i++){
           System.out.println(circleAr(i));
           }
	   // Expected Output:
	   // Circle[Radius = 1.0 X = 0 Y = 0]
	   // Circle[Radius = 4.0 X = 2 Y = 3]
       // Circle[Radius = 9.0 X = 4 Y = 7]
       // Circle[Radius = 3.0 X = 6 Y = 5]
       // Circle[Radius = 2.0 X = 0 Y = 8]
	   
   }
}

