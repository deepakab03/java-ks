public class EnumEg {
	private enum TfLight {RED,GREEN,YELLOW;}

	public static void main(String[] args) {
			CoffeeSize cSize = CoffeeSize.BIG;
			cSize.setSize(50);
			System.out.println("Csze: " + cSize);

			CoffeeSize cSize2= Enum.valueOf(CoffeeSize.class, "BIG");
			System.out.println("Csize2: " + cSize2 );

			System.out.println("Csize2 EQUALITY " + (cSize == cSize2 ? "SAME": "NOT SAME"));

			TfLight red = TfLight.RED;

			//iterating over all enum values
			TfLight[] tLights = TfLight.values();
			for (TfLight tLig: tLights) {
				System.out.println("Light: " + tLig + " ordinal:" + tLig.ordinal());
			}
            
            //using enums in a switch statement
            CoffeeSize big = CoffeeSize.OVERWHELMING;
            switch (big) {
                case BIG:
                    System.out.println("in BIG switch");
                    break;
                case HUGE:
                    System.out.println("in HUGE switch");
                    break;
                default:
                    System.out.println("In default enum switch");
            }

	}
}