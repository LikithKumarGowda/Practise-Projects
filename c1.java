import java.util.Scanner;

public class c1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 numbers:");
		int sum=0;
		for(int i=0;i<10;i++) {
			int n=sc.nextInt();
			sum+=n;
		}
		System.out.println("sum is : "+ sum);
		System.out.println("average is : " +(int)(sum/10));
		sc.close();

	}

}
