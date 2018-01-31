import static org.junit.Assert.*;

import org.junit.Test;

public class Ej1Test {

	@Test
	public void testMetodo() {
		Ej1 test = new Ej1();
		int result;
		
		result = test.metodo(false, false, false);	//0 0 0
		assertEquals(result, 2);
		
		result = test.metodo(false, false, true);	//0 0 1
		assertEquals(result, 2);
		
		result = test.metodo(false, true, false);	//0 1 0
		assertEquals(result, 2);
		
		result = test.metodo(false, true, true);	//0 1 1
		assertEquals(result, 2);
		
		result = test.metodo(true, false, false);	//1 0 0
		assertEquals(result, 2);

		result = test.metodo(true, false, true);	//1 0 1
		assertEquals(result, 2);
		
		result = test.metodo(true, true, false);	//1 1 0
		assertEquals(result, 1);
		
		result = test.metodo(true, true, true);		//1 1 1
		assertEquals(result, 1);
	}

}
