package first;

public class whitespace {
	public static void main(String[]args) {
		String str1=("Hello World");
		str1=str1.replaceAll("\\s+","");
		System.out.println(str1);
	}
}
