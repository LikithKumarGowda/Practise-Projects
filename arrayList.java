import java.util.*;
public class arrayList {
	public static boolean findSumOfTwo(int[] A,int val){
		Set<Integer> foundValues=new HashSet<Integer>();
		for(int a:A) {
			if(foundValues.contains(val-a)) {
				return true;
			}
			foundValues.add(a);
		}
		return false;
		
	}
	public static void main(String[] args) {
		int A[]= {5,7,1,2,8,4,3};
		int value=15;
		System.out.println(findSumOfTwo(A,value));
		
	}
}
