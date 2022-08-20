package co.likith;
import java.util.Scanner;
import co.likith.entity.Mobile;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String brand=sc.nextLine();
		double cost=sc.nextDouble();
		Mobile m1=new Mobile();
		m1.setBrand(brand);
		m1.setCost(cost);
		System.out.println("Brand ="+m1.getBrand());
		System.out.println("Cost ="+m1.getCost());
	}

}
