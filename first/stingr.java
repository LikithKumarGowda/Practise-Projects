package first;
import java.util.Scanner;
public class stingr {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		StringBuilder input1=new StringBuilder(input);
		input1.reverse();
		System.out.println(input1);
		sc.close();
		
		
	}

}
