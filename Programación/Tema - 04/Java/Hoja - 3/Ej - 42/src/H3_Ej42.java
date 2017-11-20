public class H3_Ej42 {
	public static void main(String[] args) {
		final int months = 12;
		final int representatives = 3;
		final int products = 4;
		
		final int max = 1;
		final int min = 10;
		
		int ventas [][][] = new int[representatives][months][products];
		int totalVentas [] = new int[products];
		
		
		for (int representativesPos = 0; representativesPos < representatives; representativesPos++) {
			System.out.println("\n\n\nRepresentante " + (representativesPos + 1));
			System.out.print("     ");
			for (int productsPos = 0; productsPos < products; productsPos++) {
				System.out.printf("  P%1$-3d", (productsPos + 1));
			}
			for (int monthsPos = 0; monthsPos < months; monthsPos++) {
				System.out.printf("\n M%1$-3d", (monthsPos + 1));
				for (int productsPos = 0; productsPos < products; productsPos++) {
					int cells = (int)(Math.random() * (max - min + 1) + min);
					System.out.printf("  %1$04d", cells);
					ventas[representativesPos][monthsPos][productsPos] = cells;
				}
			}
			
			System.out.print("\n     ");
			for (int productsPos = 0; productsPos < products; productsPos++) {
				System.out.print("  ----");
			}
			System.out.print("\nTotal");
			for (int productsPos = 0; productsPos < products; productsPos++) {
				int productsTotal = 0;
				for (int monthsPos = 0; monthsPos < months; monthsPos++) {
					int cells = ventas[representativesPos][monthsPos][productsPos];
					productsTotal += cells;
				}
				System.out.printf("  %1$04d", productsTotal);
				totalVentas[productsPos] += productsTotal;
			}
		}
		
		
		System.out.print("\n\n\n +-----");
		for (int productsPos = 0; productsPos < products; productsPos++) {
			System.out.print("+-----");
		}
		System.out.print("+\n |Re/Pr");
		for (int productsPos = 0; productsPos < products; productsPos++) {
			System.out.printf("|P%1$-4d", (productsPos + 1));
		}
		System.out.print("|\n +-----");
		for (int productsPos = 0; productsPos < products; productsPos++) {
			System.out.print("+-----");
		}
		
		System.out.print("+\n |Total");
		for (int representativesVentas: totalVentas) {
			System.out.printf("|%1$05d", representativesVentas);
		}
		System.out.print("|\n +-----");
		for (int productsPos = 0; productsPos < products; productsPos++) {
			System.out.print("+-----");
		}
		System.out.print("+");
	}
}

/*
42.
-
Una empresa guarda en una tabla de 3x12x4 las ventas realizadas por sustres representantes a lo largo de doce meses de sus cuatro productos,
VENTAS [representante, mes, producto]. Queremos proyectar el arraytridimensional sobre uno de dos dimensiones que represente el total deventas, 
TOTAL [mes, producto], para lo cual sumamos las ventas de cadaproducto de cada mes de todos los representantes. Imprimir ambos arrays.  
*/

