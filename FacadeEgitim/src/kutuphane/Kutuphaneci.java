package kutuphane;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Kutuphaneci {
	private Kutuphane kutuphane;

	public Kitap getKitap(KitapTuru tur, String kitapAdi) {
		return kutuphane.getKat(tur).getRaf(kitapAdi.charAt(0)).getKitap(kitapAdi);
	}

	public void kitapEkle(Kitap kitap) {
		kutuphane.getKat(kitap.getTur()).getRaf(kitap.getAdi().charAt(0)).kitapEkle(kitap);
	}
}
