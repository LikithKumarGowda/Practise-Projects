package com.ty;

public class Demo {
	void m1() throws ArithmeticException {
		System.out.println(10/2);
	}
	void m2() throws Exception {
		System.out.println(20/0);
	}
	public static void main(String[] args) {
		Demo d= new Demo();
		try{d.m1();
		}catch (Exception e) {
			System.out.println("exception handled");
		}
	}
}
