package calsitir;

import java.util.ArrayList;
import java.util.List;

import mail.Mail;
import mail.MailSpamKontrol;

public class Calistir {
	public static void main(String[] args) {
		MailSpamKontrol mailSpamKontrol = new MailSpamKontrol();
		List<Mail> mailler = new ArrayList<>();

		Mail mail1 = new Mail();
		mail1.setKimden("murat@hotmail.com");
		mail1.setKime("kazim@gmail.com");
		mail1.setBaslik("deneme");
		mail1.setIcerik(""); // spam

		Mail mail2 = new Mail();
		mail2.setKimden("leventguren@hotmail.com");
		mail2.setKime("ahmet@yahoo.com");
		mail2.setBaslik("Sınav");
		mail2.setIcerik("Cuma günü sınav olacak. Bilgin olsun.");

		Mail mail3 = new Mail();
		mail3.setKimden("a.kuru@hotmail.com");
		mail3.setKime("veli@gmail.com");
		mail3.setBaslik("MERHABA"); // spam
		mail3.setIcerik("Nasılsın?");

		Mail mail4 = new Mail();
		mail4.setKimden("kazim@gmail.com");
		mail4.setKime("ayse@hotmail.com");
		mail4.setBaslik("Merhaba");
		mail4.setIcerik("Bu gün nasıl oldun?");

		Mail mail5 = new Mail();
		mail5.setKimden("kazim@gmail.com");
		mail5.setKime("kazim@gmail.com"); // spam
		mail5.setBaslik("Deneme");
		mail5.setIcerik("Deneme mesajı.");

		mailler.add(mail1);
		mailler.add(mail2);
		mailler.add(mail3);
		mailler.add(mail4);
		mailler.add(mail5);

		for (Mail mail : mailler) {
			mailSpamKontrol.setMail(mail);
			if (mailSpamKontrol.spamMi()) {
				System.out.println("Bu spam görünüyor:");
				System.out.println(mail);
			}
		}

	}
}
