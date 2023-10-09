package bean;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Musteri {
	private int id;
	private String adi;

	private String adres;

	private Boolean reklamIzni;
	private Boolean mesajIzni;
	private Boolean mailIzni;
}
