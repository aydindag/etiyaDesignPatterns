package calistir;

import dao.PersonelDAO;
import db.Database;
import entity.Personel;

@SuppressWarnings("unused")
public class Calistir {
	public static void main(String[] args) {
		// ornek1();
		ornek2();
	}

	private static void ornek2() {
		PersonelDAO dao = new PersonelDAO(new Database());
		System.out.println("Personel sayisi: " + dao.getTumPersoneller().size());
		System.out.println(dao.getPersonelById(6));
		System.out.println(dao.getPersonelById(11));
	}

	private static void ornek1() {
		PersonelDAO dao = new PersonelDAO(new Database());
		Personel p3 = dao.getPersonelById(3);
		System.out.println(p3);

		Personel p4 = dao.getPersonelById(4);
		System.out.println(p4);

		p3.setAdi("Mehmet");
		dao.savePersonel(p3);

		Personel p1 = dao.getPersonelById(1);
		System.out.println(p1);

		p3 = dao.getPersonelById(3);
		System.out.println(p3);
	}
}
