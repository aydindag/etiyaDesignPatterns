package okul;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ogretmen implements Denetlenebilir {
	private String adi;

	@Override
	public void kabul(Denetleyici denetleyici) {
		// Denetlenebilir sınıflar istemedikleri denetleyicilere izin vermeyebilirler.
		// Burada Ogretmen, Müfettiş dışındaki denetleyicilere izin veriyor.

		if (!(denetleyici instanceof Mufettis)) {
			denetleyici.denetle(this);
		}
	}

}
