package calistir;

import kutuphane.Kitap;
import kutuphane.KitapTuru;
import kutuphane.Kutuphane;
import kutuphane.Kutuphaneci;

public class Calistir {
	public static void main(String[] args) {
		Kutuphaneci kutuphaneci = new Kutuphaneci(new Kutuphane());
		kutuphaneci.kitapEkle(new Kitap(KitapTuru.HIKAYE, "Kaşağı", "Ömer Seyfettin"));
		kutuphaneci.kitapEkle(new Kitap(KitapTuru.HIKAYE, "Sefiller", "Victor Hugo"));
		kutuphaneci.kitapEkle(new Kitap(KitapTuru.ROMAN, "Mutluluk", "Livaneli"));
		kutuphaneci.kitapEkle(new Kitap(KitapTuru.KORKU, "Hayvan Mezarlığı", "Stephen King"));
		kutuphaneci.kitapEkle(new Kitap(KitapTuru.KORKU, "Tepki", "Stephen King"));

		System.out.println(kutuphaneci.getKitap(KitapTuru.HIKAYE, "Kaşağı"));
		System.out.println(kutuphaneci.getKitap(KitapTuru.SIIR, "Muczuplar"));
		System.out.println(kutuphaneci.getKitap(KitapTuru.HIKAYE, "Kaşağı"));
		System.out.println(kutuphaneci.getKitap(KitapTuru.HIKAYE, "Sefiller"));

	}
}
