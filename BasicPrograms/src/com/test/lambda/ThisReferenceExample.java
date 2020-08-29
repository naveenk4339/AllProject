package com.test.lambda;

public class ThisReferenceExample {

	public void doProcess(int i, Process p) {
		p.process(i);
	}
	
	public void excute() {
		doProcess(10, i -> {
			System.out.println("value fo i is "+ i);
			System.out.println(this);
		});
	}

	public static void main(String[] args) {

		ThisReferenceExample thisRef = new ThisReferenceExample();

		thisRef.doProcess(13, i-> {
			System.err.println("value of i is "+i);
			///System.out.println(this); this will not work
		});
		/*
		 * thisRef.doProcess(10, new Process() {
		 * 
		 * public void process(int i) { System.out.println("Value of ii "+i);
		 * System.out.println(this); } public String toString() { return
		 * "this is the annaymous inner class"; } });
		 */
		thisRef.excute();
		
	}
	
	public String toString() {
		return "this is the main thisReferenceExample class Instanc";
	}

}

interface Process{
	
	void process(int i);
	
}