package beans;

public class MailBildirimi extends Bildirim {

	@Override
	public void bildirimYap() {
		System.out.println(getKisi().getAdi() + " adlı kişiye mail gönderiliyor.");
	}

}
