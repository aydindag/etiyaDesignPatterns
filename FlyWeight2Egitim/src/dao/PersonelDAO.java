package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import db.Database;
import entity.Personel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PersonelDAO {
	private final Database db;
	private Map<Integer, Personel> cache = new HashMap<>();

	public Personel getPersonelById(int id) {
		Personel sonuc = cache.get(id);
		if (sonuc == null) {
			sonuc = db.getPersonelById(id);
			cache.put(id, sonuc);
		}
		return sonuc;
	}

	public List<Personel> getTumPersoneller() {
		List<Personel> tumPersoneller = db.getPersonelData();
		tumPersoneller.forEach(p -> cache.put(p.getId(), p));
		return tumPersoneller;
	}

	public void savePersonel(Personel personel) {
		cache.put(personel.getId(), personel);
		db.savePersonel(personel);
	}
}
