package com.project.p4;

import java.util.Scanner;

public class Mobile {
	BookingCar selectChoice(int choice) {
		if(choice==1) {
			return new Uber();
		}
		else {
			return new Ola();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Uber \n2:Ola");
		System.out.println("Enter ur choice : ");
		int choice=sc.nextInt();
		Mobile m=new Mobile();
		BookingCar app=m.selectChoice(choice);
		app.bookOnlineFrom();
		

	}
}
