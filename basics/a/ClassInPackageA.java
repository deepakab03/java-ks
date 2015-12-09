package a;

//import b.ClassInPackageB;

public class ClassInPackageA {
	public static void main(String[] args) {
		AnotherClassInPackageA a = new AnotherClassInPackageA();

		//following will only compile from outside
		b.ClassInPackageB b = new b.ClassInPackageB();
	}
}

class AnotherClassInPackageA {
}
