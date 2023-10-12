package mail;

import lombok.Data;

@Data
public abstract class SpamKontrol {
	private SpamKontrol siradaki;
	private Mail mail;

	public void setMail(Mail mail) {
		this.mail = mail;
		if (getSiradaki() != null) {
			getSiradaki().setMail(mail);
		}
	}

	public abstract boolean spamMi();
}
