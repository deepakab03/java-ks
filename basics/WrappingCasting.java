 public class WrappingCasting {

    public static void main(String[] args) {
        byte a = 2;//casting to byte is done automatically for us by compiler
		byte b = 3;
        byte c = (byte)128;
        //byte d = a+b
        int a1 = 5;
        //a1.intValue(); will not work, why?
        Integer b1 = new Integer(a1);//don't do this, not optimal

        //no b1.setInt(6) method
        b1 = new Integer(6);//immutable

        //Use one of the two ways below
        //auto boxing
		Integer c1 = 7;// automatically does below
		Integer d1 = Integer.valueOf(8);

		//new Integer(6) is done for us by compiler
		//Integer.valueOf(6)
        System.out.println(b1+c1);

		//auto un-boxing
		int e1 = c1;
		if (a1 < b1) {
        //if (a1 < b1.intValue()) {
			System.out.println("a1 lesser than b1");
		}

		//wrapper classes are immutable
		d1 = 9;//can assign can't change d1
		System.out.println(new Integer("42"));

		//incrment changes value
		c1++; //(int temp = c1.intValue(); temp++; c1 = Integer.valueOf(temp))
		System.out.println(c1);


		//casting
		//Number n1 = new Float(1);
		Number n1 = new Integer(1);
		Integer f1 = (Integer) n1;//have to explicitly cast, will give ClassCastException if n1 is a Float

		//parsing
		System.out.println("Parsing: " + Integer.valueOf("25.5"));
    }
}

