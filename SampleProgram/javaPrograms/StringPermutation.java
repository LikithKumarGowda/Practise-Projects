package javaPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabbcc";
		String res = "";
		Set<String> output = subString(res, str);
		System.out.println("output : "+subString(res, str));
		System.out.println(output.size());

	}
	static Set<String> s=new HashSet<String>();

	static Set<String> subString(String res, String str) {

		
		
		if (str.length() == 0) {
			//System.out.println(res);
			s.add(res);
			//a1.add(res);
			
		} else {
			for (int i = 0; i < str.length(); i++) {
				subString(res + str.charAt(i), str.substring(0, i) + str.substring(i+1, str.length()));
			}
		}
		
		
		
		//System.out.println(s);
		return s;
	}

	/*
	 * for(int i=0;i<str.length();i++) { if(str.length()==0) { System.out.println();
	 * }
	 * 
	 * System.out.println(); }
	 */

}
