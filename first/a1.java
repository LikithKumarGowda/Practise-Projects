package first;
import java.util.*;
public class a1 {
	public static boolean isPrime(int n) {
		int count=0;
		for(int j=1;j<=n;j++) {
			if(n%j==0)
				count+=1;
		}
		if(count>2)
			return false;
		else if(count<=2)
			return true;
		return false;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i:a) {
			if(isPrime(i))
				System.out.print(i+" ");
		}
		for(int i:a) {
			if(!isPrime(i)) {
			System.out.print(i+" ");
			}
		}
	}
}
