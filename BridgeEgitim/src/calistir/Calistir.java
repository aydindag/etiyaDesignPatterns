package calistir;

import beans.MailBildirimi;
import beans.Musteri;
import beans.Personel;
import beans.SMSBildirimi;
import beans.WhatsupBildirimi;

public class Calistir {
	public static void main(String[] args) {
		Musteri musteri = new Musteri("Murteza", new SMSBildirimi());
		Personel personel = new Personel("Şazument", new WhatsupBildirimi());
		Musteri musteri2 = new Musteri("Abdulmuttalip", new MailBildirimi());

		musteri.bildirimGonder();
		personel.bildirimGonder();
		musteri2.bildirimGonder();
	}
}
