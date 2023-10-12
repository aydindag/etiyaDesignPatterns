package calistir;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Calistir {
	public static void main(String[] args) {
		Set<String> isimler = new HashSet<>();
		isimler.add("Ali");
		isimler.add("Fatma");
		isimler.add("Baha");
		isimler.add("Ceylan");
		isimler.add("Deniz");
		isimler.add("Züleyha");
		isimler.add("Feride");
		Iterator<String> iterator = isimler.iterator();
		while (iterator.hasNext()) {
			String isim = iterator.next();
			System.out.println(isim);
		}
	}
}
