package calistir;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import musteri.Hesaplar;
import musteri.Musteri;

public class Calistir {
	public static void main(String[] args) throws CloneNotSupportedException {
		Musteri musteri = new Musteri();
		musteri.setAdi("Ahmet");
		musteri.setSoyadi("Uzun");
		musteri.setId(275436L);

		Hesaplar hesaplar = new Hesaplar();
		hesaplar.setHesapNumaralari(new int[] { 12, 22, 36 });

		Map<Integer, BigDecimal> faturalar = new HashMap<>();
		faturalar.put(1, new BigDecimal("432.23"));
		faturalar.put(2, new BigDecimal("324.44"));

		hesaplar.setFatura(faturalar);

		musteri.setHesaplar(hesaplar);

		System.out.println(musteri);

		// Shallow copy yöntemi ile değişkenlerdeki sınıfların kopyaları çıkartılmadan
		// sadece musteri sınıfının kopyası çıkarılıyor.
		Musteri musteri2 = (Musteri) musteri.clone();
		// musteri'nin adı değişmiyor
		musteri2.setAdi("Mehmet");
		// musteri'nin hesapları değişiyor.
		musteri2.getHesaplar().getFatura().put(3, new BigDecimal("521.78"));
		System.out.println("*** Clone üretildikten sonra: ***");
		System.out.println("Müşteri 1: " + musteri);
		System.out.println("Müşteri 2: " + musteri2);
	}
}
