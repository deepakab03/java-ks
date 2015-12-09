import a.ClassInPackageA;

 public class Running {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println ("No args ");
		} else if (args.length == 1) {
			System.out.println("Arg 0: " + args[0]);
		} else {
			System.out.println("Arg 0: " + args[0] + ", Arg 1: " + args[1]);
		}
		//accessing a class in a different package.
		//ClassInPackageA ca = new ClassInPackageA();
	}
}

