package inheritanceBasics;

public class SimpleInheritanceDemp {

	public static void main(String[] args) {
		A superobj= new A(); //created a class object for A
		B subobj = new B(); // created an object in the subclass B
		superobj.i=10;
		superobj.j=20;
		subobj.k = 30;
		System.out.println("THe elements of super class A is ");
		superobj.showij();
		// Next line of code demonstrate that the subclass has acee to all the variables defined in superclass
		//Also we are able to call all the functions defined in the superclass
		
		subobj.i=45;
		subobj.j=60;
		subobj.k=75;
		subobj.sum();
	}

}
