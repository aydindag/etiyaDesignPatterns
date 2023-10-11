package beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class KalinKamurluPizza implements IPizza {
	private IPizza pizza;

	@Override
	public String getHamur() {
		return "Kalın hamurlu";
	}

	@Override
	public void setHamur(String hamur) {
	}

	@Override
	public String getMalzemeler() {
		return pizza.getMalzemeler();
	}

	@Override
	public void setMalzemeler(String malzemeler) {
		pizza.setMalzemeler(malzemeler);
	}

}
