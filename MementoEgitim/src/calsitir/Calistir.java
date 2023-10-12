package calsitir;

import beans.MementoYoneticisi;
import beans.Personel;
import beans.PersonelMemento;

public class Calistir {
	public static void main(String[] args) {
		Personel personel = new Personel();
		personel.setId(123);
		personel.setAdi("Levent");
		personel.setSoyadi("GUREN");
		personel.setEposta("levent.guren@gmail.com");

		MementoYoneticisi mementoYoneticisi = new MementoYoneticisi();
		mementoYoneticisi.setPersonel(personel);

		mementoYoneticisi.add(); // personel sıfının ilke halindeki değerin saklanması için memento yaratıldı.
		personel.setAdi("Mehmet"); // personel sınıfının değişkenlerini değiştiriyoruz.
		personel.setSoyadi("SOLMAZ");
		mementoYoneticisi.add(); // Yeni değerler için bir memento daha yaratıldı.
		System.out.println(personel); // yeni halini ekrana basıyoruz.
		PersonelMemento memento1 = mementoYoneticisi.get(0); // ilk değerlerin olduğu zamanda yaratılan memento
		PersonelMemento memento2 = mementoYoneticisi.get(1); // değişiklik sonrası zamanında yaratılan memento
		memento1.getStateFromMemento(); // Personel'i ilk haline çeviriyoruz.
		System.out.println(personel);
		memento2.getStateFromMemento(); // Personel'i değişiklik yapıldıktan sonraki haline tekrar çeviriyoruz
		System.out.println(personel);
		System.out.println(memento1.isChanged());
		System.out.println(memento2.isChanged());
	}
}
