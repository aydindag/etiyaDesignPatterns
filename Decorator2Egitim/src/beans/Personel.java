package beans;

import lombok.Data;

@Data
public class Personel {
	private int id;
	private String adi;
	private String email;

	public String getAdiSaklanan() {
		return adi;
	}
}
