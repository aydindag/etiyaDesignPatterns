package mail;

public class SpamKontrolu2 extends SpamKontrol {

	@Override
	public boolean spamMi() {
		// Gönderici ile kime gönderildiği aynı ise spam olduğuna karar veriyoruz
		if (getMail().getKimden().equals(getMail().getKime())) {
			return true;
		}
		if (getSiradaki() != null) {
			return getSiradaki().spamMi();
		}
		return false;
	}

}
