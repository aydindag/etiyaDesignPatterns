package bean;

import lombok.Data;

@Data
public class Musteri {
	private int id;
	private String adi;

	private String adres;

	private Boolean reklamIzni;
	private Boolean mesajIzni;
	private Boolean mailIzni;

	public Musteri() {
	}

	public Musteri(int id, String adi) {
		this.id = id;
		this.adi = adi;
	}

	public Musteri(int id, String adi, Boolean reklamIzni) {
		this.id = id;
		this.adi = adi;
		this.reklamIzni = reklamIzni;
	}
	/*
	 * Bu kodu açarsak hata veriyor.
	 */
	/*
    @formatter:off
	public Musteri(int id, String adi, Boolean mesajIzni) {
		this.id = id;
		this.adi = adi;
		this.mesajIzni = mesajIzni;
	}
	@formatter:on
	*/
}
