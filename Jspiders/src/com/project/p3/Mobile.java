package com.project.p3;

import java.util.Scanner;

public class Mobile {
	FoodDeliveryApp decideApp(int choice) {
		if(choice==1) {
			return new Swiggy();
		}
		else {
			return new Zomato();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1: Swiggy \n2: Zomato");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		Mobile m=new Mobile();
		FoodDeliveryApp app=m.decideApp(choice);
		app.orderFood();
		sc.close();
	}
}
