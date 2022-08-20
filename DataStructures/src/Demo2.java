
public class Demo2 {
	public static void main(String[] args) {
		int a[]= {1,20,3,40,55,65};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				a[i]=a[i]%2+1;
				i=0;
				continue;
			}
			System.out.print(a[i]+" ");
		}
	}
}
