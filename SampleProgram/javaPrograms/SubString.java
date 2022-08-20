package javaPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class SubString {
	
	
	/*
	 * Smallest substring occurring only once in a given string
	 * 
	 * Input: S = “abaaba” Output: 2 Explanation: The smallest substring in the
	 * string S, whose occurrence is exactly 1 is “aa” . Length of this substring is
	 * 2. Therefore, print 2.
	 * 
	 * Input: S = “zyzyzyz” Output: 5
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abaaba";
		//String str = "aabbbabaaa";
		//String str = "zyzyzyz";
		//String str="ab";
		System.out.println("output : "+smallestSubString(str));

	}
	
	static int smallestSubString(String str) {

		ArrayList<String> a1 = new ArrayList<String>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				if (i != j)
					a1.add(str.substring(i, j));
			}
		}
		System.out.println("a1 : "+a1);
		

		// Take all substrings into an account
		TreeMap<String, Integer> a2 = new TreeMap<>();
		for (String s : a1) {
			//System.out.println("s :: "+s+" getOrDefault: "+a2.getOrDefault(s, 0));
			a2.put(s, a2.getOrDefault(s, 0)+1 );
		}
		System.out.println("a2 : "+a2);
		

		ArrayList<String> freshList = new ArrayList<>();
		for (String s : a2.keySet()) {
			if (a2.get(s) == 1)
				freshList.add(s);
		}
		System.out.println("freshList : "+freshList);

		TreeMap<String, Integer> dictionary = new TreeMap<>();
		for (String s : freshList) {
			dictionary.put(s, s.length());
		}
		System.out.println("dictionary : "+dictionary);

		ArrayList<Integer> newlist = new ArrayList<>();
		for (String s : dictionary.keySet()) {
			newlist.add(dictionary.get(s));
		}
		System.out.println("newlist : "+newlist);

		int ans = Integer.MIN_VALUE;

		for (int i : newlist) {
			ans = Math.max(ans, i);
		}
		
		System.out.println("ans : "+ans);
		
		for(String s1:dictionary.keySet()) {
			if(dictionary.get(s1).equals(ans))
				System.out.println("s1 : "+s1);
		}

		return ans == Integer.MAX_VALUE ? 0 : ans;

	}

}
