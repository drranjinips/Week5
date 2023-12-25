package employee;

public class TestMyPoint extends MyPoint{

	public static void main(String[] args) {
		CalculatingDistance obj10=new CalculatingDistance(20,10);
		CalculatingDistance obj11=new CalculatingDistance(15,20);
		
		MyPoint obj12=new MyPoint();
		obj12.setXY();//To show that setXY() method is working
		MyPoint obj13=new MyPoint(4,5);
		//To show constructor using parameter is working
		System.out.println("The values of x  using parameter constructor is" + obj10.x);
		System.out.println("The values of y using parameter constructor is " + obj11.y);
		MyPoint obj14=new MyPoint(5,6);
		
		
		MyPoint px = new MyPoint(1,1);

		MyPoint py = new MyPoint(5, 5);
		MyPoint pz = new MyPoint(0, 0);

				double distance = py.getDistance(pz);
				System.out.println(distance);
	}
}
