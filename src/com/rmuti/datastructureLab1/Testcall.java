package com.rmuti.datastructureLab1;

public class Testcall {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		ArrayListStack as = new ArrayListStack();
		ArrayListQueue aq = new ArrayListQueue();
		al.add("game");
		al.add("love");
		al.add("gamd");
		al.add("lodf");
		al.add("¿ÒÂ");
		al.add("d");
		al.add("c");
		al.add("s");
		al.add("a");
		al.add("asgsdgr44@");
		al.add("adsgfsrtu");
		al.add("setgsza");
		al.add("s23va");
		al.add("svs23grgra");
		al.add("i");
		al.add("a???");
		al.add("???a");
		al.add("¡Ð");
		as.push("push1");
		as.push("push2");
		as.push("push3");
		as.push("push4");
		al.insert(0, "insert");
		al.insert(5, "insert");
		System.out.println(as+"\n"+as.pop()+" "+as+"\n"+al);
		al.sort();
		System.out.println(al);
		aq.enqueue("aaa");
		aq.enqueue("aab");
		aq.enqueue("aac");
		System.out.println(aq.dequeue()+" "+aq+" "+aq.peek());
	}
}
