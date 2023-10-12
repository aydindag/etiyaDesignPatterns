package calistir;

import chat.Kullanici;
import chat.Sunucu;

public class Calistir {
	public static void main(String[] args) {
		Kullanici k1 = new Kullanici("Ali");
		Kullanici k2 = new Kullanici("Zeynep");
		Kullanici k3 = new Kullanici("Kerim");
		Kullanici k4 = new Kullanici("Numan");
		Kullanici k5 = new Kullanici("Bahriye");
		Kullanici k6 = new Kullanici("Nesrin");

		Sunucu sunucu = new Sunucu();
		sunucu.odaYarat("genel");
		sunucu.odaYarat("guncel");
		sunucu.odaYarat("bilim");

		sunucu.baglan(k1);
		sunucu.baglan(k2);
		sunucu.baglan(k3);
		sunucu.baglan(k4);
		sunucu.baglan(k5);
		sunucu.baglan(k6);

		sunucu.getOda("genel").forEach(oda -> {
			oda.baglan(k1);
			oda.baglan(k2);
			oda.baglan(k3);
			oda.baglan(k4);
			oda.baglan(k5);
			oda.baglan(k6);
		});

		sunucu.getOda("guncel").forEach(oda -> {
			oda.baglan(k1);
			oda.baglan(k4);
		});

		sunucu.getOda("bilim").forEach(oda -> {
			oda.baglan(k2);
			oda.baglan(k3);
			oda.baglan(k4);
			oda.baglan(k6);
		});

		sunucu.getOda("genel").forEach(oda -> {
			oda.mesajGonder(k1, "Merhaba");
			oda.mesajGonder(k3, "Merhaba");
		});

		sunucu.getOda("bilim").forEach(oda -> {
			oda.mesajGonder(k4, "Yeni roket fırlatmasını izlediniz mi?");
		});
		sunucu.mesajGonder(k2, "Kerim", "Nasılsın");

		sunucu.odaSil("bilim");
	}
}
