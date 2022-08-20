

public class Demo4 {
	public static void main(String[] args) {
		int a=10;
		for(int i=1;i<=a;i++) {
			if(i==a) {
				a=5;
			}
			System.out.println(i+a+" "+i+a);
		}
	}
}
