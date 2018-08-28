package asynchronismAndCommand;

public class ExecuteFn implements Command {

	private Fn fn;
	
	public ExecuteFn(Fn fn) {
		this.fn = fn;
	}
	
	@Override
	public void execute() {
		fn.executeFn();
	}



}
