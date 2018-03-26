/**
 * 
 */
package potter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias de la clase DiscountCalculator
 * 
 * @author Eric Moros Pérez, Luis Gargallo Alarcos
 *
 */
class DiscountCalculatorTest {

	DiscountCalculator calculator = null;
	public static final double ERROR_DELTA = 0.001;
	
	/**
	 * Crea un objeto DiscountCalculator
	 */
	@BeforeEach
	void createCalculator() {
		calculator = new DiscountCalculator();
	}
	
	/**
	 * Comprobamos que si no se introducen libros el resultado da 0 
	 */
	@Test
	void emptyBasketShouldBeZero() {
		int[] shoppingCart = {};
				
		double result = calculator.calculate(shoppingCart);
		
		assertEquals(result, 0.0, ERROR_DELTA);
	}
	
	//@Test Pendiete
	/**
	 * <b>Pendiente</b>
	 * Comprobamos que si solo un libro no se aplica descuento
	 */
	void onlyOneBookShouldNotHaveAnyDiscounts() {
		double result = 0D;
		
		int[] shoppingCart = { 1 };
		result = calculator.calculate(shoppingCart);		
		assertEquals(result, 8.0, ERROR_DELTA);
		
		int[] shoppingCart1 = { 2 };
		result = calculator.calculate(shoppingCart1);		
		assertEquals(result, 8.0, ERROR_DELTA);
		
		int[] shoppingCart2 = { 3 };
		result = calculator.calculate(shoppingCart2);		
		assertEquals(result, 8.0, ERROR_DELTA);
		
		int[] shoppingCart3 = { 4 };
		result = calculator.calculate(shoppingCart3);		
		assertEquals(result, 8.0, ERROR_DELTA);
		
		int[] shoppingCart4 = { 5 };
		result = calculator.calculate(shoppingCart4);		
		assertEquals(result, 8.0, ERROR_DELTA);
	}
	

	/**
	 * Comprobamos que si metemos dos libros diferentes se les aplica un descuento de 0.95
	 */
	@Test
	void twoBooksShouldHaveADiscount() {
		int[] shoppingCart = { 0, 1 };
		
		double result = calculator.calculate(shoppingCart);
				
		assertEquals(result, 8.0 * 2D * 0.95, ERROR_DELTA);
	}
	
	/**
	 * Comprobamos que si metemos dos libros diferentes se les aplica un descuento de 0.9
	 */
	@Test
	void threeBooksShouldHaveADiscount() {
		int[] shoppingCart = { 0, 1, 2 };
		
		double result = calculator.calculate(shoppingCart);
				
		assertEquals(result, 8.0 * 3D * 0.9, ERROR_DELTA);
	}
	
	//@Test Pendiete
	/**
	 * <b>Pendiente</b>
	 * Comprobamos que si introducimos dos libros iguales no se aplica descuento
	 */
	void otherTest() {
		int[] shoppingCart = { 0, 0 };
		
		double result = calculator.calculate(shoppingCart);
				
		assertEquals(result, 8.0 * 2D, ERROR_DELTA);
	}
	
//	@Test
//	void testBasics() {
//	  assert_equal(0, price([]));
//	  assert_equal(8, price([0]))
//	  assert_equal(8, price([1]))
//	  assert_equal(8, price([2]))
//	  assert_equal(8, price([3]))
//	  assert_equal(8, price([4]))
//	  assert_equal(8 * 2, price([0, 0]))
//	  assert_equal(8 * 3, price([1, 1, 1]))
//	}
//
////	@Test
//	void testSimpleDiscounts() {
//	  assert_equal(8 * 2 * 0.95, price([0, 1]))
//	  assert_equal(8 * 3 * 0.9, price([0, 2, 4]))
//	  assert_equal(8 * 4 * 0.8, price([0, 1, 2, 4]))
//	  assert_equal(8 * 5 * 0.75, price([0, 1, 2, 3, 4]))
//	}
//
////	@Test
//	void testSeveralDiscounts() {
//	  assert_equal(8 + (8 * 2 * 0.95), price([0, 0, 1]))
//	  assert_equal(2 * (8 * 2 * 0.95), price([0, 0, 1, 1]))
//	  assert_equal((8 * 4 * 0.8) + (8 * 2 * 0.95), price([0, 0, 1, 2, 2, 3]))
//	  assert_equal(8 + (8 * 5 * 0.75), price([0, 1, 1, 2, 3, 4]))
//	}
//
////	@Test
//	void testEdgeCases() {
//	  assert_equal(2 * (8 * 4 * 0.8), price([0, 0, 1, 1, 2, 2, 3, 4]))
//	  assert_equal(3 * (8 * 5 * 0.75) + 2 * (8 * 4 * 0.8),
//	    price([0, 0, 0, 0, 0,
//	           1, 1, 1, 1, 1,
//	           2, 2, 2, 2,
//	           3, 3, 3, 3, 3,
//	           4, 4, 4, 4]))
//	}

}
