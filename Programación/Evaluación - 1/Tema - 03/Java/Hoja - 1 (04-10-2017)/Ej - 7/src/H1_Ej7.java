import java.util.Scanner;

public class H1_Ej7 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int students, boys, girls;
		double result;
		String output_text;
		
			
			System.out.println("Introduce la cantidad de ni�os");
			boys = keyboard.nextInt();
			
			System.out.println("Introduce la cantidad de ni�as");
			girls = keyboard.nextInt();
			
			
			students = boys + girls;
				output_text = "De los " + students + " alumnos"; 
				
				
					result = ((double) boys /(double) students * 100);
						output_text += (", " + result + "% son ni�os");
						
					result = ((double) girls /(double) students * 100);
							output_text += (" y " + result + "% son ni�as");
						
							
								System.out.println(output_text);
	}
}

/*
Proceso H1_Ej7
	Definir students, boys, girls Como Entero;
	Definir result Como Real;
	Definir output_text Como Texto;
	
	
		Escribir "Introduce la cantidad de ni�os";
		Leer boys;
		
		Escribir "Introduce la cantidad de ni�as";
		Leer girls;
		
		
			students <- boys + girls;
		
				Escribir "";
				Escribir "De los ", students, " alumnos";
				
				
					result <- (boys / students * 100);
						Escribir " ", result, "% son ni�os";
					
					result <- (girls / students * 100);
						Escribir " ", result, "% son ni�as";
FinProceso
 */
