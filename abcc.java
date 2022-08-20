import java.util.Scanner;
//Method Overloading example for login page//
//Method Overloading is also known as Compile time Polymorphism//
//early binding takes place i.e. compiler will bind to the method which it should execute//
//
public class abcc {
	//login using phno and pswd //
	static void login(long ph_no,String pswd) {
		if(ph_no==8888888888l && pswd.equals("abcd@"))
			System.out.println("login Successfull");
		else
			System.out.println("invalid credentials");
	}
	//login using email and pswd //
	static void login(String email,String pswd) {
		if(email.equals("asd.gmail.com")&&pswd.equals("abcd@"))	
			System.out.println("login Successfull");
		else
			System.out.println("invalid credentials");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long ph_no=sc.nextLong();
		String pswd=sc.nextLine();
		String email=sc.nextLine();
		
		login(ph_no,pswd);
		login(email,pswd);
		sc.close();
		
	}
}
//confidence
//technical words
//
