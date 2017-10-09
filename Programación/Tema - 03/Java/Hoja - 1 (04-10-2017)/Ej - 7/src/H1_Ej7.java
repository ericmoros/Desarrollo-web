import java.util.Scanner;

public class H1_Ej7 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int students, boys, girls;
		double result;
		String output_text;
		
			
			System.out.println("Introduce la cantidad de niños");
			boys = keyboard.nextInt();
			
			System.out.println("Introduce la cantidad de niñas");
			girls = keyboard.nextInt();
			
			
			students = boys + girls;
				output_text = "De los " + students + " alumnos"; 
				
				
					result = ((double) boys /(double) students * 100);
						output_text += (", " + result + "% son niños");
						
					result = ((double) girls /(double) students * 100);
							output_text += (" y " + result + "% son niñas");
						
							
								System.out.println(output_text);
	}
}

/*
Proceso H1_Ej7
	Definir students, boys, girls Como Entero;
	Definir result Como Real;
	Definir output_text Como Texto;
	
	
		Escribir "Introduce la cantidad de niños";
		Leer boys;
		
		Escribir "Introduce la cantidad de niñas";
		Leer girls;
		
		
			students <- boys + girls;
		
				Escribir "";
				Escribir "De los ", students, " alumnos";
				
				
					result <- (boys / students * 100);
						Escribir " ", result, "% son niños";
					
					result <- (girls / students * 100);
						Escribir " ", result, "% son niñas";
FinProceso
 */
