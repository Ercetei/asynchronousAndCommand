package com.infotel.asynchronismAndCommand;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	private List<Command> functions = new ArrayList<Command>();
	private int currentIndex = 0 ;

	public Invoker() {
	}

	//Add Function
	public void store(Command fn) {
		this.functions.add(fn);
	}
	
	public void executeAll() {
		for(Command c: functions) {
			c.execute();
		}
	}
	
	public void playIndex() {
		functions.get(currentIndex).execute();
		next();
	}
	
	public void next() {
		if (currentIndex < functions.size()) {
			currentIndex++;
			playIndex();
		}
	}
	
}
