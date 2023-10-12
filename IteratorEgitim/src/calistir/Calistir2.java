package calistir;

import ornek.Isimler;
import ornek.IsimlerIterator;

public class Calistir2 {
	public static void main(String[] args) {
		Isimler isimler = new Isimler();
		isimler.isimEkle("Ali");
		isimler.isimEkle("Fatma");
		isimler.isimEkle("Baha");
		isimler.isimEkle("Ceylan");
		isimler.isimEkle("Deniz");
		isimler.isimEkle("Züleyha");
		isimler.isimEkle("Feride");
		IsimlerIterator iterator = isimler.iterator();
		while (iterator.hasNext()) {
			String isim = iterator.next();
			System.out.println(isim);
		}
	}
}
