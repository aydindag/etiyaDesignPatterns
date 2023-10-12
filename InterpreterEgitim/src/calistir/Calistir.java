package calistir;

import hesap.HesapMakinesi;

public class Calistir {
	public static void main(String[] args) {
		HesapMakinesi hesapMakinesi = new HesapMakinesi();
		System.out.println(hesapMakinesi.hesapla("5 6 2 3 + * +", true));
	}
}
