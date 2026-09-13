package algoritmos.lista1;

import java.util.Locale;
import java.text.NumberFormat;

public class ConverterReal {

	public static String converter(double valor) {
	
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.of("pt","BR"));
		return nf.format(valor);
		
	}
	
}
