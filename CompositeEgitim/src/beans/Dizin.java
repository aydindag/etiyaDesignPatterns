package beans;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Dizin extends Yapi {
	private List<Yapi> altObjeler = new ArrayList<>();

	public Dizin(String adi, int boyut) {
		super(adi, boyut);
	}

	@Override
	public void yazdir(int seviye) {
		super.yazdir(seviye);
		altObjeler.forEach(o -> o.yazdir(seviye + 1));

//		altObjeler.forEach(System.out::println);

//		altObjeler.forEach(o -> System.out.println(o));
//		altObjeler.forEach(o -> {
//			System.out.println(o);
//		});
//		altObjeler.forEach(new Consumer<Yapi>() {
//			@Override
//			public void accept(Yapi t) {
//				System.err.println(t);
//			}
//		});

	}

	@Override
	public String toString() {
		return "[" + super.toString() + "]";
	}

}
