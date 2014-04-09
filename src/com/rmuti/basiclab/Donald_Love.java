package com.rmuti.basiclab;

public class Donald_Love {
	public String name;
	public String location;
	public String friend[];
	
	public Donald_Love() {
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