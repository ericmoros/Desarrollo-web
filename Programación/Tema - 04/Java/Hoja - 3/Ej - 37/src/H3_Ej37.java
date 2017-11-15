import java.util.Scanner;

public class H3_Ej37 {
	public static void main(String[] args) {
		int rows = 4;
		int columns = 5;
		int max = 1;
		int min = 100;
		
		int matriz [][] = new int[rows][columns];
		
		int rowKey = 0;
		for (int[] mRows: matriz) {
			System.out.println("  ");
			int cellKey = 0;
			for (int cells: mRows) {
				cells = (int)(Math.random() * (max - min + 1) + min);
				System.out.printf("[%1$4d]", cells);
				matriz[rowKey][cellKey] = cells;
				cellKey++;
			}
			rowKey++;
		}
		
		System.out.println("\n");
		for (int[] mRows: matriz) {
			for (int cells: mRows) {
				System.out.printf("[%1$4d]", cells);
			}
		}
		
	}
}

/*
37 - Generar una matriz de 4 filas y 5 columnas con números aleatorios entre 1y 100, y hacer su matriz transpuesta.
*/