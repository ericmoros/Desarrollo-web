/**
 * 
 */
package potter;

/**
 * @author Eric Moros Pérez, Luis Gargallo Alarcos
 */
public class DiscountCalculator {
	/**
	 * Calcula los descuentos que aplicará en función de los libros que se introduzcan en el vector
	 * @param books
	 * @return totalDiscount
	 */
	public double calculate(int[] books) {
		Boolean[] bookScanner = { false, false, false, false, false };
		Float discount = 0F;
		Float precio = 0F;
		Float precioLibroFijo = 8F;

		Integer numDif = 0;

		for (int i = 0; i < books.length; i++) {
			if (bookScanner[books[i]] == true) {
				discount += precioLibroFijo;
			} else {
				bookScanner[i] = true;
				numDif++;
			}
		}
		//

		switch (numDif) {
		case 1:;
			discount += precio;
			break;
			
		case 2:
			precio = precioLibroFijo * 2F;
			discount += precio * 0.95F;
			break;
		case 3:
			precio = precioLibroFijo * 3F;
			discount += precio * 0.90F;
			break;
		case 4:
			precio = precioLibroFijo * 4F;
			discount += precio * 0.80F;
			break;
		case 5:
			precio = precioLibroFijo * 5F;
			discount += precio * 0.75F;
			break;
		}

		return discount;
	}
}
