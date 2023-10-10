package beans;

public class WhatsupBildirimi extends Bildirim {

	@Override
	public void bildirimYap() {
		System.out.println(getKisi().getAdi() + " adlı kişiye whatsup mesajı gönderiliyor.");
	}

}
