package calistir;

import beans.KasarliMantarliPizzaBuilder;
import beans.Pizza;
import beans.Pizzaci;
import beans.ZeytinliPizzaBuilder;

public class Calistir {
	public static void main(String[] args) {
		Pizzaci pizzaci = new Pizzaci();

		pizzaci.setBuilder(new KasarliMantarliPizzaBuilder());
		Pizza pizza = pizzaci.pizzaHazirla();
		System.out.println(pizza);

		pizzaci.setBuilder(new ZeytinliPizzaBuilder());
		pizza = pizzaci.pizzaHazirla();
		System.out.println(pizza);

	}
}
