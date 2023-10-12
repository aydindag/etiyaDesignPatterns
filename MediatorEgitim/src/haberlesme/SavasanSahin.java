package haberlesme;

public class SavasanSahin extends Ucak {

	public SavasanSahin(String ucusNo) {
		super(ucusNo);
	}

	@Override
	public void mesajGeldi(String gonderenUcakUcusNo, String aliciUcusNo, String mesaj) {
		StringBuilder mesajStr = new StringBuilder();
		mesajStr.append("[ ");
		mesajStr.append(getUcusNo());
		mesajStr.append(" - ");
		mesajStr.append(gonderenUcakUcusNo);
		if (aliciUcusNo == null) {
			mesajStr.append("*"); // tüm uçaklara gönderilen mesaj
		}
		mesajStr.append(" msg: ");
		mesajStr.append(mesaj);
		mesajStr.append(" ]");

		System.out.println(mesajStr.toString());
	}

}
