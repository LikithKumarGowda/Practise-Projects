package com.ty;

public class PrimitiveToNonprimitiveDatatype {
	public static void main(String[] args) {
		//AutoBoxing
		int a=15;
		Integer b=new Integer(a);
		System.out.println(a+" "+b);
		
		double x=12.3;
		Double y=new Double(x);
		System.out.println(x+" "+y);
		
		char c='a';
		Character d=new Character(c);
		System.out.println(c+" "+d);
	}
}
