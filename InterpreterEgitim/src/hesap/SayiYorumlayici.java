package hesap;

public class SayiYorumlayici extends Yorumlayici<Integer> {

	public void yorumla(String ifade) {
		String[] degerler = ifade.split(" ");
		for (String deger : degerler) {
			// deger degiskeninde sayi varsa sakla
			try {
				int value = Integer.parseInt(deger);
				sonaEkle(value);
			} catch (NumberFormatException ex) {
				// deger'imiz sayı değilmiş.
			}
		}
	}
}
