package calistir;

import java.util.Scanner;

import beans.Hesap;
import beans.HesapFactory;
import beans.HesapIslemleri;
import beans.VatandasHesapFactory;
import beans.YabanciHesapFactory;

public class Calistir {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Hesap türü (S)irket (B)ireysel ? ");
		String hesapTipi = scanner.nextLine();

		System.out.println("(Y)abanci T.C. (V)atandasi ? ");
		String yerliYabanci = scanner.nextLine();

		HesapFactory factory = "Y".equalsIgnoreCase(yerliYabanci) ? new YabanciHesapFactory()
				: new VatandasHesapFactory();
		HesapIslemleri hesapIslemleri = new HesapIslemleri(factory);
		Hesap hesap = hesapIslemleri.hesapAc(hesapTipi);
		System.out.println("Hesap oluşturuldu: " + hesap);
		scanner.close();
	}
}
