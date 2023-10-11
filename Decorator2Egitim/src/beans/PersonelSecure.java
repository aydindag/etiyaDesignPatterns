package beans;

public class PersonelSecure extends Personel {
	private Personel personel;

	public PersonelSecure(Personel personel) {
		// verilen personel içindeki değerler şifrelenerek saklanması gerekiyor ki
		// hem güvenli olsun, hem de okunurken doğru değerler okunsun.
		this.personel = personel;
		if (personel != null) {
			setEmail(sifrele(getEmail()));
			setAdi(sifrele(getAdi()));
		}
	}

	@Override
	public String getAdi() {
		String adi = personel.getAdi();
		return desifrele(adi);
	}

	@Override
	public void setAdi(String adi) {
		personel.setAdi(sifrele(adi));
	}

	@Override
	public String getEmail() {
		return desifrele(personel.getEmail());
	}

	@Override
	public void setEmail(String email) {
		personel.setEmail(sifrele(email));
	}

	@Override
	public int getId() {
		return personel.getId();
	}

	@Override
	public void setId(int id) {
		personel.setId(id);
	}

	private String sifrele(String email) {
		StringBuilder s = new StringBuilder(email);
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			c++;
			s.setCharAt(i, c);
		}
		return s.toString();
	}

	private String desifrele(String email) {
		StringBuilder s = new StringBuilder(email);
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			c--;
			s.setCharAt(i, c);
		}
		return s.toString();
	}

	public static void main(String[] args) {
		PersonelSecure personel = new PersonelSecure(null);
		String s = personel.sifrele("levent.guren@gmail.com");
		System.out.println(s);
		String d = personel.desifrele(s);
		System.out.println(d);
	}
}
