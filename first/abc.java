package first;
import java.util.*;
public class abc {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int count=0;
		while(n!=0) {
			if((n%10)!=m) {
				count++;
			}
			n/=10;
		}
		System.out.println(count);
		sc.close();
	}
}
