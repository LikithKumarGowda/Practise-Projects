import java.util.Scanner;

public class c6 {
	public static boolean more20(int n) {
		if(n%20==1 || n%20==2) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean result=more20(n);
		System.out.println(result);

	}

}
