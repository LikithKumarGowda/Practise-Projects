package com.ty;

import java.io.FileReader;

public class Demo2 {
	void m1() throws Exception{
		FileReader f= new FileReader("dinga.txt");
	}
	 void m2(){
		 System.out.println("haii jspider");
	 }
	 
	public static void main(String[] args) {
		System.out.println("haii");
		Demo2 d= new Demo2();
		try{d.m1();
	}
		catch (Exception e) {
			System.out.println("create file");
		}
	}

}
