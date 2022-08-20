import java.util.Scanner;

public class c3 {
	public static int factorial(int n) {
		int fact=1;
		if(n>0) {
			fact=n*(factorial(n-1));
		}
		else {
			return 1;
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(factorial(n));
		
	}

}
