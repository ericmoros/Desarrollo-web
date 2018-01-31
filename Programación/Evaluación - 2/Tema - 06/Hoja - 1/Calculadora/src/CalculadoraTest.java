import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;

class CalculadoraTest {
	@Test
	void testResta2() {
		Calculadora calculadora = new Calculadora(2, 2);
		Boolean resultado = calculadora.resta2();
		assertEquals("mensaje", true, resultado);
	}

	@Test
	void testDivide2() {
		Calculadora calculadora = new Calculadora(2, 0);
		Integer resultado = calculadora.divide2();
		assertNull("mensaje", resultado);
	}

	@Test
	public void testSuma() {
		Calculadora calculadora = new Calculadora(2, 2);
		int resultado = calculadora.suma();
		assertEquals("mensaje", 4, resultado);
	}

	@Test
	public void testResta() {
		Calculadora calculadora = new Calculadora(2, 2);
		int resultado = calculadora.resta();
		assertEquals("mensaje", 0, resultado);
	}

	@Test
	public void testMultiplica() {
		Calculadora calculadora = new Calculadora(2, 2);
		int resultado = calculadora.multiplica();
		assertEquals("mensaje", 4, resultado);
	}

	@Test
	public void testDivide() {
		Calculadora calculadora = new Calculadora(2, 2);
		int resultado = calculadora.divide2();
		//assertNull("mensaje", resultado);
		assertEquals("mensaje", 1, resultado);
	}
}
