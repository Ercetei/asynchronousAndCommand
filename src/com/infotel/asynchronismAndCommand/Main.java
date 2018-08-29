package com.infotel.asynchronismAndCommand;

public class Main {

	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		
		// Boucle for
		for (Integer i = 0; i != 10; i++) {
			Integer a = i;
			invoker.store(() -> {System.out.println("Action " + a);});
		}
		
		invoker.executeAll();
	}
}
