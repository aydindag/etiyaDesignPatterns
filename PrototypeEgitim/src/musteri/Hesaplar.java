package musteri;

import java.math.BigDecimal;
import java.util.Map;

import lombok.Data;

@Data
public class Hesaplar {
	private int[] hesapNumaralari;
	private Map<Integer, BigDecimal> fatura;
}
