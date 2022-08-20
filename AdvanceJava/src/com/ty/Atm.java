package com.ty;

import java.util.Scanner;


public class Atm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int balance=5000;
		System.out.println("Enter the amount to be withdrawn :");
		int amount=sc.nextInt();
		if(amount<=balance) {
			System.out.println("Amount withdrawn Successfully");
		}
		else {
			try {
				//InsufficientFundException obj=new InsufficientFundException("Insufficient balance");
				// throw obj;
				
				// or//
				
				throw new InsufficientFundException("Insufficient balance");
			} 
			catch(InsufficientFundException e) {
				System.out.println("Insufficient Fund in account");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}

}
