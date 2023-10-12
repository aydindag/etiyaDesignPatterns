package webServer;

public class Sunucu {
	public void istekYap(Request request) {
		if (request.getUrl().equals("/giris")) {
			// giriş işlemi yapılmaya çalışılıyor.
			new GirisServlet().action(request);
		} else if (request.getUrl().equals("/rapor")) {
			// giriş işlemi yapılmaya çalışılıyor.
			new RaporServlet().action(request);
		}
	}
}
