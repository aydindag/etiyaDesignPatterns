package calistir;

import haberlesme.Airbus;
import haberlesme.Boeing;
import haberlesme.Kule;
import haberlesme.SavasanSahin;
import haberlesme.Ucak;

public class Calistir {
	public static void main(String[] args) {
		Ucak ucak1 = new Boeing("TK-1342");
		Ucak ucak2 = new Boeing("TK-7261");
		Ucak ucak3 = new Airbus("TK-923");
		Ucak ucak4 = new SavasanSahin("J-42");
		Ucak ucak5 = new SavasanSahin("J-8");

		Kule kule = new Kule();
		kule.kuleyeBaglan(ucak1);
		kule.kuleyeBaglan(ucak2);
		kule.kuleyeBaglan(ucak3);
		kule.kuleyeBaglan(ucak4);
		kule.kuleyeBaglan(ucak5);

		ucak2.mesajGonder("Günaydın");
		ucak5.mesajGonder("TK-1342", "Hemen iniyorum. Biraz bekleyebilir misin?");

		kule.kuledenAyril(ucak3);
		kule.kuledenAyril(ucak5);
		ucak2.mesajGonder("Beklenenden kuvvetli rüzgar oluştu. Bilginize.");
	}
}
