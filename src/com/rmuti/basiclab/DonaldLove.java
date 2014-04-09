package com.rmuti.basiclab;

public class DonaldLove {
	public String name;
	public String position;
	public String friend[];

	public DonaldLove() {
		name = "Donald Love";
		position = "Quarterback";
		friend = new String[] { "Reece James", "Tom Thorpe", "Liam Grimshaw",
				"Guillermo Varela" };
	}

	public DonaldLove(int n) {
		System.out.println("Donald Love Overloading 1");
	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public String[] getfriend() {
		return friend;
	}
}