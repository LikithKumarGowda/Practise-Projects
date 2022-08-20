package com.project.p4;

public class Uber implements BookingCar {
	@Override
	public void bookOnlineFrom() {
		System.out.println("Booked the Uber service.");
	}
}
