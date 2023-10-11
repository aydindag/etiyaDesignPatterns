package kutuphane;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Kitap {
	private KitapTuru tur;
	private String adi;
	private String yazar;
}
