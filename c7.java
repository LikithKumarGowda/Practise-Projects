
public class c7 {
	public static int findMax(int n,int m) {
		int out = 0;
		if(n>m) {
			out=m*m;
		}
		return out;
	}
	public static void main(String[] args) {
		int[] a= {1,8,6,2,5,4,8,3,7};
		int n=a.length;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				
				int out=findMax(a[i],a[j]);
				
				

				
			}
		}
	}

}
