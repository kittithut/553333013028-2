package com.rmuti.datastructureLab2;

import java.util.Arrays;

public class TestCall {

	public static void main(String[] args) {
		Car[] carArray = new Car[] {
		new Car("42", "test", 180),
		new Car("43", "test1", 190),
		new Car("44", "test2", 171) };
		Arrays.sort(carArray);
		System.out.println(Arrays.toString(carArray));
	}
}
