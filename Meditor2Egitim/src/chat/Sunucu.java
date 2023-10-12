package chat;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sunucu {
	private List<Oda> odalar = new ArrayList<>();
	private List<Kullanici> kullanicilar = new ArrayList<>();
	private static Kullanici sistemKullanicisi = new Kullanici("Sistem");

	public void baglan(Kullanici kullanici) {
		kullanicilar.add(kullanici);
	}

	public void ayril(Kullanici kullanici) {
		kullanicilar.remove(kullanici);
	}

	public void odaYarat(String odaAdi) {
		odalar.add(new Oda(odaAdi));
	}

	public List<Oda> getOda(String odaAdi) {
		return odalar.stream().filter(oda -> oda.getOdaAdi().equals(odaAdi)).collect(Collectors.toList());
	}

	public void odaSil(String odaAdi) {
		getOda(odaAdi).forEach(oda -> {
			oda.mesajGonder(sistemKullanicisi, "Bu oda kapanıyor.");
			oda.tumKullanicilariSil();
			odalar.remove(oda);
		});
	}

	public void mesajGonder(Kullanici kullanici, String kime, String mesaj) {
		kullanicilar.stream().filter(k -> k.getAdi().equals(kime))
				.forEach(k -> k.mesajGeldi(null, kullanici.getAdi(), mesaj));
	}

}
