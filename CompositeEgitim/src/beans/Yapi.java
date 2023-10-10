package beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Yapi {
	private String adi;
	private int boyut;

	public void yazdir(int seviye) {
		for (int i = 0; i < seviye; i++) {
			System.out.print("  ");
		}
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return adi + ", boyut: " + boyut;
	}
}
