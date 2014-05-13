package com.rmuti.datastructureLab2;

public class Student implements Comparable {

	private String studentId;
	private String name;
	private int height;

	public Student(String studentId, String name, int height) {
		this.studentId = studentId;
		this.name = name;
		this.height = height;
	}

	public int compareTo(Object o) {
		Student s = (Student) o;
		if (this.height > s.height) {
			return 1;
		} else if (this.height == s.height) {
			return 0;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return String.format("[id = %s , name = %s, height = %d]", studentId,
				name, height);
	}
}
