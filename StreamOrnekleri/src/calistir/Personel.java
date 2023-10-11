package calistir;

public class Personel {
	private String adi;

	public Personel(String adi) {
		this.adi = adi;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	@Override
	public String toString() {
		return "Personel [adi=" + adi + "]";
	}

}
