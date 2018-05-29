
import java.io.*;
import java.util.*;

/**
 * This class is a class for training examples
 * @author deepak
 * 
*/
public class First {

	private int pf = 10;
	String  df = "df";
	protected String prof = "prof";
	public String pubf = "pubf";

	public static void main (String args[])  throws Exception{

		System.out.println("Hello world!");


        //Arrays
        //int[] j = new int[1];
		//j[0]=5;

		//Employee e = new Employee();
		//sop(i.length);
		//Second s = new Second(1,2);
		
		//sub class fundas
//		Person p = new Employee();
//		System.out.println(p.sameVar);
//		p.someMeth();

        //*enums
        /*
        enumEx();
        */

        /* Overriding ex
        Person p1 = new Employee();
        p1.testOverRide(1);
        */

        /* Exception ex
        execeptionEg();
        */

        /*Garbage collection eg */
        //gcEg();


        //*Assert ex -  java -ea First
        //new AssertEx(1);

        //*io examples
        //ioOp();

        /* Object serialization ex
        objestSerialEx();
        */

        //* Collections
        //collList();
        //collSet();
        //collMap();

        /*Cloning */
	    //Person p1 = new Person(24,"a");
        //Person p2 = (Person)p1.clone();
        //Person p3 = new Person(22,"b");

        //Class cl = Person.class;


        //if (p1.getClass() == p3.getClass()) System.out.println("true");
        //if (p1.equals(p2)) System.out.println("true");

        //((Employee)p1).getName2();

        //System.out.println(p1);

        //System.out.println(new ConnFactory().getCm());

        //System.getProperties().load(Person.class.getResourceAsStream("p.props"));
        //System.out.println(System.getProperty("ALLOWD_VALUES"));


        //inner();



	}

    private static void enumEx() {
        PlanetEnum planet = PlanetEnum.EARTH;
        //use in switch
        switch (planet) {
            case EARTH:
                  break;
            case MERCURY:
                break;
            case MARS:
                break;
            //case 5:
            //break;

        }
        //call custom methods
        System.out.println(planet + " perimeter:" + planet.calcPerimeter());
        //use the static values() method that all enums have
        for (PlanetEnum planetObj: PlanetEnum.values()) {
            System.out.println(planetObj);
        }
        //Use EnumSet and EnumMap for enum
         System.out.println("Using a range");
        for (PlanetEnum planetObj: EnumSet.range(PlanetEnum.MARS, PlanetEnum.VENUS)) {
                System.out.println(planetObj);
                System.out.println(planetObj.hasLife());
        }
    }

	static void inner() {
			//inner class
			final List<Person> ll = new ArrayList<Person>();
			for( int i = 0; i< 10 ;i++ ) {
				Person p = new Person(i,(int)(Math.random()*100)+"Tar"+i);
				System.out.println(" p before: "+ p );
				ll.add(p);
			}

			Collections.sort(ll, new Comparator<Person>() {

					public int compare(Person o1,  Person o2) {
							if(o1.name != null && o2.name != null) {
									return o1.name.compareTo(o2.name);
							}
									return -1;
							}

					 public boolean equals(Object obj)  {
						 ll.size();
						 return false;
	            	 }
				});

			for(Person p: ll) {
				System.out.println("p after: " + p);
			}
		}


	static void collMap() {
        Map<Integer,Person> m = null;
		m = new HashMap<Integer,Person>();
		// m = new TreeMap<Integer,Person>();
        // m = new LinkedHashMap<Integer,Person>();
        int randomKey = 0;
		for( int i = 10; i > 0 ;i-- ) {
            randomKey = (int)(Math.random()*100);
            Person p = new Person(i,"Tar"+i);
            System.out.println(" before p map: key: " +randomKey + ", value: " + p );
            m.put(randomKey, p);
		}

        Person p = m.get(randomKey);
		System.out.println(" p : "+ p );

		//iter
		Iterator<Integer> itr = m.keySet().iterator();
		while( itr.hasNext()) {
				Integer key = itr.next();
                System.out.println(" after addition, iteration map: key: " +key + ", value: " + m.get(key));
		}
	}

