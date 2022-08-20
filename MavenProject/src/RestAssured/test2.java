package RestAssured;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "TODO Auto-generated method stub";
		// output = ODOT detar
		System.out.println(reverse(str));

	}

	
	static String result = "";

	public static String reverse(String str) {

		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			//System.out.println("word :: " + word);
			String wordOutput = "";
			for (int j = word.length()-1; j >=0; j--) {
				wordOutput += word.charAt(j);
			}

			//System.out.println("wordOutput :: " + wordOutput);
			result += wordOutput + " ";

		}

		return result;

	}

}
