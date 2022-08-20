package first;
import java.util.*;
public class forloop {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] a=new int[N];
		for(int i=0;i<N;i++) {
			a[i]=sc.nextInt();
		}
		int maxdigit=a[0];
		for(int i=0;i<N;i++) {
			if(a[i]>maxdigit) {
				maxdigit=a[i];
			}
		}
		System.out.println(maxdigit);
		sc.close();
	}
}
