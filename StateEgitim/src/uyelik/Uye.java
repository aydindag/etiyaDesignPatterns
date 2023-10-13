package uyelik;

import lombok.Data;

@Data
//@ToString(exclude = "seviye")
public class Uye {
	private int puan;
	private Seviye seviye = new BronzSeviye();

	public void setPuan(int puan) {
		this.puan = puan;
		seviye.puanDegisti(this);
	}
}
