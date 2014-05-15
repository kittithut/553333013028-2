package com.rmuti.datastructureLab2;

public class Car implements Comparable {
	private String name;
	private String type;
	private int price;

	public Car(String name, String type, int price) {
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public int compareTo(Object e) {
		Car arr = (Car) e;
		if (this.price > arr.price) {
			return 1;
		} else if (this.price == arr.price) {
			return 0;
		} else {
			return -1;
		}
	}


	@Override
	public String toString() {
		return String.format("[%s, %s, %d]", name, type, price);
	}

}
