package haberlesme;

public class Boeing extends Ucak {

	public Boeing(String ucusNo) {
		super(ucusNo);
	}

	@Override
	public void mesajGeldi(String gonderenUcakUcusNo, String aliciUcusNo, String mesaj) {
		StringBuilder mesajStr = new StringBuilder();
		mesajStr.append(getUcusNo());
		mesajStr.append(" uçuş nolu Boeing uçağı ");
		mesajStr.append(gonderenUcakUcusNo + " uçuş nolu uçaktan ");
		if (aliciUcusNo == null) {
			// mesaj herkese gönderilmiştir.
			mesajStr.append("tüm uçaklara gönderilen:\n");
		} else {
			// mesaj sadece bu uçağa gönderilmiştir.
		}
		mesajStr.append(mesaj);
		mesajStr.append("\nmesajını almıştır.");

		System.out.println(mesajStr.toString());
	}

}
