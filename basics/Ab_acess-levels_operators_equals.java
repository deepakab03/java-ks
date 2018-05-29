class Abc {
	int theAgeOfThePerson;
	static final float PI_VALUE = 3.14156F;
	static int x = 3;
	int z = 2 +5;

	void someMethod() {
		int i = 5;
	}

	public static void main(String[] args) {


			int a = 5;
			int b =6;
			if (a == b) {
				System.out.println("same variable");
			}

			Abc abc = new Abc();
			abc.theAgeOfThePerson = 5;
			abc.z = 7;
			Abc abc1 = abc;// new Abc();
			abc1.theAgeOfThePerson = 5;
			abc1.z = 7;


			if (abc.equals(abc1)) {
				System.out.println("same object" + abc);
			} //not reco

			Tf tfState1 = Tf.RED;
			Tf tfState2 = Tf.RED;


	}
}

enum Tf {
	RED,ORANGE,GREEN;
}

class Dbe {
	void someMethod() {
		int i = 5;
		int j = Abc.x;
		int y = Abc.x;
		Abc.x = 7;
		Abc abc = new Abc();
		abc.theAgeOfThePerson = 5;
		String str = (i>j)?"abc":"xyz";
	}

		public static void main(String[] args) {
				int j = 5;
				System.out.println(j);
	}
}