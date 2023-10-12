package mail;

import java.util.Locale;

public class SpamKontrolu1 extends SpamKontrol {
	private static Locale localeTurkish = Locale.forLanguageTag("tr");

	@Override
	public boolean spamMi() {
		// Mail başlığı tamamen büyük harf ise spam olduğuna karar veriyoruz
		String baslik = getMail().getBaslik();
		if (baslik.toUpperCase(localeTurkish).equals(baslik)) {
			return true;
		}
		if (getSiradaki() != null) {
			return getSiradaki().spamMi();
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("ali ığüşiöçĞÜŞİÖÇI".toUpperCase(localeTurkish));
	}

}
