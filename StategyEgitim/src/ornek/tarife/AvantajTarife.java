package ornek.tarife;

import java.math.BigDecimal;

import ornek.Musteri;

public class AvantajTarife implements Tarife {

	@Override
	public BigDecimal faturaHesapla(Musteri musteri) {
		int konusmaDakika = musteri.getKonusmaDakika();
		int smsSayisi = musteri.getSmsSayisi();
		double internetMB = musteri.getInternetKullanimiMB();
		BigDecimal tutar = BigDecimal.ZERO;

		BigDecimal konusmaTutari = BigDecimal.valueOf(konusmaDakika - 1000);
		konusmaTutari = konusmaTutari.multiply(BigDecimal.valueOf(.35));
		if (konusmaTutari.compareTo(BigDecimal.ZERO) == -1) {
			// ilk 1000 dakika ücretsiz
			konusmaTutari = BigDecimal.ZERO;
		}

		BigDecimal smsTutari = BigDecimal.valueOf(smsSayisi - 500);
		smsTutari = smsTutari.multiply(BigDecimal.valueOf(.5));
		if (smsTutari.compareTo(BigDecimal.ZERO) == -1) {
			// ilk 500 sms ücretsiz
			smsTutari = BigDecimal.ZERO;
		}
		BigDecimal internetTutari = BigDecimal.valueOf(internetMB);
		internetTutari = internetTutari.multiply(BigDecimal.ONE);

		tutar = tutar.add(konusmaTutari);
		tutar = tutar.add(smsTutari);
		tutar = tutar.add(internetTutari);

		// Minimum tarife ücreti
		tutar = tutar.add(BigDecimal.valueOf(100));

		return tutar;
	}

}
