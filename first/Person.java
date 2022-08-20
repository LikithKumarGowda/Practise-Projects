package first;

public class Person {
	int age;
	public Person(int a) {
		age=a;
	}
	public static void main(String[]args) {
		Person p=new Person(20);
		System.out.println("Age is"+ p.age);
	}
}
