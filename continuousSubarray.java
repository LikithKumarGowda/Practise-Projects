
public class continuousSubarray {

	public static void main(String[] args) {
		int[] a= {-2,-3,4,5,-1,2,-1,4,5};
		int n=a.length;
		int result=kadane(a,n);
		System.out.println("the continuous sub array is "+result);
	}
	public static int kadane(int[] a,int n) {
		int max_so_far=a[0],max_upto_here=0;
		for(int i=0;i<n;i++) {
			max_upto_here+=a[i];
			if(max_upto_here<0) {
				max_upto_here=0;
			}
			else if(max_so_far<max_upto_here) {
				max_so_far=max_upto_here;
			}
		}
		return max_so_far;
	}

}
