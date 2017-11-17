public class H3_Ej42 {
	public static void main(String[] args) {
		final int months = 12;
		final int representatives = 3;
		final int products = 4;
		
		int max = 1;
		int min = 100;
		
		
		int ventas [][][] = new int[months][representatives][products];
		
		System.out.println("Months\n");
		for (int monthsPos = 0; monthsPos < months; monthsPos++) {
			System.out.println("Representatives\n");
			for (int representativesPos = 0; representativesPos < representatives; representativesPos++) {
				System.out.println("Products\n");
				for (int productsPos = 0; productsPos < products; productsPos++) {
					int cells = (int)(Math.random() * (max - min + 1) + min);
					cells = ventas[monthsPos][representativesPos][productsPos];
					System.out.printf(" %1$04d ", cells);
				}
			}
		}
	}
}

/*
42.
-
Una empresa guarda en una tabla de 3x12x4 las ventas realizadas por sustres representantes a lo largo de doce meses de sus cuatro productos,
VENTAS [representante, mes, producto]. Queremos proyectar el arraytridimensional sobre uno de dos dimensiones que represente el total deventas, 
TOTAL [mes, producto], para lo cual sumamos las ventas de cadaproducto de cada mes de todos los representantes. Imprimir ambos arrays.  
*/

