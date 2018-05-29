public interface ConnectionManager {
	//private String name="";
	String getConnection();

	void closeConnection(String con);
}

class SybC implements ConnectionManager {

	public String getConnection() {
		return "Syb";
	}

	public void closeConnection(String con) {
		con = null;
	}
}

class OraC implements ConnectionManager {

	public String getConnection() {
	//String getConnection() {
		return "Ora";
	}

	public String obtainConnection() {
		//String getConnection() {
			return "Ora";
	}

	public void closeConnection(String con) {
		con = null;
	}
}

class ConnFactory {

	private ConnectionManager cm = new OraC();

	ConnectionManager fetchConnectionM() {
		return new OraC();
	}


}