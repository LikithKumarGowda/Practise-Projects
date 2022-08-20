package javaPrograms;

import java.util.HashSet;
import java.util.Set;

public class SmallestPositiveInteger {
	
	/*
	 * Missing number ip : [1, 2, 3, 4, 6] op :5
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = { 1, 3, 6, 4, 1, 2 };

		int N = A.length;
		Set<Integer> set = new HashSet<>();
		for (int a : A) {
			if (a > 0) {
				set.add(a);
			}
		}
		
		System.out.println("set : "+ set);
		
		for (int i = 1; i <= N ; i++) {
			if (!set.contains(i)) {
				System.out.println(i);
			}
		}

	}

}
