package beans;

import java.util.HashMap;
import java.util.Map;

public class Personel {
	private Map<String, Object> degerler = new HashMap<>();

	public void setDeger(String key, Object value) {
		degerler.put(key, value);
	}

	public Object getDeger(String key) {
		return degerler.get(key);
	}

	@Override
	public String toString() {
		StringBuilder sonuc = new StringBuilder("Personel (");
		degerler.entrySet().forEach(e -> {
			sonuc.append(e.getKey());
			sonuc.append(": ");
			sonuc.append(e.getValue());
			sonuc.append(",");
		});
		// sondaki ',' karakterini siliyoruz.
		sonuc.deleteCharAt(sonuc.length() - 1);

		sonuc.append(")");
		return sonuc.toString();
	}
}
