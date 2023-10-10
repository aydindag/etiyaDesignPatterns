package beans;

public class SMSBildirimi extends Bildirim {

	@Override
	public void bildirimYap() {
		System.out.println(getKisi().getAdi() + " adlı kişiye SMS bildirimi yapılıyor.");
	}

}
