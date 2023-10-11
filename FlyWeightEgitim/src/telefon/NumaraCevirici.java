package telefon;

import java.util.HashMap;
import java.util.Map;

import tone.ITone;
import tone.Tone0;
import tone.Tone1;
import tone.Tone2;
import tone.Tone3;
import tone.Tone4;
import tone.Tone5;
import tone.Tone6;
import tone.Tone7;
import tone.Tone8;
import tone.Tone9;

public class NumaraCevirici {
	private Map<Character, ITone> toneSiniflari = new HashMap<>();

	public void cevir(String numara) {
		numara.chars().forEach(c -> {
			ITone tone = getTone((char) c);
			tone.cevir();
		});
	}

	private ITone getTone(char numara) {
		ITone tone = toneSiniflari.get(numara);
		if (tone == null) {
			// tone sınıfı ile defa kullanılıyor. Üretip saklayalım.
			tone = toneUret(numara);
			toneSiniflari.put(numara, tone);
		}
		return tone;
	}

	private ITone toneUret(char numara) {

		System.out.println(numara + " icin tone sınıfı oluşturuluyor");
		switch (numara) {
		case '0': {
			return new Tone0();
		}
		case '1': {
			return new Tone1();
		}
		case '2': {
			return new Tone2();
		}
		case '3': {
			return new Tone3();
		}
		case '4': {
			return new Tone4();
		}
		case '5': {
			return new Tone5();
		}
		case '6': {
			return new Tone6();
		}
		case '7': {
			return new Tone7();
		}
		case '8': {
			return new Tone8();
		}
		case '9': {
			return new Tone9();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + numara);
		}
	}

}
