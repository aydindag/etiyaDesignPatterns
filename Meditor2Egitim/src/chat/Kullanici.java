package chat;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Kullanici {
	private String adi;

	public void mesajGeldi(String odaAdi, String kimden, String mesaj) {
		StringBuilder str = new StringBuilder();
		if (odaAdi != null) {
			// mesaj bir odadan gönderilmiştir.
			str.append("[");
			str.append(odaAdi);
			str.append("] ");
		}
		str.append(adi);
		str.append(" kullanıcısına ");
		str.append(kimden);
		str.append(" kullanıcısından mesaj geldi: ");
		str.append(mesaj);
		System.out.println(str.toString());
	}
}
