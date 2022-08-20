package first;
import java.util.*;
public class nosd {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int sum=0;
		int []a=new int[N];
		for(int i=0;i<N;i++) {
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<N;i++) {
			if(a[i]>=1) {
				sum++;
			}
		}
		System.out.println("Nos greater than one is:"+ sum);
		sc.close();
	}
}
