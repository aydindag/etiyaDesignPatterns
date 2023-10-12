package ornek;

import java.util.ArrayList;
import java.util.List;

public class Isimler {
	private List<String> isimler = new ArrayList<>();

	public void isimEkle(String isim) {
		isimler.add(isim);
	}

	public IsimlerIterator iterator() {
		IsimlerIterator iterator = new IsimlerIterator();
		iterator.setIsimler(isimler);
		return iterator;
	}
}
