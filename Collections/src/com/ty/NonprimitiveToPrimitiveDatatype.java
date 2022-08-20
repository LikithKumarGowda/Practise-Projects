package com.ty;

public class NonprimitiveToPrimitiveDatatype {
	
	public static void main(String[] args) {
		//AutoUnBoxing
		Integer a=new Integer(12);
		int b=a;
		System.out.println(a+" "+b);
		
		Double d=new Double(12.34);
		double e=d;
		System.out.println(d+" "+e);
		
	}
}
