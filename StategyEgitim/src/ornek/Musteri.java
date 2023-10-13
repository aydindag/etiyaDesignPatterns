package ornek;

import java.math.BigDecimal;

import lombok.Data;
import ornek.tarife.Tarife;

@Data
public class Musteri {
	private String adi;
	private int konusmaDakika;
	private int smsSayisi;
	private double internetKullanimiMB;

	private Tarife tarife;

	public BigDecimal getFaturaTutari() {
		return tarife.faturaHesapla(this);
	}
}
