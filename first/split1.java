package first;
import java.util.*;
public class split1 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(i!=j) {
					System.out.print(" ");
					
				}
				else if(i==j) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		sc.close();
	}
}
		