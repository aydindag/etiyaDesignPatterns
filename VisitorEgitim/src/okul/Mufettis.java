package okul;

public class Mufettis implements Denetleyici {

	@Override
	public void denetle(Denetlenebilir obje) {
		if (obje instanceof Ogrenci) {
			Ogrenci ogrenci = (Ogrenci) obje;
			System.out.println(ogrenci.getAdi() + " adlı öğrenciye teftiş yapıldı");
		} else if (obje instanceof Ogretmen) {
			Ogretmen ogretmen = (Ogretmen) obje;
			System.out.println(ogretmen.getAdi() + " adlı öğretmene teftiş yapıldı");
		} else if (obje instanceof Mudur) {
			Mudur mudur = (Mudur) obje;
			System.out.println(mudur.getAdi() + " adlı müdüre teftiş yapıldı");
		}
	}

}
