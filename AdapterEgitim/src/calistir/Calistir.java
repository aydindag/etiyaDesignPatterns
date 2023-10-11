package calistir;

import beans.Personel;
import beans.PersonelAdapter;

public class Calistir {
	public static void main(String[] args) {
		Personel personel = new Personel();
		personel.setDeger("id", 1345);
		personel.setDeger("adi", "Kazım");
		personel.setDeger("soyadi", "KISA");
		System.out.println(personel);

		PersonelAdapter personelAdapter = new PersonelAdapter();
		Personel personel2 = new Personel();
		personelAdapter.setPersonel(personel2);
		personelAdapter.setId(3846384);
		personelAdapter.setAdi("Mustafa");
		personelAdapter.setSoyadi("Mavi");
		System.out.println(personel2);
		System.out.println(personelAdapter.getAdi());
	}
}
