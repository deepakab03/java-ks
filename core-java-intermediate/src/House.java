import java.io.*;
/**
 * Threading example
 * @author abrahade
 *
 */
class MailBox {

	private String message;

	private boolean full;

	public synchronized  String getMessage() throws InterruptedException {
		if (message == null) {
			System.out.println("Waiting House to get...");
			wait();
			return message;
		} else {
			return message;
		}
	}

	public synchronized void setMessage(String msg) throws InterruptedException {
		if (message == null || msg == null) {
			message = msg;
			//notifyAll();
		} else {
			System.out.println("Waiting Postman to set...");
			wait();
			message = msg;
		}
	}

	public boolean isFull() {
		return full;
	}

	public synchronized void setFull(boolean mailFull) {
		//if(!mailFull) {

		//}
		full = mailFull;
		notifyAll();
	}


}



class Postman implements Runnable {

	private MailBox mb;

	public Postman(MailBox mb) {
		this.mb = mb;
	}

	public void run() {

	try {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String msg = null;
		System.out.println("Please enter a line: ");

		while (true) {
			if (msg == null) {
				msg = in.readLine();
			}
			if ("Exit".equals(msg)) {
				break;
			}

			System.out.println("Line read is:" +msg);
			//if (!mb.isFull()) {

				mb.setMessage(msg);
				mb.setFull(true);

				msg = null;
			//}
			//} else {
			//	System.out.println("Postman sleeping...");
			//	Thread.sleep(1*1000);
			//	System.out.println("Postman waking...");
			//}
		}

		mb.setMessage("Exit");
		mb.setFull(true);


	 } catch (Exception ex) {
	 	ex.printStackTrace();
	 }
		System.out.println("Exiting Postman...");
	}


}



class House implements Runnable {

	private MailBox mb;

	public House(MailBox mb) {
		this.mb = mb;
	}

	public void run() {

	try {
		Writer w = new FileWriter("C:\\Dev\\deepak\\src\\data");
		BufferedWriter bw = new BufferedWriter(w);

		String msg = null;


		while (true) {

			//if (mb.isFull()) {
				msg = mb.getMessage();
				if ("Exit".equals(msg)) {
					break;
				}

				bw.newLine();
				bw.write(msg, 0, msg.length());
				bw.flush();
				mb.setFull(false);
				mb.setMessage(null);
			//}
			//} else {
			//	System.out.println("House sleeping...");
			//	Thread.sleep(2*1000);
			//	System.out.println("House waking...");
			//}
		}
		bw.close();
		System.out.println("Exiting House...");
	 } catch (Exception ex) {
	 	ex.printStackTrace();
	 }

	}


	public static void main (String args[]) {
		MailBox mb = new MailBox();
		Thread pst = new Thread(new Postman(mb));
		Thread hse = new Thread(new House(mb));

		pst.start();
		hse.start();
	}

}

