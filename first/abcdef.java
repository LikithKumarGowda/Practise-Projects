package first;

public class abcdef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10101;
		int n1=n;
		int sum=0,rem=0;
		while(n1>0) {
			rem=n1%10;
			sum=(sum*10)+rem;
			n1/=10;
		}
		System.out.println(sum);
		if(sum==n) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
