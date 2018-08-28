package asynchronismAndCommand;

public class Main {

	public static void main(String[] args) {
		Fn newFn = new Fn();

		for (int i = 0; i < 100; i++) {
			Command executeFn = new ExecuteFn(newFn);
			Command stopFn = new StopFn(newFn);
		}
	}

}
