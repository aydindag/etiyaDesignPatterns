package musteri;

import lombok.Data;

@Data
public class Musteri implements Cloneable {
	private long id;
	private String adi;
	private String soyadi;
	private Hesaplar hesaplar;

	@Override
	public Object clone() throws CloneNotSupportedException {
		Musteri copyMusteri = (Musteri) super.clone();
		Hesaplar copyHesaplar = (Hesaplar) copyMusteri.getHesaplar().clone();
		copyMusteri.setHesaplar(copyHesaplar);
		return copyMusteri;
	}
}
