package calistir4;

class Calistir {
	public static void main(String[] args) {
		ConnectionManager cm = ConnectionManager.INSTANCE;
		// ConnectionManager cm3 = new ConnectionManager();
		cm.getConnection();
		ConnectionManager cm2 = ConnectionManager.INSTANCE;
		cm2.getConnection();
		if (cm == cm2) {
			System.out.println("İki connection sınıfı eşittir.");
		} else {
			System.out.println("İki connection sınıfı eşit değildir.");
		}
	}
}
