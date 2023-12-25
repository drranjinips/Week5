package memberAccessInheritance;

public class DemoMemberAccessInheritance {

	public static void main(String[] args) {
		B subobj= new B();
		subobj.setij(10, 15);
		subobj.sum();
		System.out.println("Total is "+ total);
	}
/* This will throw a compilation error, 
	since j is private for the class A*/
}
