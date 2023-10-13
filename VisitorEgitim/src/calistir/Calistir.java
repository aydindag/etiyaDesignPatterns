package calistir;

import okul.Mudur;
import okul.Mufettis;
import okul.Ogrenci;
import okul.Ogretmen;
import okul.Okul;
import okul.SaglikMemuru;

public class Calistir {
	public static void main(String[] args) {
		Okul okul = new Okul();
		okul.getPersoneller().add(new Ogretmen("Murteza"));
		okul.getPersoneller().add(new Ogretmen("Şazument"));
		okul.getPersoneller().add(new Ogretmen("Ali Rıza"));

		okul.getPersoneller().add(new Mudur("Hakkı"));

		okul.getOgrenciler().add(new Ogrenci("Kamile"));
		okul.getOgrenciler().add(new Ogrenci("Abdulrezzak"));
		okul.getOgrenciler().add(new Ogrenci("Halime"));

		Mufettis mufettis = new Mufettis();
		SaglikMemuru saglikMemuru = new SaglikMemuru();

		// Müdüre iki teftiş de yapılamadı.
		// Öğretmenlere ise sadece aşı yapıldı.
		okul.denetlemeYapilsin(mufettis);
		okul.denetlemeYapilsin(saglikMemuru);
	}
}
