package com.rmuti.basiclab;

public class DonaldLove {
	public String name;
	public String location;
	public String friend[];
	
	public DonaldLove() {
		name = "Donald Love";
		location = "Goal Keeper";
		friend = new String[] {"Guillermo Varela","Tom Thorpe","Guillermo Varela"};
	}
	
	public DonaldLove(int n) {
		System.out.println("Donald Love Overloading 1");
	}
	
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public String[] getfriend() {
		return friend;
	}
}