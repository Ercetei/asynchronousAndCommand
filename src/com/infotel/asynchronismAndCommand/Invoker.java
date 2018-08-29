package com.infotel.asynchronismAndCommand;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

	private List<Thread> functions = new ArrayList<Thread>();
	private int currentIndex = 0 ;

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
	
	public void playIndex() {
		functions.get(currentIndex).run();
		next();
	}
	
	public void next() {
		if (currentIndex < functions.size()) {
			currentIndex++;
			playIndex();
		}
	}

}
