package hesap;

import java.util.HashMap;
import java.util.Map;

import hesap.HesapMakinesi.Islem;

public class ProxyHesapMakinesi implements IHesapMakinesi {
	private HesapMakinesi hesapMakinesi = new HesapMakinesi();
	private static Map<String, Integer> sonuclar = new HashMap<>();

	@Override
	public int hesapla(int sayi1, int sayi2, Islem islem) {
		if (Islem.BOL.equals(islem) && sayi2 == 0) {
			// sıfıra bölme hatası oluşmasın diye işlemi yapmayı engelliyoruz.
			// throw new RuntimeException("Sıfıra bölme hatası oluştu");
			System.out.println("Sıfıra bölme hatası oluştu");
			return 0;
		}
		String key = sayi1 + islem.toString() + sayi2;
		// işlem sonucu daha önceki saklanan sonuçlarda var mı diye bakılıyor
		Integer sonuc = sonuclar.get(key);
		if (sonuc == null) {
			// daha önceki sonuçlar içinde yoksa
			sonuc = hesapMakinesi.hesapla(sayi1, sayi2, islem);
			sonuclar.put(key, sonuc);
		}
		return sonuc;
	}

}
