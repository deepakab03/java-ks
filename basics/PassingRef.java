public class PassingRef {

    int num1;

    private void someMethod(Xyz2 xyz) {
			System.out.println("In someMethod: " + xyz);
	}

	public void someB() {
			Xyz2 x2 = new Xyz2();
			someMethod(x2);
    }

    public static void main(String[] args) {
		Xyz2 x2 = new Xyz2();

		//following is illegal
		//someMethod(x2);

		PassingRef pref = new PassingRef();
		pref.someMethod(xyz);
		//pref.someB();
    }
}

