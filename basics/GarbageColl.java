public class GarbageColl {

	private static int counter;
	private static int collectedCounter;
	GarbageColl() {
		counter++;
	}

	@Override
	protected void finalize() {
		System.out.println("Object being garbage collected: " + counter);
		collectedCounter++;
	}

    public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			System.gc();
			new GarbageColl();
		}
		System.out.println("Total objects created " + counter + ", garb collected " + collectedCounter);
    }
}

