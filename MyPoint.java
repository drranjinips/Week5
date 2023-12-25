package employee;
/*● Two instance variables x (int) and y (int). 
● A default (or "no-arg") constructor that construct a point at the default location of (0, 0). 
● A overloaded constructor that constructs a point with the given x and y coordinates. 
● A method setXY() to set both x and y. 
● A method getXY() which returns the x and y in a 2-element int array.
● A toString() method that returns a string description of the instance in the format "(x, y)". 
● A method called distance(int x, int y) that returns the distance from this point to another point at the 
given (x, y) coordinates 
● An overloaded distance(MyPoint another) that returns the distance from this point to the given 
MyPoint instance (called another) 
● Another overloaded distance() method that returns the distance from this point to the origin (0,0) 
Develop the code for the class MyPoint. Also develop a JAVA program (called TestMyPoint) to test all the 
methods defined in the class. */
public class MyPoint {
double x;
double y;

//Creating A default (or "no-arg") constructor that construct a point at the default location of (0, 0).
//Default constructor will do its job automatically, we need not have to create any class objects
MyPoint(){
	x=0;
	y=0;
	System.out.println("My default x and y are " + x + " " + y);
}
//A overloaded constructor that constructs a point with the given x and y coordinates. 
MyPoint(double i, double j ){
	x=i;
	y=j;
}
public double getX() {
	return x;
}

public double getY() {
	return y;
}

//A method setXY() to set both x and y.
public void setXY() {
	x=20;
	y=30;
	System.out.println("My x and y are " + x + " " + y);
}


// This method accept a point object
// and calculate distance with current object.

// "this" keyword refer current object.
public double getDistance(MyPoint p) {
	return Math.sqrt((this.getX() - p.getX()) * (this.getX() - p.getX())
				+ (this.getY() - p.getY()) * (this.getY() - p.getY()));

}










	public static void main(String[] args) {
		MyPoint obj1=new MyPoint();
		obj1.setXY();//To show that setXY() method is working
		MyPoint obj2=new MyPoint(4,5);
		//To show constructor using parameter is working
		System.out.println("The values of x  using parameter constructor is" + obj2.x);
		System.out.println("The values of y using parameter constructor is " + obj2.y);
		
		
		
	}

}
