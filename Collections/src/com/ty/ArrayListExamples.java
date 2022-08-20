package com.ty;

import java.util.ArrayList;

public class ArrayListExamples {
	public static void main(String[] args) {
		//Generics
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(12);
		a.add(23);
		a.add(34);
		// It allows null values
		a.add(null);
		
		for(Integer i:a) {
			System.out.println(i);
		}

		// To print output in Collections using For loop we use -->  a.get(i);
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
	}

}
