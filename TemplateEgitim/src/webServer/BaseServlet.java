package webServer;

import static webServer.Request.RequestType.GET;
import static webServer.Request.RequestType.POST;

public abstract class BaseServlet {
	public void action(Request request) {
		System.out.println("Servlet " + request.getUrl() + " url'i ile çağırıldı.");
		if (request.getTip().equals(GET)) {
			doGet(request);
		} else if (request.getTip().equals(POST)) {
			doPost(request);
		}
		System.out.println("Varsa açık veritabanı connection'ları kapatılıyor.");
		System.out.println("**********************");
	}

	public void doGet(Request request) {
		throw new RuntimeException("Get yöntemi bu servlette desteklenmiyor");
	}

	public void doPost(Request request) {
		throw new RuntimeException("Post yöntemi bu servlette desteklenmiyor");
	}
}
