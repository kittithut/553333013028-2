package com.rmuti.basiclab;

import java.util.Arrays;

public class Testbasic {

	public static void main(String[] args) {
		DonaldLove dl = new DonaldLove();
		System.out.println("Name : "+dl.name);
		System.out.println("Location : "+dl.getPosition());
		System.out.println("Friends : "+Arrays.toString(dl.getfriend()));
	}

}
