package javaPrograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MaxSum_EqualSumDigits {

	/* maximum sum of 2 numbers whose digits add up to an equal sum */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] A = { 51, 71, 17, 42 };
		int[] A = { 42, 33, 60 };
		System.out.println("result of max : " + maxSum(A));

	}

	//static HashMap<Integer, Integer> map = new HashMap<>();

	static int maxSum(int[] A) {
		int result = 0;
		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < A.length - 1; i++) {
			for (int j = i + 1; j <= A.length - 1; j++) {
				int sum1 = 0;
				int sum2 = 0;
				int a = A[i];
				int b = A[j];
				while (a > 0) {
					sum1 = sum1 + a % 10;
					a = a / 10;
				}

				while (b > 0) {
					sum2 = sum2 + b % 10;
					b = b / 10;
				}

				/*
				 * System.out.println(A[i] + " " + sum1); System.out.println(A[j] + " " + sum2);
				 */

				if (sum1 == sum2) {
					result = A[i] + A[j];
					System.out.println("result :" + arr.add(result));
				}

			}

		}

		int prev = arr.get(0);
		for (int i : arr) {
			if (i > prev) {
				prev = i;
			}
		}

		return prev;

	}

}
