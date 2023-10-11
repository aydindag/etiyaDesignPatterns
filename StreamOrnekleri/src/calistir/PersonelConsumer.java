package calistir;

import java.util.function.Consumer;

public class PersonelConsumer implements Consumer<Personel> {

	@Override
	public void accept(Personel p) {
		System.out.println(p.getAdi());
	}

}
