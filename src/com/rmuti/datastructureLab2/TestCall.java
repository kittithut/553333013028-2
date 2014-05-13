package com.rmuti.datastructureLab2;

import java.util.Arrays;

public class TestCall {

	public static void main(String[] args) {
		Student[] studentArray = new Student[] {
		new Student("42", "test", 180),
		new Student("43", "test1", 190),
		new Student("44", "test2", 171) };
		Arrays.sort(studentArray);
		System.out.println(Arrays.toString(studentArray));
	}
}
