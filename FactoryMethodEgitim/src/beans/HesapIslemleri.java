package beans;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HesapIslemleri {
	private HesapFactory factory;

	public Hesap hesapAc(String hesapTipi) {
		Hesap hesap = factory.hesapOlustur(hesapTipi);

		kimlikKontrolu(hesap);
		tarifeBelirle(hesap);
		hesabiOlustur(hesap);

		return hesap;
	}

	public void kimlikKontrolu(Hesap hesap) {

	}

	public void tarifeBelirle(Hesap hesap) {

	}

	public void hesabiOlustur(Hesap hesap) {

	}

}
