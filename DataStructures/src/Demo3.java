
public class Demo3 {
	public static void main(String[] args) {
		int n=32415;
		int i=0;
		while(n>0) {
			i=i+n%10;
			n=(n/10);
			i++;
		}
		System.out.println(i+n);
	}
}
