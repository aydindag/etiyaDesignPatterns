package futbol;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Top {
	private int x;
	private int y;
	private List<Bilgilendirilebilir> gozlemci = new ArrayList<>();

	public void gozlemciEkle(Bilgilendirilebilir sinif) {
		gozlemci.add(sinif);
	}

	public void gozlemciCikar(Bilgilendirilebilir sinif) {
		gozlemci.remove(sinif);
	}

	public void setX(int x) {
		this.x = x;
		tumGozlemcilereBilgiVer();
	}

	public void setY(int y) {
		this.y = y;
		tumGozlemcilereBilgiVer();
	}

	private void tumGozlemcilereBilgiVer() {
		gozlemci.forEach(s -> s.farket(this, x, y));
	}

}
