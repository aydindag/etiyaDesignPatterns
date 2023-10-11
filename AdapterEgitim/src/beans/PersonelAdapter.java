package beans;

import lombok.Setter;

@Setter
public class PersonelAdapter {
	private static final String ID = "id";
	private static final String ADI = "adi";
	private static final String SOYADI = "soyadi";

	private Personel personel;

	public int getId() {
		return (Integer) personel.getDeger(ID);
	}

	public void setId(int id) {
		personel.setDeger(ID, id);
	}

	public String getAdi() {
		return (String) personel.getDeger(ADI);
	}

	public void setAdi(String adi) {
		personel.setDeger(ADI, adi);
	}

	public String getSoyadi() {
		return (String) personel.getDeger(SOYADI);
	}

	public void setSoyadi(String soyadi) {
		personel.setDeger(SOYADI, soyadi);
	}

}
