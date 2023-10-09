package calistir;

class Calistir {
	public static void main(String[] args) {
		ConnectionManager cm = new ConnectionManager();
		cm.getConnection();
		ConnectionManager cm2 = new ConnectionManager();
		cm2.getConnection();
		if (cm == cm2) {
			System.out.println("İki connection sınıfı eşittir.");
		} else {
			System.out.println("İki connection sınıfı eşit değildir.");
		}
	}
}
