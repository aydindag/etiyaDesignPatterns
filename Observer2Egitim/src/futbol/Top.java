package futbol;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Top {
	private int x;
	private int y;
	private List<PropertyChangeListener> observers = new ArrayList<>();

	public void addObserver(PropertyChangeListener sinif) {
		observers.add(sinif);
	}

	public void removeObserver(PropertyChangeListener sinif) {
		observers.remove(sinif);
	}

	public void setX(int x) {
		notifyAllObservers("X", this.x, x);
		this.x = x;
	}

	public void setY(int y) {
		notifyAllObservers("Y", this.y, y);
		this.y = y;
	}

	private void notifyAllObservers(String property, Object oldValue, Object newValue) {
		observers.forEach(s -> {
			PropertyChangeEvent evt = new PropertyChangeEvent(this, property, oldValue, newValue);
			s.propertyChange(evt);
		});
	}

}
