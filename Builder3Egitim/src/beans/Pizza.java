package beans;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Pizza {
	private String adi;
	private String hamur;
	private List<String> malzemeler = new ArrayList<>();
}
