public class ArrayEx {

	int num1;
	private void someMethod() {}

	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3};

		System.out.println("Size of nums: " + nums.length);

		//array of type Xyz
		Xyz[] xyzArray = new Xyz[3];
		//how to populate this array?
	}
}


class Xyz{

	public void someMethodB() {
		Week week = new Week();
		week.dayOfWeek = 5;
		System.out.println("Array state: " + new ArrayEx().num1 + Week.NUM_DAY_IN_WEEK);

	}
}

//static not static.
class Week {
	public static int NUM_DAY_IN_WEEK = 7;

	int dayOfWeek;
}