package calistir;

import beans.GUIBuilder;
import beans.GUIBuilder.GUITypes;
import beans.IButton;
import beans.ILabel;
import beans.IWindow;

public class Calistir {
	public static void main(String[] args) {
		GUIBuilder guiBuilder = new GUIBuilder();
		IWindow window1 = guiBuilder.getWindow(GUITypes.WINDOWS);
		window1.setBaslik("Giriş Ekranı");

		IButton button1 = window1.buttonOlustur();
		button1.setText("Giriş");

		ILabel label1 = window1.labelOlustur();
		label1.setText("EPosta");

		System.out.println(window1);
		System.out.println(button1);
		System.out.println(label1);

		IWindow window2 = guiBuilder.getWindow(GUITypes.MAC);
		window2.setBaslik("Giriş Ekranı");

		IButton button2 = window2.buttonOlustur();
		button2.setText("Giriş");

		ILabel label2 = window2.labelOlustur();
		label2.setText("EPosta");

		System.out.println(window2);
		System.out.println(button2);
		System.out.println(label2);
	}
}
