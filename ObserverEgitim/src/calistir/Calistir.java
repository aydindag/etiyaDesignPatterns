package calistir;

import futbol.Oyuncu;
import futbol.Top;

public class Calistir {
	public static void main(String[] args) {
		Top top1 = new Top();
		Top top2 = new Top();

		Oyuncu oyuncu1 = new Oyuncu("Ozan");
		Oyuncu oyuncu2 = new Oyuncu("Lalezar");
		Oyuncu oyuncu3 = new Oyuncu("Kamil");
		Oyuncu oyuncu4 = new Oyuncu("Osman");
		Oyuncu oyuncu5 = new Oyuncu("Umut");

		top1.gozlemciEkle(oyuncu1);
		top1.gozlemciEkle(oyuncu2);
		top1.gozlemciEkle(oyuncu3);

		top2.gozlemciEkle(oyuncu4);
		top2.gozlemciEkle(oyuncu5);

		top1.setX(12);
		top1.setY(23);

		top2.setY(44);
	}
}
