package com.infotel.asynchronismAndCommand;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	private List<Thread> functions = new ArrayList<Thread>();

	public Invoker() {
	}

	public void store(Thread fn) {
		this.functions.add(fn);
	}
	
	public void executeAll() {
		for(Thread t: functions) {
			t.run();
		}
	}

}
