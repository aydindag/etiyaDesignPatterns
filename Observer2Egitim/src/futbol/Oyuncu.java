package futbol;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Oyuncu implements PropertyChangeListener {
	private String adi;

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		StringBuilder str = new StringBuilder("Oyuncu(");
		str.append(adi);
		str.append(") Topun ");
		str.append(evt.getPropertyName());
		str.append(" değişkeni değişti. Eski= ");
		str.append(evt.getOldValue());
		str.append(", Yeni= ");
		str.append(evt.getNewValue());
		System.out.println(str.toString());
	}

}
