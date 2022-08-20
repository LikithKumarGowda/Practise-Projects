package com.ty.Set;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Demo {
	public static void main(String[] args) {
		HashSet s=new HashSet();
		s.add(10);
		s.add("hello");
		s.add(20.5);
		s.add(null);
		s.add(10);
		for (Object object : s) {
			System.out.println(object);
		}
		
		
		LinkedHashSet s1=new LinkedHashSet();
		s1.add(10);
		s1.add(null);
		s1.add(123);
		s1.add(123);
		s1.add("hello");
		for (Object object1 : s1) {
			System.out.println(object1);
		}
		
	}
}
