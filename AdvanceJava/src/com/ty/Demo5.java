package com.ty;

public class Demo5 {
	public static void main(String[] args) {
		try {
		System.out.println(10/0);
	}
		catch (Exception e) {
		System.out.println("error handled");
		System.out.println(e.getMessage());
		e.printStackTrace();
		}
	}

}
