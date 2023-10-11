package calistir;

import beans.Personel;
import beans.PersonelLoglama;
import beans.PersonelSecure;

public class Calistir {
	public static void main(String[] args) {
		Personel personel = getPersonel();
		personel.setAdi("Ahmet");
		System.out.println(personel.getAdi());

		System.out.println(personel.getEmail());
		personel.setEmail("test@gmail.com");
		System.out.println(personel.getEmail());
	}

	private static Personel getPersonel() {
		Personel personel = new Personel();
		personel.setId(145);
		personel.setAdi("Kazım");
		personel.setEmail("kazim@gmail.com");
		// PersonelLoglama sınıf email değişkenine erişimleri log'luyor.
		// PersonelSecure sınıfı ise email ve adi değişkenlerinin değerlerinin
		// hafızadan okunamaması için şifreli olarak saklanıp, açılarak okunmasını
		// sağlıyor.
		return new PersonelSecure(new PersonelLoglama(personel));
	}
}
