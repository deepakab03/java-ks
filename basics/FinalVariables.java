public class FinalVariables {
	//for the prupose of understanding, these vars are declred public; it should be private elsewhere
	public final int finalInt = 1;
	public int nonFinalInt = 2;
	
		
	public static void main(String args[]) {
		final FinalVariables finalVariables = new FinalVariables(); //see the camel case notation for naming variables
		FinalVariables finalVariables1 = new FinalVariables();
		finalVariables.nonFinalInt = 3; //even though finalVariables is final, no compiler error. Find out why.
		finalVariables1 = new FinalVariables();
		
		// try uncommenting these lines. you will get compiler error
		//finalVariables1.finalInt = 2;			
		//finalVariables = new FinalVariables();
	}

}


