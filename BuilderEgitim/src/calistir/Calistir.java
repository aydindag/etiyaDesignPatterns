package calistir;

import bean.Musteri;
import bean.MusteriBuilder;

public class Calistir {
	public static void main(String[] args) {
		MusteriBuilder builder = new MusteriBuilder(12321321, "Kerim");
		Musteri musteri = builder.mailIzni(true).build();
		System.out.println(musteri);
	}
}
