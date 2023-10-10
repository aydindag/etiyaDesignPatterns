package beans;

public class ZeytinliPizzaBuilder extends PizzaBuilder {

	@Override
	public void hamuruHazirla() {
		getPizza().setHamur("İnce");
	}

	@Override
	public void malzemeleriKoy() {
		getPizza().getMalzemeler().add("Zeytin");
		getPizza().getMalzemeler().add("Salça");
	}

	@Override
	public void hazirla() {
		getPizza().setAdi("Zeytinli Pizza");
	}
}
