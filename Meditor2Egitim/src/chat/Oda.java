package chat;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Oda {
	@Getter
	private final String odaAdi;
	private List<Kullanici> kullanicilar = new ArrayList<>();

	public void baglan(Kullanici kullanici) {
		kullanicilar.add(kullanici);
	}

	public void ayril(Kullanici kullanici) {
		kullanicilar.remove(kullanici);
	}

	public void tumKullanicilariSil() {
		kullanicilar.clear();
	}

	public void mesajGonder(Kullanici kullanici, String mesaj) {
		kullanicilar.stream().filter(k -> !k.equals(kullanici))
				/* Kullanıcının kendisine mesaj göndermesi engelleniyor */
				.forEach(k -> k.mesajGeldi(odaAdi, kullanici.getAdi(), mesaj));
	}

}
