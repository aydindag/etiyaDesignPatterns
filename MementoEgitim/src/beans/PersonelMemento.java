package beans;

import lombok.Data;

@Data
public class PersonelMemento {
	private int id;
	private String adi;
	private String soyadi;
	private String eposta;

	public static PersonelMemento saveStateToMemento(Personel personel) {
		PersonelMemento memento = new PersonelMemento();
		memento.setId(personel.getId());
		memento.setAdi(personel.getAdi());
		memento.setSoyadi(personel.getSoyadi());
		memento.setEposta(personel.getEposta());
		return memento;
	}

	public void getStateFromMemento(Personel personel) {
		personel.setId(getId());
		personel.setAdi(getAdi());
		personel.setSoyadi(getSoyadi());
		personel.setEposta(getEposta());
	}

	public boolean isChanged(Personel personel) {
		boolean ayni = getAdi().equals(personel.getAdi());
		ayni = ayni && getSoyadi().equals(personel.getSoyadi());
		ayni = ayni && getEposta().equals(personel.getEposta());
//		ayni = ayni && Integer.valueOf(getId()).equals(personel.getId());
		ayni = ayni && (getId() == personel.getId());
		return !ayni;
	}
}
