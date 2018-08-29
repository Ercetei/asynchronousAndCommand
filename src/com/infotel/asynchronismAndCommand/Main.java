package com.infotel.asynchronismAndCommand;

public class Main {

	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		Fn fn = new Fn();
		
		invoker.store(new ExecuteFn(fn));
		invoker.store(new ExecuteFn(fn));
		invoker.store(new StopFn(fn));
		invoker.store(new ExecuteFn(fn));
		invoker.store(new StopFn(fn));
		invoker.store(new ExecuteFn(fn));
		invoker.store(new StopFn(fn));
		
		
		invoker.executeAll();
	}
}
