package calistir;

import java.math.BigDecimal;

public class Calistir {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		double a = 3 * 0.1;
		System.out.println(a);
		if (a == 0.3) {
			System.out.println("eşit");
		} else {
			System.out.println("eşit değil");
		}
		System.out.println("*******************");
		BigDecimal s1 = new BigDecimal("3");
		s1 = s1.multiply(new BigDecimal("0.1"));
		System.out.println(s1);
		if (s1.equals(new BigDecimal("0.3"))) {
			System.out.println("eşit");
		} else {
			System.out.println("eşit değil");
		}
		System.out.println("*******************");
		// Flyweight pattern'ı kullanılmış.
		s1 = BigDecimal.valueOf(3);
		s1 = s1.multiply(BigDecimal.valueOf(1));
		System.out.println(s1);
		if (s1.equals(BigDecimal.valueOf(3))) {
			System.out.println("eşit");
		} else {
			System.out.println("eşit değil");
		}

	}
}
