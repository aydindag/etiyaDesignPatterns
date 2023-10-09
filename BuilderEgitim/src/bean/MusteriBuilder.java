package bean;

public class MusteriBuilder {
	private int id;
	private String adi;

	private String adres;

	private Boolean reklamIzni;
	private Boolean mesajIzni;
	private Boolean mailIzni;

	public MusteriBuilder(int id, String adi) {
		this.id = id;
		this.adi = adi;
	}

	public MusteriBuilder adres(String adres) {
		this.adres = adres;
		return this;
	}

	public MusteriBuilder reklamIzni(Boolean reklamIzni) {
		this.reklamIzni = reklamIzni;
		return this;
	}

	public MusteriBuilder mesajIzni(Boolean mesajIzni) {
		this.mesajIzni = mesajIzni;
		return this;
	}

	public MusteriBuilder mailIzni(Boolean mailIzni) {
		this.mailIzni = mailIzni;
		return this;
	}

	public Musteri build() {
		Musteri musteri = new Musteri();
		musteri.setId(id);
		musteri.setAdi(adi);

		musteri.setAdres(adres);
		musteri.setReklamIzni(reklamIzni);
		musteri.setMesajIzni(mesajIzni);
		musteri.setMailIzni(mailIzni);
		return musteri;
	}

}
