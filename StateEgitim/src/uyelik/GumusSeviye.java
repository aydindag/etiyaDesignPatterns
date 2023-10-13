package uyelik;

public class GumusSeviye implements Seviye {

	@Override
	public void puanDegisti(Uye uye) {
		if (uye.getPuan() < 800) {
			uye.setSeviye(new BronzSeviye());
		} else if (uye.getPuan() > 3500) {
			uye.setSeviye(new AltinSeviye());
		}
	}

	@Override
	public String toString() {
		return "Gümüş";
	}
}
