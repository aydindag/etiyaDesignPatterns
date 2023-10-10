package hesap;

public class HesapMakinesi implements IHesapMakinesi {
	public static enum Islem {
		TOPLA, CIKAR, CARP, BOL;
	}

	public int hesapla(int sayi1, int sayi2, Islem islem) {
		System.out.print("Hesaplanıyor...: ");
		int sonuc = 0;
		if (Islem.TOPLA.equals(islem)) {
			sonuc = sayi1 + sayi2;
		} else if (Islem.CIKAR.equals(islem)) {
			sonuc = sayi1 - sayi2;
		} else if (Islem.CARP.equals(islem)) {
			sonuc = sayi1 * sayi2;
		} else if (Islem.BOL.equals(islem)) {
			sonuc = sayi1 / sayi2;
		}
		return sonuc;
	}
}
