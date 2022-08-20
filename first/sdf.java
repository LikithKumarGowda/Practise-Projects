package first;
import java.util.*;
public class sdf {
	public static void main(String[] args)   
	{  
	int n;  
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter the number of elements you want to store: ");  
	//reading the number of elements from the that we want to enter  
	n=sc.nextInt();
	int sum=0;
	//creates an array in the memory of length 10  
	int[] array = new int[3];  
	//System.out.println("Enter the elements of the array: ");  
	for(int i=0; i<n; i++)  
	{  
	//reading array elements from the user   
	array[i]=sc.nextInt();
	sum=sum+array[i];

	} 
	for(int j=0;j<array.length;j++) {
		System.out.print(array[j]+" ");
	}
	System.out.println(" \n"+sum);

	
	sc.close();
}
}
