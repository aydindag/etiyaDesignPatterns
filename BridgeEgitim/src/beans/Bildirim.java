package beans;

import lombok.Data;

@Data
public abstract class Bildirim {
	private Kisi kisi;

	public abstract void bildirimYap();
}
