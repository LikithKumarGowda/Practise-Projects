package first;

public class c23 {
	
	public static int happyNos(int n) {
		int rem=0;
		int sum=0;
		while(n!=0) {
			rem=n%10;
			sum=sum+(rem*rem);
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=98;
		int ans=0;
		boolean t=true;
		while(t) {
			ans=happyNos(n);
			n=ans;
			if(ans==1||ans==4) {
				t=false;
			}
		}
		//while(n!=1 || n!=4){
		//		n=happyNos(n);
		//}
		System.out.println("output");
		System.out.println(ans);
		if(ans==1) {
			System.out.println("happy nos");
		}
		else {
			System.out.println("not happy nos");
		}
		
		
	}

}
