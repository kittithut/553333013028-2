package com.rmuti.datastructureLab1;

public class ArrayListStack {
	private Object[] elementData = new Object[1];
	public int size = 0;

	public void push(Object e) {
		ensureCapacity(size + 2);
		for (int x = size - 1; x >= 0; x--)
			elementData[x + 1] = elementData[x];
		elementData[0] = e;
		size++;
	}

	public Object peek() {
		return elementData[0];
	}

	public Object pop() {
		Object p = elementData[0];
		remove(0);
		return p;
	}

	public boolean empty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	private void ensureCapacity(int capacity) {
		if (capacity > elementData.length) {
			Object[] arr = new Object[elementData.length * 2];
			for (int i = 0; i < size; i++)
				arr[i] = elementData[i];
			elementData = arr;
		}
	}

	private Object[] remove(int x) {
		for (int i = x; i < size; i++)
			elementData[i] = elementData[i + 1];
		size--;
		elementData[size] = null;
		return elementData;
	}

	public int Search(Object e) {
		int i = -1;
		for (i = 0; i < size; i++) {
			if (elementData[i] == e)
				return i;
		}
		return i;
	}

	@Override
	public String toString() {
		String ret = "[";
		for (int i = 0; i < size; i++) {
			ret += elementData[i];
			if (i != size - 1)
				ret += ",";
		}
		ret += "]";
		return ret;
	}
}