	static void collSet() throws Exception {
			Employee e = new Employee();
			Person p1 = new Person(24,"a");
			Person p2 = (Person)p1.clone();
			Person p3 = new Person(22,"b");
			Class c1 = Person.class;

			Set<Person> s =new HashSet<Person>();
			s.add(p1);
			s.add(p2);
			//l.add(c1);
			s.add(p3);

			System.out.println("******************************duplicates");
			System.out.println(" s init size: " + s.size());

            /* adding some more
			Set<Person> s2 =new HashSet<Person>();
			s2.add(p1);
			s2.add(e);
			s2.add(p3);
			System.out.println(" s2 size: " + s2.size());

			s.addAll(s2);
			System.out.println(" s after adding size: " + s.size());

			//l.clear();
			//System.out.println(" l size after clear: " + l.size());


			System.out.println("******************************iter");
			Iterator<Person> itr = s.iterator();
			while ( itr.hasNext()) {
				Person p = itr.next();
				System.out.println(p);
				if (p == p3) {
					itr.remove();
				}
			}
			System.out.println(" s after iter and rem size: " + s.size());
            */

            /* sorting
			System.out.println("******************************sorting");
			//Set<Person> ss = new TreeSet<Person>();
			//Set<Person> ss = new HashSet<Person>();
			Set<Person> ss = new LinkedHashSet<Person>();
			for( int i = 0; i< 10 ;i++ ) {
				Person p = new Person((int)(Math.random()*100),"Tar"+i);
				System.out.println(" p before: "+ p );
				ss.add(p);
			}

	        Iterator<Person> is = ss.iterator();
			while ( is.hasNext()) {
				Person p = is.next();
				System.out.println(" p after: "+p);
			}
            */

	}

	static void collList() throws Exception {
		Employee e = new Employee();
		Person p1 = new Person(24,"a");
		Person p2 = (Person)p1.clone();
		Person p3 = new Person(22,"b");
		Class c1 = Person.class;

        //note the capacity, uses an array internally
		List<Person> l = new ArrayList<Person>(5);
		l.add(p1);
        //possible to add an instance of subclass
		l.add(e);
        //adding an instance of a different object fails
		//l.add(c1);
		l.add(0,p3);

		Person p33 = l.get(0);
		System.out.println("******************************First person and list size");
		System.out.println(p33.getName() + " size: " + l.size());
        //printing a list
        System.out.println("******************************Printing a list");
		System.out.println(l);

		List<Person> l2 =new ArrayList<Person>();
		l2.add(p1);
		l2.add(e);
		l2.add(p3);
		System.out.println("******************************addAll");
		System.out.println(" l2 size: " + l2.size());

		l.addAll(l2);
		System.out.println(" l size after addition: " + l.size());

        System.out.println(" l contains p1: " + p1 + ": " + l.contains(p1));
		//l.clear();
		//System.out.println(" l size after clear: " + l.size());

		/* avoid the following and use enhanced for loops which work with iterator and would
         * work equally well for an arraylist or a linkedlist
         */
        /*for(int i = 0; i < l.size(); i++) {
			Person p =  l.get(i);
			System.out.println(p);
        }*/

        /*concurrent modification exception eg
		for(Person p: l) {
			System.out.println("p before: "+ p);
            l.remove(1);
		}
        */


		//comparator eg
        /*
		System.out.println("******************************comp");
		List<Person> ll = new ArrayList<Person>();
		for (int i = 0; i< 10 ;i++ ) {
            Person p = new Person(i,(int)(Math.random()*100)+"Tar"+i);
            System.out.println(" p before: "+ p );
            ll.add(p);
		}

		Collections.sort(ll, new PerCom());


		for(Person p: ll) {
			System.out.println("p after: " + p);
		}
        */



	}


