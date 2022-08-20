package RestAssured;
class A{
	int a=10;
	void display() {
		System.out.println("hi");
	}
}
class B extends A{
	void display() {
		System.out.println("hello");
	}
}
class C extends A{
	void display() {
		System.out.println("hi good morning");
	}
}
public class abc {
	public static void main(String [] args) {
		A obj=new C();
		A obj1=new B();
		obj.display();
		obj1.display();
		
	}
}
