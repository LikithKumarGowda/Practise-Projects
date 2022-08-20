package first;

import java.util.Scanner;

public class c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=n;
		int n2=n;
		int count=0;
		int rem=0;
		int sum=0,total=0;
		while(n>0) {
			n/=10;
			count++;
		}
		while(n1>0) {
			rem=n1%10;
			sum=1;
			for(int i=0;i<count;i++) {
				sum=sum*(rem);
			}
			total=total+sum;
			n1/=10;
		}
		if(n2==total) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
	}

}
