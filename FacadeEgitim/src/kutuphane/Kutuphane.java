package kutuphane;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Kutuphane {
	private Map<KitapTuru, Kat> katlar = new HashMap<>();

	public Kutuphane() {
		// Her bir kitap türü için bir kat oluşturuyoruz
		Arrays.stream(KitapTuru.values()).forEach(tur -> katlar.put(tur, new Kat()));
	}

	public Kat getKat(KitapTuru tur) {
		return katlar.get(tur);
	}
}
