import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int n=input;
		int nos1=0;
		int nos2=1;
		int result;
		System.out.println(nos1+"\n"+nos2);
		for(int i=2;i<n;i++) {
			result=nos1+nos2;
			nos1=nos2;
			nos2=result;
			System.out.println(result);
		}
		
	}
}
