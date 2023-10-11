package db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import entity.Personel;

public class Database {
	private Map<Integer, Personel> data = new HashMap<>();

	public Database() {
		data.put(1, new Personel(1, "Levent", "levent.guren@gmail.com"));
		data.put(2, new Personel(2, "Kamuran", "kamuran@gmail.com"));
		data.put(3, new Personel(3, "Yaşar", "y.okuyan@gmail.com"));
		data.put(4, new Personel(4, "Ayhan", "ayhan@gmail.com"));
		data.put(5, new Personel(5, "Dursun", "dursun@gmail.com"));
		data.put(6, new Personel(6, "Elif", "elif@gmail.com"));
		data.put(7, new Personel(7, "Meryem", "meryem@hotmail.com"));
		data.put(8, new Personel(8, "Selma", "selam@yahoo.com"));
		data.put(9, new Personel(9, "Bekir", "bekir@yahoo.com"));
		data.put(10, new Personel(10, "Merve", "merve@gmail.com"));
		data.put(11, new Personel(11, "Bayram", "bayram@gmail.com"));
		data.put(12, new Personel(12, "Esra", "esra@hotmail.com"));
	}

	public Personel getPersonelById(int id) {
		System.out.println(id + " id'li personel db'den sorgulanıyor.");
		return data.get(id);
	}

	public List<Personel> getPersonelData() {
		System.out.println("db'den tüm personeller sorgulanıyor.");
		return data.values().stream().collect(Collectors.toList());
	}

	public void savePersonel(Personel personel) {
		System.out.println(personel.getId() + " li personel db'ye kaydediliyor.");
		data.put(personel.getId(), personel);
	}
}
