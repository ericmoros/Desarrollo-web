public class H3_Ej37 {
	public static void main(String[] args) {
		int rows = 4;
		int columns = 5;
		int max = 1;
		int min = 100;
		
		int matriz [][] = new int[rows][columns];

		for (int rowPos = 0; rowPos < rows; rowPos++) {
			System.out.println();
			for (int columnPos = 0; columnPos < columns; columnPos++) {
				int cells = (int)(Math.random() * (max - min + 1) + min);
				System.out.printf(" %1$04d ", cells);
				matriz[rowPos][columnPos] = cells;
			}
		}
		
		System.out.println();
		
		for (int columnPos = 0; columnPos < columns; columnPos++) {
			System.out.println();
			for (int rowPos = 0; rowPos < rows; rowPos++) {
				int cells = matriz[columnPos][rowPos];
				System.out.printf(" %1$04d ", cells);
			}
		}
		
//		//___CACA__________________for (fffff=dddd;fff<aaaa;dddd++)____							
//		int rowKey = 0;
//		for (int[] mRows: matriz) {
//			System.out.println("  ");
//			int cellKey = 0;
//			for (int cells: mRows) {
//				cells = (int)(Math.random() * (max - min + 1) + min);
//				System.out.printf(" %1$04d ", cells);
//				matriz[rowKey][cellKey] = cells;
//				cellKey++;
//			}
//			rowKey++;
//		}
//		//_____________________________________________________________
//		
//		System.out.println("\n");
//		for (int[] mRows: matriz) {
//			for (int cells: mRows) {
//				System.out.printf(" %1$04d", cells);
//			}
//		}
		
	}
}

/*
37 - Generar una matriz de 4 filas y 5 columnas con números aleatorios entre 1y 100, y hacer su matriz transpuesta.
*/