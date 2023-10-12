package webServer;

public class RaporServlet extends BaseServlet {
	@Override
	public void doPost(Request request) {
		String raporId = request.getParameter("raporId");
		String ay = request.getParameter("ay");
		System.out.println(raporId + " id'li rapor " + ay + " ayı için oluşturuldu.");
	}
}
