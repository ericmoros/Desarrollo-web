import static org.junit.Assert.*;

import org.junit.Test;

public class Ej2Test {

	@Test
	public void testContar_letra() {
		Ej2 test = new Ej2();
		Integer result;
		String cadena = "hola me llamo Eric y esto es una prueba";
		Integer cadenaLenght = cadena.length();
		Character letra;
		Integer[] asciiResult = new Integer[127];
		
		for (Integer asciiPos = 0; asciiPos < 127; asciiPos++) {
			Integer totalChars = 0;
			
			for (Integer cadenaPos = 0; cadenaPos < cadenaLenght; cadenaPos++) {
				if (cadena.charAt(cadenaPos) == asciiPos) {
					totalChars++;
				}
			}
			
			asciiResult[asciiPos] = totalChars;
		}
		
		for (Integer cadenaPos = 0; cadenaPos < cadenaLenght; cadenaPos++) {
			for (Integer asciiPos = 0; asciiPos < 127; asciiPos++) {
				letra = (Character)(char)(int) asciiPos;
				result = test.contar_letra(cadena, letra);
				assertEquals(result.intValue(), (int) asciiResult[asciiPos]);
			}			
		}
	}

}
