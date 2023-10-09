package calistir3;

class Calistir {
	public static void main(String[] args) {
		ConnectionManager cm = ConnectionManager.getInstance();
		cm.getConnection();
		ConnectionManager cm2 = ConnectionManager.getInstance();
		cm2.getConnection();
		if (cm == cm2) {
			System.out.println("İki connection sınıfı eşittir.");
		} else {
			System.out.println("İki connection sınıfı eşit değildir.");
		}
	}
}
