
public class c8 {
	public static long maxSubarraySum(int arr[], int n){
        int max=0;
        int maxsofar=arr[0],maxuntilhere=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }   
        }
        System.out.println(arr[0]);
        max=arr[0];
        for(int i=0;i<n;i++){
            maxuntilhere=maxuntilhere+arr[i];
            if(maxuntilhere<0){
                maxuntilhere=0;
            }
            if(maxsofar<maxuntilhere){
                maxsofar=maxuntilhere;
            }
            else if(maxsofar==0){
                maxsofar=max;
            }

        }
        return maxsofar;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int[] a= {-1,-2,-3,-4};
		System.out.println(maxSubarraySum(a,n));

	}

}
