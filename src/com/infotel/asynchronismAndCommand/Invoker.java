package com.infotel.asynchronismAndCommand;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	private List<Command> functions = new ArrayList<Command>();

	public Invoker() {
	}

	public void store(Command fn) {
		this.functions.add(fn);
	}
	
	public void executeAll() {
		for(Command c: functions) {
			c.execute();
		}
	}
}
