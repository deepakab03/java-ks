public class TrainingEx extends Exception {

	public TrainingEx(String message) {
		super(message);
	}
}

class Training4Ex extends TrainingEx {
	Training4Ex(String message) {
		super(message);
	}
}

class RunTimeTraEx extends RuntimeException {

	public RunTimeTraEx(String message) {
		super(message);
	}
}
