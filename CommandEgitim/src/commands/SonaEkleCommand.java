package commands;

import editor.TextEditor;
import lombok.ToString;

@ToString(callSuper = true)
public class SonaEkleCommand extends Command {

	public SonaEkleCommand(TextEditor editor, String text) {
		super(editor, text);
	}

	@Override
	public void geriAl() {
		int toplamUzunluk = getEditor().getText().length();
		getEditor().getText().delete(toplamUzunluk - getText().length(), toplamUzunluk);
	}

}
