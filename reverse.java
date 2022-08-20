
public class reverse {
	
	public static int kadaneAlgo(int[] a,int n) {
		int max_so_far=a[0],max_ending_here=0;
		for(int i=0;i<n;i++) {
			max_ending_here+=a[i];
			if(max_ending_here<0) {
				max_ending_here=0;
			}
			else if(max_so_far<max_ending_here) {
				max_so_far=max_ending_here;
			}
		}
		return max_so_far;
	}
	public static void main(String[] args) {
		int n=8;
		int[] a= {-2,-3,4,-1,-2,-1,5,3};
		int result=kadaneAlgo(a,n);
		System.out.println(result);
		
		
		
		
	}
	
}
