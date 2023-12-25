package memberAccessInheritance;

class B extends A {
int total;
void sum() {
	total= i+j; // error , since j is private for class A
	}

}
