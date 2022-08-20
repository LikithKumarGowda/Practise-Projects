package javaPrograms;

public class PairByColor {

	/*
	 * arr=[1,2,1,2,1,3,2] op = 2 pairs
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 1, 2, 1, 3, 2,3,4,11,11,10,12,10,4,6,5 };
		System.out.println(pair(arr));

	}

	static int pair(int[] arr) {
		int[] color = new int[arr.length];
		int count = 0;

		for (int i : arr) {
			if (color[i] == 1) {
				count++;
				color[i] = 0;
			} else {
				color[i] = 1;
			}

		}

		return count;

	}

}
