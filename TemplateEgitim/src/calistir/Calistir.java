package calistir;

import static webServer.Request.RequestType.GET;
import static webServer.Request.RequestType.POST;

import java.util.HashMap;
import java.util.Map;

import webServer.Request;
import webServer.Sunucu;

public class Calistir {
	public static void main(String[] args) {
		Sunucu webSunucusu = new Sunucu();
		giris1(webSunucusu);
		giris2(webSunucusu);
		rapor(webSunucusu);
	}

	private static void giris1(Sunucu webSunucusu) {
		Request request1 = new Request();
		request1.setUrl("/giris");
		request1.setTip(GET);
		Map<String, String> params = new HashMap<>();
		params.put("adi", "levent");
		params.put("sifre", "123");
		request1.setParametreler(params);

		webSunucusu.istekYap(request1);
	}

	private static void giris2(Sunucu webSunucusu) {
		Request request1 = new Request();
		request1.setUrl("/giris");
		request1.setTip(GET);
		Map<String, String> params = new HashMap<>();
		params.put("adi", "levent");
		params.put("sifre", "levent");
		request1.setParametreler(params);

		webSunucusu.istekYap(request1);
	}

	private static void rapor(Sunucu webSunucusu) {
		Request request1 = new Request();
		request1.setUrl("/rapor");
		request1.setTip(POST);
		Map<String, String> params = new HashMap<>();
		params.put("raporId", "145");
		params.put("ay", "3");
		request1.setParametreler(params);

		webSunucusu.istekYap(request1);
	}
}
