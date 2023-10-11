package beans;

import lombok.Data;

@Data
public class Pizza implements IPizza {
	private String hamur;
	private String malzemeler;
}
