package haberlesme;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
public abstract class Ucak {
	private final String ucusNo;
	@Setter
	private Kule kule;

	public void mesajGonder(String mesaj) {
		kule.mesajGonder(ucusNo, mesaj);
	}

	public void mesajGonder(String aliciUcusNo, String mesaj) {
		kule.mesajGonder(ucusNo, aliciUcusNo, mesaj);
	}

	public abstract void mesajGeldi(String gonderenUcakUcusNo, String aliciUcusNo, String mesaj);

}
