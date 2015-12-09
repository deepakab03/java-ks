public class Person {

    public void walk() {
		//doesn't makes sense to do:
		//Person someOtherPerson = new Person();
		//someOtherPerson.getUp();
		//we have to getUp() overselves
		getUp();
		System.out.println("Starting to walk");
    }

    public void getUp() {
		 System.out.println("Getting up if required");
    }
}