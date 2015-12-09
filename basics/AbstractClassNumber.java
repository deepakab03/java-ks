public abstract class AbstractClassNumber {

	public abstract int intValue();

	public short shortValue() {
		doSomething();
		return (short) intValue();
	}

	private void doSomething() {
	}
}


class Integer2 extends AbstractClassNumber implements InterfaceNum2, InterfaceNum3 {
	private int value;

	Integer2(int value) {
		this.value = value;
	}

	public int intValue() {
		return value;
	}

	public float floatValue() {
			return value;
	}

	public double doubleValue() {
			return value;
	}
}

interface InterfaceNum2 {

	float floatValue();
}

interface InterfaceNum3 {

	double doubleValue();
}

