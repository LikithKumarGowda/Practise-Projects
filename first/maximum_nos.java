package first;
import java.util.*;
public class maximum_nos {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	int max = Arrays.stream(a).max().getAsInt();
	System.out.println(max);
	sc.close();
}
}
