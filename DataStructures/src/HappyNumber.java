import java.util.LinkedHashSet;

public class HappyNumber {
	 public static boolean isHappy(int n) {
	        int sum=0;
	        int flag=0;
	        LinkedHashSet<Integer> s=new LinkedHashSet<Integer>();
	        if(n==1) {
	        	flag=1;
	        }
	        while(n!=1){
	        	sum=0;
	            while(n>0){
	                
	                int rem=n%10;
	                n/=10;
	                sum+=rem*rem;
	            }
	            
	            
	            if(!s.contains(sum)) {
	            	s.add(sum);
	            }
	            else {
	            	flag=0;
	            	break;
	            }
	            n=sum;
	            if(n==1){
	                flag=1;
	            }
	            
	            else{
	            flag=0;
	            }
	        }
	        if(flag==1){
	            return true;
	        }
	        return false;
	    }
	 public static void main(String[] args) {
		System.out.println(isHappy(19));
	}
}
