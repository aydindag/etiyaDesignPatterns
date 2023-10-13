package ornek.tarife;

import java.math.BigDecimal;

import ornek.Musteri;

public class PlatinyumTarife implements Tarife {

	@Override
	public BigDecimal faturaHesapla(Musteri musteri) {
		int konusmaDakika = musteri.getKonusmaDakika();
		double internetMB = musteri.getInternetKullanimiMB();
		BigDecimal tutar = BigDecimal.ZERO;

		BigDecimal konusmaTutari = BigDecimal.valueOf(konusmaDakika - 2000);
		konusmaTutari = konusmaTutari.multiply(BigDecimal.valueOf(.35));
		if (konusmaTutari.compareTo(BigDecimal.ZERO) == -1) {
			// ilk 2000 dakika ücretsiz
			konusmaTutari = BigDecimal.ZERO;
		}

		BigDecimal internetTutari = BigDecimal.valueOf(internetMB - 5000);
		internetTutari = internetTutari.multiply(BigDecimal.ONE);
		if (internetTutari.compareTo(BigDecimal.ZERO) == -1) {
			// ilk 5000 MB ücretsiz
			internetTutari = BigDecimal.ZERO;
		}

		// SMS tamamen ücretsiz
		tutar = tutar.add(konusmaTutari);
		tutar = tutar.add(internetTutari);

		// Minimum tarife ücreti
		tutar = tutar.add(BigDecimal.valueOf(200));

		return tutar;
	}

}
