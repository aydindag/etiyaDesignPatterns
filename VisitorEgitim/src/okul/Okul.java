package okul;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Okul {
	public List<Ogrenci> ogrenciler = new ArrayList<>();
	public List<Denetlenebilir> personeller = new ArrayList<>();

	public void denetlemeYapilsin(Denetleyici denetleyici) {
		ogrenciler.forEach(o -> o.kabul(denetleyici));
		personeller.forEach(o -> o.kabul(denetleyici));
	}
}
