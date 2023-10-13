package okul;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mudur implements Denetlenebilir {
	private String adi;

	@Override
	public void kabul(Denetleyici denetleyici) {
		// Müdür herhangi bir denetlemeye izin vermiyor.
		// denetleyicinin denetle metodu çağırılmıyor.
	}

}
