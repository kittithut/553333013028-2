package com.rmuti.datastructureLab1;

public class ArrayListQueue {
	private ArrayList arraylist;
	
	ArrayListQueue(){
		arraylist = new ArrayList();
	}
	
	public void enqueue(Object e) {
		arraylist.add(e);
	}

	public Object dequeue() {
		Object p = arraylist.get(0);
		arraylist.remove(0);
		return p;
	}

	public Object peek() {
		return arraylist.get(0);
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
