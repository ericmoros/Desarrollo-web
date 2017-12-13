import java.util.ArrayList;

public class H1_Ej18 {

	public static void main(String[] args) throws InterruptedException {
		int num_from = 1;
		int num_to 	 = 100;
		//int counter = 0;
		ArrayList<Integer> result_2 = new ArrayList<>();
		ArrayList<Integer> result_3 = new ArrayList<>();
		// Quería usar esto en lugar de los objetos pero no me salió...
		//int result_2[] = {};
		//int result_3[] = {};
	
			
			for (int num = num_from; num <= num_to; num++) {
				if (num % 2 == 0) {
					result_2.add(num);
					// result_2[counter] = num;
				}
	
				if (num % 3 == 0) {
					result_3.add(num);
					// result_3[counter] = num;
				}
				//
				//
				//counter++;
			}
			
			
				System.out.println(
							"Del " + num_from + " al " + num_to + " son multiplos de:"
				   + "\n" + " [2]:"
				   + "\n" + "    " + result_2
				   + "\n" + " [3]:"
				   + "\n" + "    " + result_3
				);
	}
}

/*
Proceso H1_Ej18
	Definir num_from, num_to Como Entero;
	
		num_from <- 1;
		num_to <- 100;
		
		
			Escribir "Del ", num_from, " al ", num_to, " son multiplos de:";
		
			Escribir " [2]:";
			Para num <- num_from Hasta num_to Con Paso 1 Hacer
				Si num % 2 == 0 Entonces
					Escribir "    ", num;
				Fin Si
			Fin Para
			
			Escribir " [3]:";
			Para num <- num_from Hasta num_to Con Paso 1 Hacer
				Si num % 3 == 0 Entonces
					Escribir "    ", num;
				Fin Si
			Fin Para
FinProceso
*/