	void strings() {
		String a = "Ashok";
			String b = "Ashok";
			String c = new String("Ashok");
			if (a == b) System.out.println("true");

			if (a == c) System.out.println("true");

			if (a.equals(c)) System.out.println("true eq");

			a=a + "abcd";
			//a.concat("dee");

				StringBuilder sb = new StringBuilder(1000);
				sb.append("abcd");

			a = a + "d";

	}

    static void execeptionEg() {
		try {
			Person p = new Employee();
            p.someOperation();
			((Employee)p).getName2();
			System.out.println("Before!");
		} catch (TrainingEx te) {
			te.printStackTrace();
			//Object t = te;
			if (te instanceof TrainingEx) {
				System.out.println("true!");
			}
			//throw te;
		}
		finally {
			System.out.println("In finally!");
		}

	}

	static void gcEg() throws Exception {
			for(int i=0; i < 10; i++) {
					Person p2 = new Person();
					//System.gc();
					//Thread.sleep(1000);
					//System.gc();
		}
        System.gc();
	}


	private static class PerCom implements Comparator<Person> {
        public int compare(Person o1,  Person o2) {
            if(o1.name != null && o2.name != null) {
                return o1.name.compareTo(o2.name);
        }
                return -1;
        }

         public boolean equals(Object obj)  {
             return false;
         }
    }

    private static final void ioOp() throws IOException {
        String line = "Test output";

        /* Reading strings from standard input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        line = reader.readLine();
        System.out.println("You typed: " + line);
        reader.close();
        */

        //writing to file -  can use OutputStreamWriter to convert from chars to byte stream
        //use to flush to flush contents if needed
        /* BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
        writer.write(line);
        writer.close();
        System.out.println("Wrote : " + line);
        */

        //io2();

        //pipedStreamEx();

    }

    /** Read data from one file and and put into another */
    static void io2() throws IOException {
            BufferedReader in
               = new BufferedReader(new FileReader("foo.in"));
            //BufferedWriter out = new BufferedWriter(new FileWriter("foo.out.in"));
            PrintWriter out =
                new PrintWriter(new BufferedWriter(new FileWriter("foo.out.in")));
            String lineString = null;

            while ((lineString = in.readLine()) != null) {
                System.out.println(">"+lineString);
                //out.write(lineString, 0 , lineString.length());
                //out.newLine();
                out.println(lineString);
            }
            in.close();

            out.close();
    }

    private static final void pipedStreamEx() throws IOException {
        final PipedInputStream inputPipe = new PipedInputStream();
        final PipedOutputStream outputPipe = new PipedOutputStream(inputPipe);

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                String s = "This is a test.";
                try {
                  for (int i = 0; i < s.length(); ++i) {
                    outputPipe.write(s.charAt(i));
                    System.out.println("in " + " wrote " + s.charAt(i));

                    if (i ==10) Thread.sleep(2000);

                  }
                  outputPipe.write('!');
                } catch (IOException ex) {
                  System.out.println("IOException in PipeOutput");
                } catch (InterruptedException ex) {
                }

            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {

                try {
                  while (true) {
                    int inChar = inputPipe.read();
                    if (inChar != -1) {
                      char ch = (char) inChar;
                      if (ch == '!') {
                        break;
                      } else
                        System.out.println("out " + " read " + ch);
                    }
                  }
                } catch (IOException ex) {
                  System.out.println("IOException in PipeOutput");
                }


            }
        });
        t1.start();
        t2.start();
    }

    private static void objestSerialEx() throws IOException, ClassNotFoundException {
        //write and read objects
        /* */ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("objOp.obj"));
        out.writeObject(new Person(20, "Vinay"));
        out.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("objOp.obj"));
        Person p = (Person) in.readObject();
        System.out.println("Person read:" + p);
        in.close();
    }



}

 class Second {
	 private int s = 15;;
	 int a;
	 int b;
	 First first = new First();
	 static int[] i = new int[1];
	 {
	 		i[0]=5;
		System.out.println("Hello world!");
		i = null;
	}
		public Second(int a1, int b1) {
			a = a1;
			b = b1;
//			sop(""+a+ ""+b);
//	sop(first.pubf + first.prof)

		}

}