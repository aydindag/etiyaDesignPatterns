package webServer;

public class GirisServlet extends BaseServlet {
	@Override
	public void doGet(Request request) {
		String adi = request.getParameter("adi");
		String sifre = request.getParameter("sifre");
		if (adi.equals(sifre)) {
			// giriş başarılı
			System.out.println("Giriş başarılı oldu.");
		} else {
			// giriş başarısız oldu
			System.out.println("Hatalı giriş.");
		}
	}
}
