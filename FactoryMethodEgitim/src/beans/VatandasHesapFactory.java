package beans;

public class VatandasHesapFactory extends HesapFactory {

	@Override
	public Hesap hesapOlustur(String hesapTipi) {
		Hesap hesap = null;
		if ("S".equalsIgnoreCase(hesapTipi)) {
			hesap = new SirketHesabi();
		} else if ("B".equalsIgnoreCase(hesapTipi)) {
			hesap = new BireyselHesap();
		}
		return hesap;
	}
}
