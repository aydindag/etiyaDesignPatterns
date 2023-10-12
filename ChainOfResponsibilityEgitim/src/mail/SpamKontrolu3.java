package mail;

public class SpamKontrolu3 extends SpamKontrol {

	@Override
	public boolean spamMi() {
		// Mail içeriği yok ise spam olduğuna karar veriyoruz
		if (getMail().getIcerik() == null || getMail().getIcerik().equals("")) {
			return true;
		}
		if (getSiradaki() != null) {
			return getSiradaki().spamMi();
		}
		return false;
	}

}
