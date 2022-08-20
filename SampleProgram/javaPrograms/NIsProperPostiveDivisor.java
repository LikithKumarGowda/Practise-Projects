package javaPrograms;

public class NIsProperPostiveDivisor {

	/*
	 * 6 --> 1 2 3 --> Perfect 5 --> 1 --> Not Perfect 28 --> 1 2 4 7 14 --> Perfect
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 28;
		System.out.println(properPositiveDivisor(a));

	}

	static boolean properPositiveDivisor(int num) {

		int sum = 1;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				if (i * i != num) {
					sum = sum + i + num / i;
					System.out.println("sum1 : "+sum);
				} else {
					sum = sum + i;
					System.out.println("sum2 : "+sum);
				}

			}

		}

		if (sum == num && num != 1)
			return true;
		else
			return false;

	}

}
