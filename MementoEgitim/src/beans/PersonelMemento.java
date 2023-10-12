package beans;

import lombok.Data;

@Data
public class PersonelMemento {
	private Personel personel;

	private int id;
	private String adi;
	private String soyadi;
	private String eposta;

	public void saveStateToMemento() {
		setId(personel.getId());
		setAdi(personel.getAdi());
		setSoyadi(personel.getSoyadi());
		setEposta(personel.getEposta());
	}

	public void getStateFromMemento() {
		personel.setId(getId());
		personel.setAdi(getAdi());
		personel.setSoyadi(getSoyadi());
		personel.setEposta(getEposta());
	}

	public boolean isChanged() {
		boolean ayni = getAdi().equals(personel.getAdi());
		ayni = ayni && getSoyadi().equals(personel.getSoyadi());
		ayni = ayni && getEposta().equals(personel.getEposta());
//		ayni = ayni && Integer.valueOf(getId()).equals(personel.getId());
		ayni = ayni && (getId() == personel.getId());
		return !ayni;
	}
}
