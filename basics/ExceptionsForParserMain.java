public class ExceptionsForParserMain {

	public static void main(String[] args) {
		//throw new DeepakUncheckedEx();
		ExceptionsForParserMain obj = new ExceptionsForParserMain();
		try {
			obj.someMethod();
			System.out.println("After calling someMethod()");

		} catch (DeepakCustomCheckedEx ex) {
			ex.printStackTrace();
			//send email

		}
		System.out.println("After catching ex");

	}

	public void someMethod()  throws DeepakCustomCheckedEx {
		//..
		//..
		if (1 < 2 ) {
			throw new DeepakCustomCheckedEx();
			//int j =5; illegal
		}
	}
}