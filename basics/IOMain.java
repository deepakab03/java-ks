import java.io.*;
import a.ClassInPackageA;

public class IOMain {

    public static void main(String[] args) throws IOException {
		IOMain ioMain = new IOMain();
		ioMain.traditionalReadUsingReader();
		ioMain.jdk7ReadUsingReader();
		ioMain.readDataFromClassPath();
    }

    void traditionalReadUsingReader() throws IOException {
		System.out.println("Using traditionalReadUsingReader...");
		final FileReader fr = new FileReader("c:\\dev\\t\\1.txt");
		final BufferedReader bf = new BufferedReader(fr);

		try {
			readFile(bf);
		} finally {
			try {
				bf.close();
			} finally {
				fr.close();
			}
		}
	}

	private void readFile(final BufferedReader bf) throws IOException {
		String line = bf.readLine();
		while (line != null) {
			System.out.println("line read: " + line);
			line = bf.readLine();
		}
	}

    void jdk7ReadUsingReader() throws IOException {
		System.out.println("Using jdk7ReadUsingReader...");

		try (final FileReader fr = new FileReader("c:\\dev\\t\\1.txt");
			 final BufferedReader bf = new BufferedReader(fr);) {

			readFile(bf);
		}
	}

	void readDataFromClassPath() throws IOException {
		System.out.println("In readDataFromClassPath...");

		//ClassInPackageA.class.getResourceAsStream("2.txt")
		//IOMain.class.getResourceAsStream("a/2.txt")
		//IOMain.class.getResourceAsStream("/a/2.txt")
		try (InputStream ip = IOMain.class.getResourceAsStream("a/2.txt");
			//conversion from Streams to Reader
			//ITS OKAY TO NEST INPUTSTREAMS LIKE THIS, THE APPROPRIATE CLOSE METHODS WILL BE CALLED
			BufferedReader bf = new BufferedReader(new InputStreamReaderCustom(ip));) {

			readFile(bf);
		}

	}
}

class InputStreamReaderCustom extends InputStreamReader {
	public InputStreamReaderCustom(InputStream inputStream) {
		super(inputStream);
	}

	public void close() throws IOException {
		System.out.println("In InputStreamReaderCustom close");
		super.close();
	}
}