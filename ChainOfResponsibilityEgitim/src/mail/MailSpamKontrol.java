package mail;

public class MailSpamKontrol {
	private SpamKontrol[] spamKontrolculeri = { new SpamKontrolu1(), new SpamKontrolu2(), new SpamKontrolu3() };

	public MailSpamKontrol() {
		// tum SpamKontrol sınıflarının zincir olarak birbirlerine bağlanmasını
		// sağlayalım
		for (int i = 0; i < spamKontrolculeri.length - 1; i++) {
			spamKontrolculeri[i].setSiradaki(spamKontrolculeri[i + 1]);
		}
	}

	public void setMail(Mail mail) {
		spamKontrolculeri[0].setMail(mail);
	}

	public boolean spamMi() {
		return spamKontrolculeri[0].spamMi();
	}
}
