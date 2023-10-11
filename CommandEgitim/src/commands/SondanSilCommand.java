package commands;

import editor.TextEditor;
import lombok.ToString;

@ToString(callSuper = true)
public class SondanSilCommand extends Command {

	public SondanSilCommand(TextEditor editor, String text) {
		super(editor, text);
	}

	@Override
	public void geriAl() {
		getEditor().getText().append(getText());
	}

}
