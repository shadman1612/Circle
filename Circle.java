package circle;
// This class defines a circle
public class Circle 
{
   // Create a public constant of type double called PI, initialize it to 3.141593
	public static final double PI = 3.141593;
   
   // Create two private integer variables, one called x and one called y. 
   // These will store the center of the circle
	private int x, y;
   
   // Create a private double variable called radius
	private double radius;
   
   // Create a private static integer variable called numCircles and initialize it to 0
   // This variable will keep a count of the number of Circle objects created
	private static int numCircles;
   
   
   // Create a default constructor method with no parameters that initializes instance variables
   // x and y above to 0 and radius to 1.0
   // Don't forget to increment the numCircles variable
	public Circle(){
	x=0; y=0;
	radius = 1.0;
	numCircles++;
	}
   
   
   // Create a constructor method that takes two integer parameters, one to set instance variable x and
   // one to set instance variable y. Set the radius instance variable to 1.0
   // One way to do this is to use the "this" keyword and first call the default constructor method
   // above and then set instance variables x,y using the parameters
   // Make sure the numCircles variable has been incremented only once
   
	public Circle(int x, int y){
	radius=1.0;
	this.x = x;
	this.y = y;
	numCircles++;
	}

   // Create a constructor method that takes three parameters, one for instance variable x, one for y and
   // one for radius
   // Don't forget to increment the numCircles variable

   	public Circle(int x, int y, int radius){
	this.x = x;
	this.y = y;
	this.radius = radius;
	numCircles++;
	}
	
   // Create a static method that returns the number of circle objects created
	public static int Circle(){return numCircles;}
   
   
   // Create an accessor method (i.e. get method) for the radius instance variable
	public Double getRadius(){return radius;}
   
   // Create an accessor method (i.e. get method) for the x instance variable
	public int getX(){return x;}
   
   // Create an accessor method (i.e. get method) for the y instance variable
	public int getY(){return y;}
   
   // Create an instance method called getArea() to compute the area of this circle object
   // Recall that the area of a circle is PI*radius*radius
   // The method should return a double value
	
   	public double getArea(){return PI*radius*radius;}
	
   // Create a static method also called getArea() that takes one parameter - a radius value
   // This value has nothing to do with the radius variable declared above - it is passed in 
   // when this method is called from the main() method
   // This method uses the given radius parameter, computes the area of a circle using this value,
   // then returns the area
	
	public static double getArea(double radius){
	double area=0;
	area = PI*radius*radius;
	return area;
}
   
	
   // Create a method called getDescription() that returns a String
	public String getDescription(){
	 return "Circle[ Radius = "+radius+" X = "+x+" Y = "+y+"]";
	
	}
   // The string returned contains a concatenation of:
   // The string "Circle[ Radius = " followed by the radius of this circle followed by the string
   // " X = " followed by the x value of this circle followed by the string " Y = " followed by 
   // the y value of this circle followed by the string "]"
   // NOTE: do not call System.out.println() in here, return a String!!!!
   
}
