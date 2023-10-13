package ornek.tarife;

import java.math.BigDecimal;

import ornek.Musteri;

public interface Tarife {
	public BigDecimal faturaHesapla(Musteri musteri);
}
