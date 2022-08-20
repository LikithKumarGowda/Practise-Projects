package first;

public class swapn {
	static int a=10,b=20;
	public static void main(String[] args) { 
		swapNumber(a,b);
		System.out.printf("a is %d,b is %d",a,b);

	} public static void swapNumber(int a,int b) { b=b+a; a=b-a; b=b-a; }



}
