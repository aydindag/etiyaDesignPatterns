package editor;

import java.util.ArrayList;
import java.util.List;

import commands.BasaEkleCommand;
import commands.BastanSilCommand;
import commands.Command;
import commands.SonaEkleCommand;
import commands.SondanSilCommand;

public class TextEditor {
	private StringBuilder text = new StringBuilder();
	private List<Command> islemler = new ArrayList<>();

	public void basaEkle(String str) {
		islemler.add(new BasaEkleCommand(this, str));
		text.insert(0, str);
	}

	public void bastanSil(int karakterSayisi) {
		String silinecekText = text.substring(0, karakterSayisi);
		islemler.add(new BastanSilCommand(this, silinecekText));
		text.delete(0, karakterSayisi);
	}

	public void sonaEkle(String str) {
		islemler.add(new SonaEkleCommand(this, str));
		text.append(str);
	}

	public void sondanSil(int karakterSayisi) {
		String silinecekText = text.substring(text.length() - karakterSayisi);
		islemler.add(new SondanSilCommand(this, silinecekText));
		text.delete(text.length() - karakterSayisi, text.length());
	}

	public StringBuilder getText() {
		return text;
	}

	public void geriAl(int islemSayisi) {
		while (islemSayisi > 0 && !islemler.isEmpty()) {
			Command command = islemler.get(islemler.size() - 1);
			command.geriAl();
			islemler.remove(command);
			islemSayisi--;
		}
	}

	public void islemGecmisiniYaz() {
		islemler.stream().forEach(System.out::println);
	}

	@Override
	public String toString() {
		return text.toString();
	}

// test kodu
	public static void main(String[] args) {
		TextEditor t = new TextEditor();
		t.sonaEkle("abc");
		t.basaEkle("def");
		t.sonaEkle("gh");
		System.out.println(t);
		t.bastanSil(2);
		System.out.println(t);
		t.sondanSil(2);
		System.out.println(t);
	}
}
