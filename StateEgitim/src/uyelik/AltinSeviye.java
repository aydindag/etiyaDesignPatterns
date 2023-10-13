package uyelik;

public class AltinSeviye implements Seviye {

	@Override
	public void puanDegisti(Uye uye) {
		if (uye.getPuan() < 500) {
			uye.setSeviye(new BronzSeviye());
		} else if (uye.getPuan() < 2800) {
			uye.setSeviye(new GumusSeviye());
		}
	}

	@Override
	public String toString() {
		return "Altın";
	}

}
