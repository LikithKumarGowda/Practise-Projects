package first;
import java.util.*;
public class string2da {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     String[][] s=new String [5][3];
	     String[][] a=new String[5][3];
	     for(int i=0;i<5;i++){
	         for(int j=0;j<3;j++){
	             s[i][j]=sc.nextLine();
	             a[i][j]=s[i][j];
	         }
	     }
	     int[] c1=new int[5];
	     for(int i=0;i<5;i++){
	         c1[i]=Integer.parseInt(s[i][0]);
	     }
	     Arrays.sort(c1);
	     String[] c2=new String[5];
	     for(int i=0;i<5;i++){
	         c2[i]=String.valueOf(c1[i]);
	     }
	     String[][] out=new String[5][3];
	     for(int i=0;i<5;i++){
	         for(int j=0;j<5;j++){
	        	 if(c2[i].equals(s[j][0])) {
	        		 for(int k=0;k<3;k++) {
	        			 out[i][k]=a[j][k];
	        		 }
	        	 }
	         }
	     }
	     for(int i=0;i<5;i++){
	         for(int j=0;j<3;j++){
	             System.out.println(out[i][j]);
	         }
	     }
	     
	}

}
