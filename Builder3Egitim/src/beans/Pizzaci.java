package beans;

import lombok.Data;

@Data
public class Pizzaci {
	private PizzaBuilder builder;

	public Pizza pizzaHazirla() {
		Pizza pizza = new Pizza();
		builder.setPizza(pizza);

		builder.hamuruHazirla();
		builder.malzemeleriKoy();
		builder.hazirla();

		return pizza;
	}

}
