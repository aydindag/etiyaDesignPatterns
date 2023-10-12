package beans;

import java.util.ArrayList;
import java.util.List;

import lombok.Setter;

public class MementoYoneticisi {
	private List<PersonelMemento> mementolar = new ArrayList<>();
	@Setter
	private Personel personel;

	public void add() {
		PersonelMemento memento = new PersonelMemento();
		memento.setPersonel(personel);
		memento.saveStateToMemento();
		mementolar.add(memento);
	}

	public PersonelMemento get() {
		PersonelMemento memento = mementolar.get(mementolar.size() - 1);
		mementolar.remove(mementolar.size() - 1);
		return memento;
	}

	public PersonelMemento get(int index) {
		return mementolar.get(index);
	}

}
