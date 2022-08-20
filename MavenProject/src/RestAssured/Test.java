package RestAssured;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 0, 1, 0 };
		/* o/p: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1] */
		int[] res = new int[arr.length];

		int left = arr[0];
		for (int i = 1; i < arr.length; i++) {
			while (left > arr[i]) {// 2 0
				int k = left;
				left = arr[i];
				arr[i] = k;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		/*
		 * int left=0; int right=arr.length-1; int count =0;
		 * 
		 * for(int i=0;i<arr.length;i++) { if(arr[i]==0) { count++; } }
		 * 
		 * 
		 * for(int i=0;i<count;i++) { res[i]=0; } for(int i=count;i<res.length;i++) {
		 * res[i]=1; }
		 * 
		 * for(int i=0;i<res.length;i++) {
		 * 
		 * System.out.println(res[i]); }
		 */

	}

}
