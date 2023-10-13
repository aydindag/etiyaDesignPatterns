package futbol;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Oyuncu implements Bilgilendirilebilir {
	private String adi;

	@Override
	public void farket(Top top, int x, int y) {
		StringBuilder str = new StringBuilder(adi);
		str.append(" adlı oyuncu topun pozisyonunun değiştini farketti. X=");
		str.append(x);
		str.append(", Y=");
		str.append(y);
		System.out.println(str.toString());
	}

}
