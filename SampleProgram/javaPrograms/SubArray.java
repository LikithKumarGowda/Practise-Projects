package javaPrograms;

import java.util.ArrayList;

public class SubArray {

	/*
	 * subArray having given sum in given array of intgers. input=
	 * {2,6,0,9,7,3,1,4,1,10} sum = 15 output = {6,0,9}
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = { 2, 6, 0, 9, 7, 3, 1, 4, 1, 10 };
		int sum = 15;
		subArray(input, sum);

	}

	static void subArray(int[] input, int sum) {

		int[] output = new int[input.length];
		int outputSum = 0;
		int j = 0;

		ArrayList<Integer> a1=new ArrayList<>();
		
		for (int i = 0; i < input.length; i++) {

			while (outputSum < sum) {
				a1.add(input[j]);
				outputSum += input[j];
				j++;
			}

			if (outputSum == sum) {
				//System.out.println(a1);
				System.out.println("[Sum found between indexes : %d]" + i + j);
			} else {
				outputSum -= input[i];
			}

		}

	}

}
