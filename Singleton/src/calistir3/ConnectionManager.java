package calistir3;

public class ConnectionManager {
	// Lazy Initialization
	private static ConnectionManager instance;

	public static ConnectionManager getInstance() {
		if (instance == null) {
			synchronized (ConnectionManager.class) {
				if (instance == null) {
					instance = new ConnectionManager();
				}
			}
		}
//      Kodumuz Thread kullanmıyorsa IF aşağıdaki gibi yazılmalıdır.
//		if (instance == null) {
//			instance = new ConnectionManager();
//		}
		return instance;
	}

	private ConnectionManager() {
		System.out.println("Constructor cagirildi");
	}

	public void getConnection() {
		System.out.println("getConnection çağırıldı.");
	}
}
