package beans;

public class YabanciHesapFactory extends HesapFactory {

	@Override
	public Hesap hesapOlustur(String hesapTipi) {
		Hesap hesap = null;
		if ("S".equalsIgnoreCase(hesapTipi)) {
			// Yabancı vatandaşlar için şirket hesabı açılamaz yapılabilir.
			hesap = new SirketHesabi();
		} else if ("B".equalsIgnoreCase(hesapTipi)) {
			hesap = new BireyselHesap();
		}
		// Devlete yabancı kişiler için hesap açıldığı bilgisi gönderilebilir.
		return hesap;
	}
}
