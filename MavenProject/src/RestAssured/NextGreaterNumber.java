package RestAssured;

import java.util.ArrayList;
import java.util.Collections;

public class NextGreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 123;
		System.out.println("output is :: " + greaterValue(num));

	}

	public static int greaterValue(int num) {

		ArrayList<Integer> arr = new ArrayList<>();
		char[] numArr = String.valueOf(num).toCharArray();
		for (char a : numArr) {
			int digit = Character.getNumericValue(a);
			arr.add(digit);
			// System.out.println(digit);
		}
		// System.out.println(arr);

		int output = 0;

		for (int i = arr.size() - 1; i > 0; i--) {
			String str = "";
			Collections.swap(arr, i, i - 1);
			// System.out.println(arr);
			for (int j : arr) {
				str += j;
			}
			output = Integer.parseInt(str);
			// System.out.println("output : " + output);

			// System.out.println("i :: " + i);

			if (output < num && i == 1) {
				System.out.println("exceeded");
				break;
			} else if (output < num) {
				greaterValue(output);
			} else if (output > num) {
				// System.out.println(" value is :: " + output);
				break;
			}

		}

		return output;

	}

}
