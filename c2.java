import java.util.Scanner;

public class c2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base value :");
		int n=sc.nextInt();
		System.out.println("Enter the exponent value :");
		int exp=sc.nextInt();
		int output=1;
		for(int i=1;i<=exp;i++) {
			output=output*(n);
			
		}
		System.out.println("output is : "+output);
		sc.close();
	}

}
