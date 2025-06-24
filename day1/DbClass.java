package week3.day1;

public class DbClass implements DatabseConnection {

	@Override
	public void connect() {
		System.out.println("connection succesful");
		
	}

	@Override
	public void disconnect() {
		System.out.println("disconnected database");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("execute updated");
		
	}
	
public static void main(String[] args) {
		DbClass obj = new DbClass();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();

	}


}
