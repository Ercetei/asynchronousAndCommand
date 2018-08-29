package com.infotel.asynchronismAndCommand;

public class Fn {
	public Fn() {
		
	}
	
	public void doAction1() {
		try {
			Thread.sleep(1000);
			System.out.println("Action 1 executed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

	public void doAction2() {
		try {
			Thread.sleep(1000);
			System.out.println("Action 2 executed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
