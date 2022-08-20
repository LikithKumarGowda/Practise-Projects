package RestAssured;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SameNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = 142857;
		int output = value * 2;
		System.out.println(output);

		ArrayList<Integer> a = new ArrayList<Integer>();
		int input = output;
		while (input > 0) {
			a.add(input % 10);
			input = input / 10;

		}
		Collections.sort(a);
	
		System.out.println(a);

	}

}
