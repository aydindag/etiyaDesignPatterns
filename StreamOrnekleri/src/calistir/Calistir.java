package calistir;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@SuppressWarnings("unused")
public class Calistir {
	public static void main(String[] args) {
		List<Personel> personeller = new ArrayList<>();
		personeller.add(new Personel("Ali"));
		personeller.add(new Personel("Veli"));
		personeller.add(new Personel("Ayşe"));
		personeller.add(new Personel("Fatma"));
		personeller.add(new Personel("Kerim"));

		// isimleriYaz(personeller);
		// isimleriYaz2(personeller);
		// isimleriYaz3(personeller);
		// isimleriYaz4(personeller);
		// isimleriYaz5(personeller);
		// isimleriYaz6(personeller);
		// isimleriYaz7(personeller);
		// isimleriYaz8(personeller);
		isimleriYaz9(personeller);
	}

	private static void isimleriYaz(List<Personel> personeller) {
		for (int i = 0; i < personeller.size(); i++) {
			System.out.println(personeller.get(i).getAdi());
		}
	}

	private static void isimleriYaz2(List<Personel> personeller) {
		for (Personel personel : personeller) {
			System.out.println(personel.getAdi());
		}
	}

	private static void isimleriYaz3(List<Personel> personeller) {
		personeller.stream().forEach(new PersonelConsumer());
	}

	private static void isimleriYaz4(List<Personel> personeller) {
		personeller.stream().forEach(new Consumer<Personel>() {
			@Override
			public void accept(Personel p) {
				System.out.println(p.getAdi());
			}
		});
	}

	private static void isimleriYaz5(List<Personel> personeller) {
		personeller.stream().forEach(p -> {
			System.out.println(p.getAdi());
		});
	}

	private static void isimleriYaz6(List<Personel> personeller) {
		personeller.stream().forEach(p -> System.out.println(p.getAdi()));
	}

	private static void isimleriYaz7(List<Personel> personeller) {
		personeller.stream().forEach(Calistir::test);
	}

	public static void test(Personel p) {
		System.out.println("Test : " + p.getAdi());
	}

	private static void isimleriYaz8(List<Personel> personeller) {
		personeller.stream().filter(p -> p.getAdi().contains("A")).forEach(System.out::println);
	}

	private static void isimleriYaz9(List<Personel> personeller) {
		personeller.stream().filter(p -> {
			System.out.println(p.getAdi() + " için filtre çalıştı");
			return true;
		}).forEach(p -> {
			System.out.println(p.getAdi() + " için for each çalıştı");
		});
	}
}
