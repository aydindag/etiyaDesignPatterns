package calistir;

public class Calistir2 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		if (i1 == i2) {
			System.out.println("eşit");
		} else {
			System.out.println("eşit değil");
		}
		System.out.println("************");
		i1 = Integer.valueOf(1);
		i2 = Integer.valueOf(1);
		if (i1 == i2) {
			System.out.println("eşit");
		} else {
			System.out.println("eşit değil");
		}
		System.out.println("***** String *******");
		String s1 = "abc";
		String s2 = "a" + "bc";
		if (s1 == s2) {
			System.out.println("eşit");
		} else {
			System.out.println("eşit değil");
		}
		System.out.println("***** String2 *******");
		s1 = new String("abc");
		s2 = "abc";
		if (s1 == s2) {
			System.out.println("eşit");
		} else {
			System.out.println("eşit değil");
		}
	}
}
