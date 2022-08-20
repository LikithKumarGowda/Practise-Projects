package RestAssured;

import java.util.ArrayList;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] result = new int[arr.length - 1];
		int posistion = 2;

		for (int i = 0; i < arr.length - 2; i++) {

			if (i >= posistion) {

				arr[i] = arr[i + 1];
				System.out.println(arr[i]);

			} else {
				// arr[i] = arr[i];
				System.out.println(arr[i]);
			}

		}

		
		 * for (int i : arr) {
		 * 
		 * System.out.println(i); }
		 

	}*/

	
	
	
	int number =5;
	int sum=0;
	try {
		sum=number/0;
		
	}catch(ArithmeticException e) {
		e.getStackTrace();
		System.out.println(e);
		
	}finally {
		System.out.println("Running finnally block!!");
	}
	
	
	
	
	
	
	
	}

}
