package com.ty;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3 {
	Demo3 (int x, int y) throws ArithmeticException {
		System.out.println(x/y);
	}

	Demo3() throws Exception {
//		FileWriter f = new FileWriter("dimple.txt");
		System.out.println(10/0);

	}

	public static void main(String[] args) {
		try {
		Demo3 d = new Demo3();
//		Demo3 d2= new Demo3(20,0);
			
		} catch (Exception e) {
//			System.out.println("exception handled");
			System.out.println("division");
			try{Demo3 d1= new Demo3(10,0);
			}
			catch (Exception e1) {
				System.out.println("error handled again");
				try{Demo3 d4= new Demo3();
			}
			catch (Exception e3) {
				System.out.println("haii");
			}
			}
			}
		}
		
		
	}

