package com.infotel.asynchronismAndCommand;

public class ExecuteFn extends Thread {

	private Fn fn;
	
	public ExecuteFn(Fn fn) {
		this.fn = fn;
	}

	@Override
	public void run() {
		fn.doAction1();
	}



}
