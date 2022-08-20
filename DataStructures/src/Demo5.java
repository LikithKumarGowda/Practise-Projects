import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		
		//happy nos
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		/* while(n!=1 ) { */
		for(int i=n;i<n;i++) {
			while(n!=0) {
				int rem=n%10;   //19      9
				n=n/10;         //1
				sum+=rem*rem;   // 81	
			}
			n=sum;
			System.out.println(sum);
			/*
			 * if(sum==1) { break; }
			 */
			
		/*}*/
		}
		
		
	}
}
