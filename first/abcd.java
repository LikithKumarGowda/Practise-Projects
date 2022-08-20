package first;
import java.util.*;
public class abcd {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt(n);
		int rem,count=0,max=0;
		while(a>0) {
			rem=a%2;
			if(rem==1) count++;
			else count=0;
			max=Math.max(count, max);
			a/=2;
			System.out.print(rem);
		}
		System.out.println("\n"+max);
		sc.close();	
	}
}
