import java.io.*;

public class Person implements Serializable, Cloneable, Comparable<Person> {

	private static final long serialVersionUID = 1L;
	static int personCounter = 0;
    private final int currentPersonNum;
    
	int age;

	//transient
    String name;
    
    int sameVar= 10;

    

	public Person() {
		//this(2,"d");

		//System.out.println("in no args p");
        currentPersonNum = personCounter++;
	}

	public Person(int _age, String _name) {
        this();
		age = _age;
		name = _name;
		//System.out.println("in 2   args");
		//System.out.println(this.name);
	}

	public Person(String _name) {
            this();
			name = _name;

	}
	
	public void someMeth() {
	    System.out.println("somevar is:" + sameVar);
	}

	public int getAge() {
		return age;
	}

    /** Changing a paramtere from int to Integer is overloading and not overriding*/
    public void testOverRide(int a1) {
            System.out.println("In person");
    }

    /** Changing a paramtere from long to int is overloading and not overriding*/
    public void testOverRide2(long a1) {
            System.out.println("In person long");
    }

	/**
	 * Returnts the name
	*/
	public String getName() {
			return name;
	}

    /**
     * Does something
     * @Throws TrainingEx when ..
     * @Throws RunTimeTraEx when ..
    */
    public void someOperation() throws TrainingEx,RunTimeTraEx {

        if(name == null) {
            //if(true) throw new RunTimeTraEx("name is null");
            throw new TrainingEx("name is null");
        }
    }

	public Person getName1() {
				return null;
	}

    @Override
	public void finalize() throws Exception {
        System.out.println(currentPersonNum + "th person being gc");
	}

    @Override
	public Person clone() {
        try {
		    return (Person) super.clone();
        } catch (CloneNotSupportedException c) {

        }
        assert false : "should never come here";
        return null;
	}

	public boolean equals(Object obj) {
        System.out.println ("in equals for person: " + getName() + " checking other: " + obj);

		if (this == obj) return true;

		if (obj == null || (getClass() != obj.getClass())) return false;

		Person p = (Person)obj;
		if (name != null && name.equals(p.name)) {
			if (age == p.age) return true;
		}

		return false;

	}

	public int hashCode() {
		int personCounter = 7;
		personCounter = personCounter + new Integer(age).hashCode();
		personCounter = personCounter + (name != null ? name.hashCode(): 0);

        System.out.println ("in hash code for person:" + getName() + " code: " + personCounter);
		return personCounter;
	}

	public String toString() {
		return String.format("Name - [%s],Age - %d ", name, age);
	}

	public int compareTo(Person p) {
		if (p != null) {
			if (age == p.age ) return 0;
			if (age > p.age ) return 1;
		}
		return -1;
	}

    /** additional test method */
    /*
    public int calcAgeInDays() {
        return 100;
    }
    */
}