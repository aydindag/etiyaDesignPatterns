package beans;

public class GUIBuilder {
	public static enum GUITypes {
		WINDOWS, MAC;
	}

	public IWindow getWindow(GUITypes type) {
		if (GUITypes.WINDOWS.equals(type)) {
			return new WindowsWindow();
		} else if (GUITypes.MAC.equals(type)) {
			return new MacWindow();
		} else {
			throw new RuntimeException("Invalid GUI type");
		}
	}
}
