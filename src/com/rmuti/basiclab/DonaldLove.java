package com.rmuti.basiclab;

public class DonaldLove {
	public String name;
	public String location;
	public String friend[];
	
	public DonaldLove() {
		System.out.println("Donald Love");
		name = "Donald Love";
		location = "Goal Keeper";
		friend = new String[] {"Guillermo Varela","Tom Thorpe","Guillermo Varela"};
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