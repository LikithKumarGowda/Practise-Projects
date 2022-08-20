package RestAssured;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 2nd October 2001 - MM/DD/YYYY - 10/02/2001 1002| 2001 - is a palindrome Find
		 * the immediate preceding palindrome
		 */

		// 09 21 1290

		// 12 31 1321
		// 03 31 1330

		SimpleDateFormat sdf = new SimpleDateFormat("MM:DD:YYYY");
		String dateMonth = "";
		String month = "";
		String date = "";
		ArrayList<Integer> al = new ArrayList<>();

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(01, 31);
		map.put(02, 28);
		map.put(03, 31);
		map.put(04, 30);
		map.put(05, 31);
		map.put(06, 30);
		map.put(07, 31);
		map.put(Integer.parseInt("08"), 31);
		map.put(Integer.parseInt("09"), 30);
		map.put(10, 31);// date month
		map.put(11, 30);
		map.put(12, 31);

		// 1301 10 31
		int maxMonth = 0;

		for (int i = 01; i <= 12; i++) {

			if (map.containsKey(i) && i <= 9) {
				maxMonth = map.get(i);
				month = "0" + String.valueOf(i);
			} else {
				maxMonth = map.get(i);
				month = String.valueOf(i);
			}

			for (int j = 01; j <= maxMonth; j++) {

				/*
				 * if (i < 10) {
				 * 
				 * month = "0" + String.valueOf(i); } else { month = String.valueOf(i); }
				 */

				if (j <= 9) {
					date = "0" + String.valueOf(j);
				} else {
					date = String.valueOf(j);
				}

				dateMonth = month + date;

				// System.out.println("dateMonth : "+dateMonth);

				String input = dateMonth;
				char[] arr = input.toCharArray();
				String year = "";
				for (int k = arr.length - 1; k >= 0; k--) {
					year += arr[k];
				}

				// System.out.println("year : " + year);

				al.add(Integer.parseInt(year));

			}

		}
		Collections.sort(al);

		System.out.println("Array List :" + al);

	}

}
