package com.rmuti.datastructureLab1;

public class ArrayListStack {
	private ArrayList arraylist;
	
	ArrayListStack(){
		arraylist = new ArrayList();
	}

	public void push(Object e) {
		arraylist.insert(0, e);
	}

	public Object peek() {
		return arraylist.get(0);
	}

	public Object pop() {
		Object p = arraylist.get(0);
		arraylist.remove(0);
		return p;
	}

	public boolean empty() {
		if (arraylist.size == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		String ret = "[";
		for (int i = 0; i < arraylist.size; i++) {
			ret += arraylist.get(i);
			if (i != arraylist.size - 1)
				ret += ",";
		}
		ret += "]";
		return ret;
	}
}
