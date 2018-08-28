package asynchronismAndCommand;

public class StopFn implements Command {

	private Fn fn;
	
	public StopFn(Fn fn) {
		this.fn = fn;
	}

	@Override
	public void execute() {
		fn.stopFn();
	}



}
