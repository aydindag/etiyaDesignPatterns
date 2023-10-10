package beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Kisi {
	private String adi;
	private Bildirim bildirim;

	public void bildirimGonder() {
		bildirim.setKisi(this);
		bildirim.bildirimYap();
	}
}
