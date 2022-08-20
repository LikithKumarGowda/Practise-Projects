package RestAssured;
class A1{
	int a=10;
	void display() {
		System.out.println("hi");
	}
}
class B1 extends A1{
	void display() {
		System.out.println("hello");
	}
}
class C1 extends B1{
	void display() {
		System.out.println("hi good morning");
	}
}
public class abcd {
	public static void main(String [] args) {
		A1 obj=new C1();
		A1 obj1=new B1();
		
		
		
		obj.display();
		obj1.display();
		
	}
}
