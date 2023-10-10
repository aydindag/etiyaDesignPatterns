package beans;

import lombok.Data;

@Data
public class MacWindow implements IWindow {
	private String baslik;

	@Override
	public IButton buttonOlustur() {
		return new MacButton();
	}

	@Override
	public ILabel labelOlustur() {
		return new MacLabel();
	}

}
