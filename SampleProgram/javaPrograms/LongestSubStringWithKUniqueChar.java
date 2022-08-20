package javaPrograms;

import java.util.ArrayList;
import java.util.TreeMap;

public final class LongestSubStringWithKUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String str = "aabbcc";
		String str = "abcbdbdbbdcdabd";
		int k = 2;
		subString(str, k);

	}

	static void subString(String str, int k) {
		ArrayList<String> a1 = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				a1.add(str.substring(i, j));
			}
		}

		TreeMap<String, Integer> a2 = new TreeMap<>();
		for (String s : a1)
			a2.put(s, a2.getOrDefault(s, 0) + 1);

		ArrayList<String> a3 = new ArrayList<>();
		for (String s : a2.keySet()) {
			if (a2.get(s) == 1)
				a3.add(s);
		}

		System.out.println("a3 : " + a3);
		System.out.println(a2.size());

		TreeMap<String, Integer> map = new TreeMap<>();
		for (String s : a3) {
			map.put(s, s.length());
		}
		System.out.println("map : " + map);

		ArrayList<Integer> l = new ArrayList<Integer>();
		for (String s : map.keySet()) {
			l.add(map.get(s));
		}
		System.out.println("l : " + l);

		int ans = Integer.MIN_VALUE;
		for (int i : l) {
			ans = Math.max(ans, i);
		}
		System.out.println(ans);

		ArrayList<String> a4 = new ArrayList<String>();
		for (String s : map.keySet()) {
			if (map.get(s) == k) {
				a4.add(s);
			}
		}
		
		//program not completed

		System.out.println("a4 : " + a4);
	}

}
