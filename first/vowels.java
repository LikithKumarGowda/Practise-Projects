package first;

public class vowels {

	public static void main(String[] args) {
		System.out.println(stringContainsVowels("Hello"));
		System.out.println(stringContainsVowels("gfjhihcwwfdwfwxeiold"));
	}
	public static boolean stringContainsVowels(String str) {
		return str.toLowerCase().matches(".*[aeiou].*");
	}

}
