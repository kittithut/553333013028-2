package com.rmuti.basiclab;

import java.util.Arrays;

public class Testbasic {

	public static void main(String[] args) {
		DonaldLove dl = new DonaldLove();
		String a[] = dl.getfriend();
		System.out.println("Name : "+dl.name);
		System.out.println("Location : "+dl.location);
		System.out.println("Friends : "+Arrays.toString(a));
	}

}
