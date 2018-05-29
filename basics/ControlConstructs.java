 public class ControlConstructs {

    public static void main(String[] args) {
		//while loop
		int j = 50;
		while (j < 50) {
			j++;
			System.out.println("In while loop: " + j);
		}

		//traditional for loop with break, continue;
		boolean someCondition = false;
		for (int i = 0; i < 50 ; i++) {
			someCondition = ! someCondition;
			if (someCondition) {
				continue;
			}
			System.out.println("In for loop: " + i);
			//break;
		}

		//enhaced for loop
		int k = 0; // need anoter counter variable if we want it to work like old for loop
		for (String arg: args) {
			k++;
			System.out.println("Arg passed: " + arg);
		}

		//write a while loop to iterate over args

		//do-while
		k = 20;
		do {
			System.out.println("In do while:" + k);

		} while (k++ < 20);


		//***conditionals
		//if
		if (k > 20) {
			System.out.println("k > 20");
		} else if (k == 20) {
			System.out.println("k = 20");
		} else {
			System.out.println("k < 20");
		}

		//switch takes ints, enum or string (String from JDK 1.7 onwards)
		k = 0;
		switch (k) {
			case 0:
				System.out.println("in 0 switch");
				break;
			case 1:
				System.out.println("in 1 switch");
				break;
			case 21:
				System.out.println("in 21 switch");
				break;
			default:
				System.out.println("In default switch");
		}

        //switch also works on enums - to be seen later

		String name = "dDeepak";//image name comes from somewhere else
		switch (someFunc()) {//function name or variable
			case "Deepak":
				System.out.println("in Deepak switch");
				break;
			case "Shiva":
				System.out.println("in Shiva switch");
				break;
			default:
				System.out.println("In default string switch");
		}
    }

    static String someFunc() {
		return "abc";
	}
}