package first;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		System.out.println(isprime(19));
		System.out.println(isprime(239));
	}
	public static boolean isprime(int n) {
		if(n==0||n==1) {
			return false;
		}
		if(n==2) {
			return true;
		}
		for(int i=2;i<=n/2;++i) {
			if(n%2==0) {
				return false;
			}
		}
		return true;
	}
}
