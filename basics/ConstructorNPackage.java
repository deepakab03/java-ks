import a.ClassInPackageA;

public class ConstructorNPackage {

	static int num1;
	private final static Xyz2 xyz11 = new Xyz2();

	private void someMethod() {}

	public static void main(String[] args) {
		int num2 = 0;
		//constructors
        Xyz2 xyz2 = new Xyz2();
        //Xyz2 xyz2 = new Xyz2(4,5);
        xyz2.printVars();

        //accessing a class in a different package.
		ClassInPackageA ca = new ClassInPackageA();
	}
}


class Xyz2{
    int var1 = 5;
    int var2;


    Xyz2() {
		this(2,5);
        System.out.println("In constructor of Xzy2");
    }

    Xyz2(int var1, int localVar2) {
            System.out.println("In constructor 2 of Xzy2");
            this.var1 = var1;
            var2 = localVar2;
    }

	public void someMethodB() {
		Week week = new Week();
		week.dayOfWeek = 5;
		System.out.println("Array state: " + new ArrayEx().num1 + Week.NUM_DAY_IN_WEEK);

		//Xyz2 xyz2 = new Xyz2();

	}

    public void printVars() {
		//'this' keyword can be used anywhere
		int var2= 5; //var2 at instance leve is shadowed
		System.out.println("Var1: " + var1 + ", var2:" + this.var2);
    }
}
