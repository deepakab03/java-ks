public class OverridingOverloadingEg {

    public static void main(String[] args) {
		AutomotiveVehicle au1 = new AutomotiveVehicle();
		AutomotiveVehicle au2 = new Car();
		AutomotiveVehicle au3 = new Truck();

		au1.move();
		au1.move(3);
		au2.move();
		au3.move();

		AutomotiveVehicle au4 = au3;//not allowed (invlaid casting)
		//Car c1 = (Car) au4;
		//Car c2 = (Car) new Truck();
    }
}