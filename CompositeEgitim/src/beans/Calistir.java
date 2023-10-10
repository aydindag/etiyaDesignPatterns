package beans;

public class Calistir {
	public static void main(String[] args) {
		Dizin root = new Dizin("/", 0);
		Dizin windows = new Dizin("windows", 11000000);
		Dizin system32 = new Dizin("system32", 23746273);
		Dizin kullanicilar = new Dizin("kullanicilar", 4375647);

		root.getAltObjeler().add(windows);
		root.getAltObjeler().add(kullanicilar);
		windows.getAltObjeler().add(system32);

		root.getAltObjeler().add(new Dosya("hibernate.sys", 213123));
		windows.getAltObjeler().add(new Dosya("calc.exe", 2346347));
		windows.getAltObjeler().add(new Dosya("notepad.exe", 38374837));
		system32.getAltObjeler().add(new Dosya("system.dll", 4323432));
		kullanicilar.getAltObjeler().add(new Dosya("dosya.doc", 3476347));

		root.yazdir(0);
//		kullanicilar.yazdir(0);
	}
}
