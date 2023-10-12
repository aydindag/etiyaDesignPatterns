package hesap;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public abstract class Yorumlayici<T> {
	private List<T> values = new ArrayList<>();

	public abstract void yorumla(String ifade);

	public T getSonDeger() {
		// saklanan son değeri silerek geri veriyoruz
		T deger = values.get(values.size() - 1);
		values.remove(values.size() - 1);
		return deger;
	}

	public T getIlkDeger() {
		// saklanan ilk değeri silerek geri veriyoruz
		T deger = values.get(0);
		values.remove(0);
		return deger;
	}

	public void sonaEkle(T deger) {
		values.add(deger);
	}

	public String getIfade() {
		StringBuilder sonuc = new StringBuilder();
		for (T t : values) {
			sonuc.append(t);
			sonuc.append(" ");
		}
		sonuc.deleteCharAt(sonuc.length() - 1);
		return sonuc.toString();
	}
}
