package javaPrograms;

public class MaxNumInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 8, 5, 9, 7, 3, 4, 2 };

		int maxnum = 0;
		int previous = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			while (previous < arr[i + 1] && i + 1 < arr.length) {
				previous = arr[i + 1];
				maxnum = previous;
			}
		}
		System.out.println("Max num is " + maxnum);
	}

}
