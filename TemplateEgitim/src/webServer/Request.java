package webServer;

import java.util.Map;

import lombok.Data;

@Data
public class Request {
	public static enum RequestType {
		GET, PUT, POST;
	}

	private RequestType tip;
	private String url;
	private Map<String, String> parametreler;

	public String getParameter(String key) {
		return parametreler.get(key);
	}
}
