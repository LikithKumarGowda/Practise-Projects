import java.util.*;
public class a1 {
	public static boolean findSumOfTwo(int[] a,int val) {
		Set<Integer> foundValues=new HashSet<Integer>();
		for(int b:a) {
			if(foundValues.contains(val-b)) {
				return true;
			}
			foundValues.add(b);
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8};
		int value=10;
		System.out.println(findSumOfTwo(a,value));
	}

}
