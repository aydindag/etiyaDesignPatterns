package haberlesme;

import java.util.ArrayList;
import java.util.List;

public class Kule {
	private List<Ucak> ucaklar = new ArrayList<>();

	public void kuleyeBaglan(Ucak ucak) {
		ucaklar.add(ucak);
		ucak.setKule(this);
	}

	public void kuledenAyril(Ucak ucak) {
		ucaklar.remove(ucak);
		ucak.setKule(null);
	}

	public void mesajGonder(String gonderenUcusNo, String mesaj) {
		// mesajı tüm uçaklara gönder (kendisi hariç)
		ucaklar.stream().filter(u -> !u.getUcusNo().equals(gonderenUcusNo))
				.forEach(u -> u.mesajGeldi(gonderenUcusNo, null, mesaj));
	}

	public void mesajGonder(String gonderenUcusNo, String aliciUcusNo, String mesaj) {
		// Mesajı sadece ilgili uçağa gönder
		ucaklar.stream().filter(u -> u.getUcusNo().equals(aliciUcusNo))
				.forEach(u -> u.mesajGeldi(gonderenUcusNo, aliciUcusNo, mesaj));
	}
}
