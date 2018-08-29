package com.infotel.asynchronismAndCommand;

public class StopFn extends Thread{

	private Fn fn;
	
	public StopFn(Fn fn) {
		this.fn = fn;
	}

	@Override
	public void run() {
		fn.doAction2();
	}



}
