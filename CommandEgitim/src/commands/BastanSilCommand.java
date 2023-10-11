package commands;

import editor.TextEditor;
import lombok.ToString;

@ToString(callSuper = true)
public class BastanSilCommand extends Command {

	public BastanSilCommand(TextEditor editor, String text) {
		super(editor, text);
	}

	@Override
	public void geriAl() {
		getEditor().getText().insert(0, getText());
	}

}
