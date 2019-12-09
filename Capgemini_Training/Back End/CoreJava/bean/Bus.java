package com.capgemini.bean;

public final class Bus {
	private final int seats;
	private final String name;
	
	public Bus(int seats, String name) {
		this.seats = seats;
		this.name = name;
	}

	public int getSeats() {
		return seats;
	}

	public String getName() {
		return name;
	}
	
}
