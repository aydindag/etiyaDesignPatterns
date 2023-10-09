package calistir2;

public class ConnectionManager {
	private static ConnectionManager instance = new ConnectionManager();

	public static ConnectionManager getInstance() {
		return instance;
	}

	private ConnectionManager() {

	}

	public void getConnection() {
		System.out.println("getConnection çağırıldı.");
	}
}
