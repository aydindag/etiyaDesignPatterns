package calistir;

import beans.IPizza;
import beans.KalinKamurluPizza;
import beans.KasarliPizza;
import beans.Pizza;

public class Calistir {
	public static void main(String[] args) {
		IPizza pizza = new KasarliPizza(new KalinKamurluPizza(new Pizza()));
		System.out.println("Hamur: " + pizza.getHamur());
		System.out.println("Malzemeler: " + pizza.getMalzemeler());
		System.out.println(pizza);
	}
}
