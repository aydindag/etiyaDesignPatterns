package commands;

import editor.TextEditor;
import lombok.ToString;

@ToString(callSuper = true)
public class BasaEkleCommand extends Command {

	public BasaEkleCommand(TextEditor editor, String text) {
		super(editor, text);
	}

	@Override
	public void geriAl() {
		getEditor().getText().delete(0, getText().length());
	}

}
