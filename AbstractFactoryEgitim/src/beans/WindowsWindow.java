package beans;

import lombok.Data;

@Data
public class WindowsWindow implements IWindow {
	private String baslik;

	@Override
	public IButton buttonOlustur() {
		return new WindowsButton();
	}

	@Override
	public ILabel labelOlustur() {
		return new WindowsLabel();
	}

}
