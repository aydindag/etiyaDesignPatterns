package beans;

public class KasarliMantarliPizzaBuilder extends PizzaBuilder {

	@Override
	public void hamuruHazirla() {
		getPizza().setHamur("Kalın");
	}

	@Override
	public void malzemeleriKoy() {
		getPizza().getMalzemeler().add("Kaşar");
		getPizza().getMalzemeler().add("Mantar");
		getPizza().getMalzemeler().add("Salça");
	}

	@Override
	public void hazirla() {
		getPizza().setAdi("Kaşarlı Mantarlı Pizza");
	}

}
