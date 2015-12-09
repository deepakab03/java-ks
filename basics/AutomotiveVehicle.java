public class AutomotiveVehicle {
	Number move() {
		System.out.println("Moving generally");
		return new Byte((byte)5);
	}

	Person move(int num1) {
			System.out.println("Moving generally wiht int:  " + num1);
			return new Person();
	}

	Number move(long num1) {
				System.out.println("Moving generally wiht long:  " + num1);
				return new Byte((byte)5);
	}
}

class Car extends AutomotiveVehicle {
	Integer move() {
		System.out.println("Moving like a car");
		return new Integer(10);
	}
}

class Truck extends AutomotiveVehicle {
	public Number move() {
		System.out.println("Moving like a truck");
		return new Long(15);
	}
}