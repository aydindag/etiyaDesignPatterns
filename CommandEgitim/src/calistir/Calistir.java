package calistir;

import editor.TextEditor;

public class Calistir {
	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		editor.sonaEkle("hava ");
		editor.basaEkle("...Bu gün ");
		editor.sonaEkle("çok güzet");
		editor.sondanSil(1);
		editor.sonaEkle("l");
		editor.bastanSil(3);
		editor.islemGecmisiniYaz();
		System.out.println("Text: " + editor);
		editor.geriAl(3);
		System.out.println("Text: " + editor);
	}
}
