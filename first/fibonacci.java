package first;
public class fibonacci{
	static int n1=0,n2=1,n3=0;
	static void printfibonacci1(int count)
	{
	if (count>0)
	{
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.println(" "+n3);
		printfibonacci1(count-1);
	}
}
public static void main(String args[])
{
	int count=5;
	System.out.println(" "+n1+"\n"+" "+n2);
	printfibonacci1(count-2);
}
}