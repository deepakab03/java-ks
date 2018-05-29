public class StringMain {

    public static void main(String[] args) {	

		String name = "Deepak";
		String name1 = "Deepak";
		String name2 = new String("Deepak");

		if (name == name2) {
			System.out.println("Name references are equal");
		} else if (name.equals(name2)) {
			System.out.println("Name references are equal by string.equals()");
		}

		String fullName = name.concat("Abraham");
		System.out.println("Name after concat: " + name + ", fullName:" + fullName);

		//for string manipulation and creation don't use + use StringBuilder (how is it different from StringBuffer?)
		StringBuilder sb = new StringBuilder();
		sb.append("Deepak");
		sb.append(" Abraham");
		sb.deleteCharAt(0);
		System.out.println("Name after sb: " + sb);
    }
}