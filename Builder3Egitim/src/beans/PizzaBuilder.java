package beans;

import lombok.Data;

@Data
public abstract class PizzaBuilder {
	private Pizza pizza;

	public abstract void hamuruHazirla();

	public abstract void malzemeleriKoy();

	public abstract void hazirla();
}
