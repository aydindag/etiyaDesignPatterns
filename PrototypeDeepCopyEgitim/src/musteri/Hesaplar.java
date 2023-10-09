package musteri;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class Hesaplar implements Cloneable {
	private int[] hesapNumaralari;
	private Map<Integer, BigDecimal> fatura;

	@SuppressWarnings("unchecked")
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Hesaplar copyHesaplar = (Hesaplar) super.clone();
		HashMap<Integer, BigDecimal> fatura = (HashMap<Integer, BigDecimal>) copyHesaplar.getFatura();
		copyHesaplar.setFatura((Map<Integer, BigDecimal>) fatura.clone());
		return copyHesaplar;
	}
}
