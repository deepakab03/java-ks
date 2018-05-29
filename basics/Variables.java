/*
 * To demonstrate how instance, static, final behave and are different from each other
 */
public class Variables {
	private int myIntInstance = 1;
	private static int myIntStatic = 1;
		
	//for the purpose of understanding, these variables are  not initialised with any value
	private int anotherIntInstance;
	private static int anotherIntStatic;
	//public final int anotherFinalInt; //try removing the comment and see how it works
										
	
	public int getMyIntInstance() {
		return myIntInstance;
	}
	public void setMyIntInstance(int myIntInstance) {
		this.myIntInstance = myIntInstance;
	}
	public static int getMyIntStatic() {
		return myIntStatic;
	}
	public static void setMyIntStatic(int myIntStatic) {
		Variables.myIntStatic = myIntStatic;
	}
	
	public int getAnotherIntInstance() {
		return anotherIntInstance;
	}
	public void setAnotherIntInstance(int anotherIntInstance) {
		this.anotherIntInstance = anotherIntInstance;
	}
	public static int getAnotherIntStatic() {
		return anotherIntStatic;
	}
	public static void setAnotherIntStatic(int anotherIntStatic) {
		Variables.anotherIntStatic = anotherIntStatic;
	}
	
	public static void main (String agrs[]) {
		
		Variables var1 = new Variables();
		Variables var2 = new Variables();
		
		//instance variables
		if (var1.getMyIntInstance() == var2.getMyIntInstance()) {
			System.out.println("the instance vars are equal");
		} else {
			System.out.println("the instance vars are NOT equal");
		}
		
		//changing the instance var in onle one instance
		var1.setMyIntInstance(3);
		
		if (var1.getMyIntInstance() == var2.getMyIntInstance()) {
			System.out.println("the instance vars are equal");
		} else {
			System.out.println("the instance vars are NOT equal");
		}
		
		//static variables
		if (var1.getMyIntStatic() == var2.getMyIntStatic()) {
			//for the purpose of understanding. static variables are not bound to instance. 
			//so it should not be used like var1.getMyIntStatic() instead it should be used like Variables.getMyIntStatic()
			System.out.println("the static vars are equal");
		} else {
			System.out.println("the static vars are NOT equal");
		}
		
		//changing the static variable
		var1.setMyIntStatic(5);
		if (var1.getMyIntStatic() == var2.getMyIntStatic()) {
			System.out.println("the static vars are equal");
		} else {
			System.out.println("the static vars are NOT equal");
		}
		
		//also try this
		System.out.println("Static Variable:" + Variables.getMyIntStatic());
		
		//default variable values
		System.out.println("Another static int" + Variables.getAnotherIntStatic());
		
		System.out.println("Another int instance: " + var1.getAnotherIntInstance());
		
		
	}
	
}
