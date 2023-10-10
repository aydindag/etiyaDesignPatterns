package calistir;

import static hesap.HesapMakinesi.Islem.BOL;
import static hesap.HesapMakinesi.Islem.CARP;
import static hesap.HesapMakinesi.Islem.CIKAR;
import static hesap.HesapMakinesi.Islem.TOPLA;

import hesap.HesapMakinesi;
import hesap.IHesapMakinesi;
import hesap.ProxyHesapMakinesi;

public class Calistir {
	public static void main(String[] args) {
		IHesapMakinesi hesapMakinesi = new HesapMakinesi();
		System.out.println(hesapMakinesi.hesapla(1, 2, TOPLA));
		System.out.println(hesapMakinesi.hesapla(2, 3, CARP));
		System.out.println(hesapMakinesi.hesapla(1, 2, CIKAR));
		System.out.println(hesapMakinesi.hesapla(10, 2, BOL));
		System.out.println(hesapMakinesi.hesapla(1, 2, TOPLA));
		System.out.println(hesapMakinesi.hesapla(1, 2, CIKAR));
		// System.out.println(hesapMakinesi.hesapla(12, 0, BOL));
		System.out.println("***************");

		hesapMakinesi = new ProxyHesapMakinesi();
		System.out.println(hesapMakinesi.hesapla(1, 2, TOPLA));
		System.out.println(hesapMakinesi.hesapla(2, 3, CARP));
		System.out.println(hesapMakinesi.hesapla(1, 2, CIKAR));
		System.out.println(hesapMakinesi.hesapla(10, 2, BOL));
		System.out.println(hesapMakinesi.hesapla(1, 2, TOPLA));
		System.out.println(hesapMakinesi.hesapla(1, 2, CIKAR));
		System.out.println(hesapMakinesi.hesapla(12, 0, BOL));

	}
}
