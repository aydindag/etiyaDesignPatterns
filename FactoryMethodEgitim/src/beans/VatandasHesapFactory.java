package beans;

public class VatandasHesapFactory extends HesapFactory {

	@Override
	public Hesap hesapOlustur(String hesapTipi) {
		Hesap hesap = null;
		if ("S".equals(hesapTipi)) {
			hesap = new SirketHesabi();
		} else if ("B".equals(hesapTipi)) {
			hesap = new BireyselHesap();
		}
		return hesap;
	}
}
