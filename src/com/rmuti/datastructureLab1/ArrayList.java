package com.rmuti.datastructureLab1;

public class ArrayList {
	private Object[] elementData = new Object[1];
	public int size = 0;

	public void add(Object e) {
		add(size, e);
	}

	public void addLast(Object e) {
		size--;
		add(size, e);
	}

	public void addFirst(Object e) {
		size--;
		add(0, e);
	}

	public Object get(int i) {
		return elementData[i];
	}

	public void add(int i, Object e) {
		ensureCapacity(size + 1);
		elementData[i] = e;
		size++;
	}

	public void insert(int i, Object e) {
		ensureCapacity(size + 2);
		for (int x = size - 1; x >= i; x--)
			elementData[x + 1] = elementData[x];
		elementData[i] = e;
		size++;
	}

	private void ensureCapacity(int capacity) {
		if (capacity > elementData.length) {
			Object[] arr = new Object[elementData.length * 2];
			for (int i = 0; i < size; i++)
				arr[i] = elementData[i];
			elementData = arr;
		}
	}

	public Object[] remove(int x) {
		for (int i = x; i < size; i++)
			elementData[i] = elementData[i + 1];
		size--;
		elementData[size] = null;
		return elementData;
	}

	public Object[] fill(Object e) {
		for (int i = 0; i < size; i++)
			elementData[i] = e;
		return elementData;
	}

	public Object[] sort() {
		Object temp = "";
		int count = 0;
		for (int i = size - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (((String) elementData[j]).codePointBefore(1) > ((String) elementData[j + 1]).codePointBefore(1)) {
					temp = elementData[j];
					elementData[j] = elementData[j + 1];
					elementData[j + 1] = temp;
					count = 0;
				} else {
					if (++count == size)
						i = 0;
				}
			}
		}
		return elementData;
	}

	public int binarySearch(Object e) {
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
