package com.project.p1;

public class MainClass {
	public static void main(String[] args) {
		Country c=new Country();
		System.out.println("Country name is : "+c.countryName);
		System.out.println("State name is : "+c.s.stateName);
		System.out.println("District name is : "+c.s.d.districtName);
	}
}
