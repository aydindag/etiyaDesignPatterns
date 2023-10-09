package calistir;

import bean.Musteri;

public class Calistir {
	public static void main(String[] args) {
		Musteri musteri = Musteri.builder().id(3843748).adi("Kerim").mailIzni(true).build();
		System.out.println(musteri);
	}
}
