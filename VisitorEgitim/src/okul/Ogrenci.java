package okul;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ogrenci implements Denetlenebilir {
	private String adi;

	@Override
	public void kabul(Denetleyici denetleyici) {
		denetleyici.denetle(this);
	}

}
