public class Employee extends Person {
    //is it shadowing the same var in Person
    int sameVar= 20;
    
    public Employee() {
		//super(25,"a");
		//System.out.println("in no args e");
		super.getName1();
	}

	public String getName()  {
	    //throws Training4Ex
        return null;
    }

	public Employee getName2() {
        return null;
	}
	
	@Override
    public void someMeth() {
        System.out.println("somevar is:" + sameVar);
    }

    /** Changing a paramtere from int to Integer is overloading and not overriding*/
    @Override
    public void testOverRide(int a1) {
       System.out.println("In Employee");
    }

    /** Changing a paramtere from long to int is overloading and not overriding*/
    @Override
    public void testOverRide2(long a1) {
            System.out.println("In employee long");
    }
}