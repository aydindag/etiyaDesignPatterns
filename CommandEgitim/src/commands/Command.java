package commands;

import editor.TextEditor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString(exclude = "editor")
public abstract class Command {
	private TextEditor editor;
	private String text;

	public abstract void geriAl();
}
