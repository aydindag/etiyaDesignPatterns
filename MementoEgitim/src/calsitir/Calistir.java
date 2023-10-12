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

		mementoYoneticisi.add(); // memento yaratıldı.
		personel.setAdi("Mehmet");
		personel.setSoyadi("SOLMAZ");
		mementoYoneticisi.add(); // memento yaratıldı.
		System.out.println(personel);
		PersonelMemento memento1 = mementoYoneticisi.get(0);
		PersonelMemento memento2 = mementoYoneticisi.get(1);
		memento1.getStateFromMemento(personel);
		System.out.println(personel);
		memento2.getStateFromMemento(personel);
		System.out.println(personel);
		System.out.println(memento1.isChanged(personel));
		System.out.println(memento2.isChanged(personel));
	}
}
