package calistir;

import ornek.Musteri;
import ornek.tarife.PlatinyumTarife;
import ornek.tarife.SuperTarife;

public class Calistir {
	public static void main(String[] args) {
		Musteri musteri = new Musteri();
		musteri.setAdi("Ali");
		musteri.setInternetKullanimiMB(1347);
		musteri.setKonusmaDakika(731);
		musteri.setSmsSayisi(243);
		musteri.setTarife(new SuperTarife());

		System.out.println("SuperTarife: " + musteri.getFaturaTutari());

		musteri.setTarife(new PlatinyumTarife());
		System.out.println("PlatinyumTarife: " + musteri.getFaturaTutari());
	}
}
