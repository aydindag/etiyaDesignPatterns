package ornek;

import java.util.ArrayList;
import java.util.List;

public class IsimlerIterator {
	private List<String> isimler = new ArrayList<>();
	private int sonOkunan = 0;

	public void setIsimler(List<String> isimler) {
		this.isimler = isimler.stream().sorted().toList();
	}

	public boolean hasNext() {
		return sonOkunan < isimler.size();
	}

	public String next() {
		return isimler.get(sonOkunan++);
	}
}
