package javaPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringArrayToBeSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr= "abc def efg \"hij klm\" opqr ,agf";
		splitAnArray(arr);

	}
	
	static void splitAnArray(String  str) {
		
		
		List<String> list = new ArrayList<String>();
		Pattern pattern = Pattern.compile("(^+>.<,\\S*\"\\s*\\b)");
		Matcher m = pattern.matcher(str);

		while (m.find()) {
			System.out.println("m1 :: " + m.group());
			list.add(m.group(0));
		}

		System.out.println(list);
		 
		
		
		/*
		 * String[] arr = str.split("[\",]");
		 * 
		 * for (String s : arr) System.out.println(s);
		 */

	}

}
