package javaPrograms;

public class NthNumberDivisibleByAandB {

	/*
	 * a=3 b=2 N=3 --> output 18 a=4 b=6 N=3 --> 12 24 36 --> output 36
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long a = 2;
		long b = 3;
		long N = 3;
		System.out.println(div(a, b, N));

	}

	static long div(long a, long b, long N) {

		long lcd = lcm(a, b);
		System.out.println("lcd : " + lcd);
		return N * lcd;

	}

	static long lcm(long a, long b) {

		System.out.println("lcm" + a + b);

		return (a * b) / gcd(a, b);
	}

	static long gcd(long a, long b) {
		if (a == 0)
			return b;

		System.out.println("gcd" + a + b +b % a);

		return gcd(b % a, a);

	}

}
