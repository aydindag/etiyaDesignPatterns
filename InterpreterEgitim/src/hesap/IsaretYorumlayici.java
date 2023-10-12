package hesap;

import java.util.Arrays;
import java.util.List;

public class IsaretYorumlayici extends Yorumlayici<String> {
	private static final List<String> ISARETLER = Arrays.asList("+", "-", "*", "/");

	public void yorumla(String ifade) {
		String[] degerler = ifade.split(" ");
		for (String deger : degerler) {
			// deger degiskeninde dort işlemden biri varsa sakla

			if (ISARETLER.contains(deger)) {
				sonaEkle(deger);
			}
		}
	}
}
