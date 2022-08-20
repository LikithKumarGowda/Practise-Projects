import java.util.Scanner;
public class d1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(year%4==0) {
			//to check if year divisible by 4
			if(year%100==0) {
				//to check if year divisible by 100 and 400
				if(year%400==0) {
					System.out.println(year+" is a leap year");
				}
				else {
					System.out.println(year+" is not a leap year");
				}
			}
			//to check if year divisible by 4 and not divisible by 100
			else {
				System.out.println(year+" is a leap year");
			}
			
		}
		else {
			System.out.println(year+" is not a leap year");
		}
		sc.close();
	}

}
