package beans;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PersonelLoglama extends Personel {
	private Personel personel;

	@Override
	public String getEmail() {
		System.out.println(personel.getId() + " id'li personelin email'i okundu. Email: " + personel.getEmail());
		return personel.getEmail();
	}

	@Override
	public void setEmail(String email) {
		System.out.println(personel.getId() + " id'li personelin email'i değiştirildi");
		System.out.println("Eski email: " + personel.getEmail() + ", yeni email: " + email);
		personel.setEmail(email);
	}

	@Override
	public String getAdi() {
		return personel.getAdi();
	}

	@Override
	public void setAdi(String adi) {
		personel.setAdi(adi);
	}

	@Override
	public int getId() {
		return personel.getId();
	}

	@Override
	public void setId(int id) {
		personel.setId(id);
	}
}
