package ornek.tarife;

import java.math.BigDecimal;

import ornek.Musteri;

public class SuperTarife implements Tarife {

	@Override
	public BigDecimal faturaHesapla(Musteri musteri) {
		int konusmaDakika = musteri.getKonusmaDakika();
		int smsSayisi = musteri.getSmsSayisi();
		double internetMB = musteri.getInternetKullanimiMB();
		BigDecimal tutar = BigDecimal.ZERO;

		BigDecimal konusmaTutari = BigDecimal.valueOf(konusmaDakika);
		konusmaTutari = konusmaTutari.multiply(BigDecimal.valueOf(.35));

		BigDecimal smsTutari = BigDecimal.valueOf(smsSayisi);
		smsTutari = smsTutari.multiply(BigDecimal.valueOf(.5));

		BigDecimal internetTutari = BigDecimal.valueOf(internetMB);
		internetTutari = internetTutari.multiply(BigDecimal.valueOf(1.2));

		tutar = tutar.add(konusmaTutari);
		tutar = tutar.add(smsTutari);
		tutar = tutar.add(internetTutari);

		// Minimum tarife ücreti yok

		return tutar;
	}

}
