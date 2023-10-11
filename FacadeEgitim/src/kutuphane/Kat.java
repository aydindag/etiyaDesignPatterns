package kutuphane;

import java.util.HashMap;
import java.util.Map;

public class Kat {
	private Map<Character, Raf> raflar = new HashMap<>();

	public Raf getRaf(char harf) {
		Raf raf = raflar.get(harf);
		if (raf == null) {
			raf = new Raf();
			raflar.put(harf, raf);
		}
		return raf;
	}
}
