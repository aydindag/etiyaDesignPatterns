package beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class KasarliPizza implements IPizza {
	private IPizza pizza;

	@Override
	public String getHamur() {
		return pizza.getHamur();
	}

	@Override
	public void setHamur(String hamur) {
		pizza.setHamur(hamur);
	}

	@Override
	public String getMalzemeler() {
		return pizza.getMalzemeler() + " Kaşar";
	}

	@Override
	public void setMalzemeler(String malzemeler) {
		pizza.setMalzemeler(malzemeler);
	}

}
