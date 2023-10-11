package kutuphane;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import lombok.Data;

@Data
public class Raf {
	private List<Kitap> kitaplar = new ArrayList<>();

	public Kitap getKitap(String kitapAdi) {
		// tüm kitaplar içinde adı kitapAdi olarak verilen parametredeki değer ile aynı
		// olanlar bulunuyor. Sonra da bulunanlar içinde ilk kitap (varsa) alınıyor.
		Optional<Kitap> sonuc = kitaplar.stream().filter(k -> k.getAdi().equals(kitapAdi)).findFirst();
		if (sonuc.isPresent()) {
			// istenen kitap raf içindeki kitaplar arasında bulunduysa verilmeden önce
			// raftan kitap siliniyor.
			kitaplar.remove(sonuc.get());
		}
		return sonuc.orElse(null);
	}

	public void kitapEkle(Kitap kitap) {
		kitaplar.add(kitap);
	}
}
