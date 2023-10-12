package hesap;

public class HesapMakinesi {
	private IsaretYorumlayici isaretYorumlayici = new IsaretYorumlayici();
	private SayiYorumlayici sayiYorumlayici = new SayiYorumlayici();

	public int hesapla(String ifade, boolean adimlariYaz) {
		yorumla(ifade);
		while (isaretYorumlayici.getValues().size() > 0 && sayiYorumlayici.getValues().size() >= 2) {
			if (adimlariYaz) {
				System.out.print(sayiYorumlayici.getIfade());
				System.out.println(" " + isaretYorumlayici.getIfade());
			}
			int sayi1 = sayiYorumlayici.getSonDeger();
			int sayi2 = sayiYorumlayici.getSonDeger();
			String isaret = isaretYorumlayici.getIlkDeger();
			int sonuc = islem(sayi2, sayi1, isaret);
			sayiYorumlayici.sonaEkle(sonuc);
		}
		return sayiYorumlayici.getSonDeger();
	}

	private int islem(int sayi2, int sayi1, String isaret) {
		if (isaret.equals("+")) {
			return sayi1 + sayi2;
		} else if (isaret.equals("-")) {
			return sayi1 - sayi2;
		} else if (isaret.equals("*")) {
			return sayi1 * sayi2;
		} else if (isaret.equals("/")) {
			return sayi1 / sayi2;
		}
		throw new ArithmeticException("Bilinmeyen işaret");
	}

	private void yorumla(String ifade) {
		isaretYorumlayici.yorumla(ifade);
		sayiYorumlayici.yorumla(ifade);
	}

}
