package uyelik;

public class BronzSeviye implements Seviye {

	@Override
	public void puanDegisti(Uye uye) {
		if (uye.getPuan() > 3000) {
			uye.setSeviye(new AltinSeviye());
		} else if (uye.getPuan() > 1000) {
			uye.setSeviye(new GumusSeviye());
		}
	}

	@Override
	public String toString() {
		return "Bronz";
	}
}
