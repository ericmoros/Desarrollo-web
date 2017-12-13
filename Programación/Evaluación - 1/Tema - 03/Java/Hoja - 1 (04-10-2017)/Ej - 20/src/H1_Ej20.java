import java.util.Calendar;
import java.util.Scanner;

public class H1_Ej20 {

	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		String student;
		
		//PROBLEMAS
		float problems;
		float problems_min 	 		 = (float) 0 ;
		float problems_max 	 		 = (float) 10;
//		float problems_points		 = (float) 0 ;
		boolean problems_status		 = false     ;
		float problems_percentage 	 = (float) 10;
		float problems_result		 = (float) 0 ; 
		
		//TEÓRICA
		float theoretical;
		float theoretical_min 		 = (float) 0 ;
		float theoretical_max 	 	 = (float) 10;
//		float theoretical_points	 = (float) 0 ;
		boolean theoretical_status	 = false     ;
		float theoretical_percentage = (float) 50;
		float theoretical_result	 = (float) 0 ;
		
		//PRÁCTICA
		float practice;		
		float practice_min 	 		 = (float) 0 ;
		float practice_max			 = (float) 10;
		boolean practice_status		 = false     ;
		float practice_percentage	 = (float) 40;
//		float practice_points 		 = (float) 0 ;
		float practice_result		 = (float) 0 ;
		
		//FINAL
		float result_final;
		
		
			System.out.println("Rellene los datos para ver su nota final...");
				System.out.print(" - Nombre: ");
				student = keyboard.next();
				
				System.out.println(" - Notas: ");
					System.out.print("  → Problemas: ");
					problems = keyboard.nextFloat();
					
					System.out.print("  → Teórica:   ");
					theoretical = keyboard.nextFloat();
					
					System.out.print("  → Práctica:  ");
					practice = keyboard.nextFloat();
					
					
						if (problems >= problems_min && problems <= problems_max) {
//							problems_points = (float) (problems_max - problems_min);
							problems_status 	= true;
						}
						
						if (theoretical >= theoretical_min && theoretical <= theoretical_max) {
//							theoretical_points = (float) (problems_max - problems_min);
							theoretical_status 	= true;
						}

						if (practice >= practice_min && practice <= practice_max) {
//							practice_points = (float) (problems_max - problems_min);
							practice_status 	= true;
						}
							
						
							System.out.println();
						
							//System.out.println(problems_result + "=" + "(" + problems + "/" + problems_points + ")");
							
							problems_result = (problems * (problems_percentage / 100));
							theoretical_result = (problems / problems_points);
							practice_result = (problems / problems_points);
							
							
							//result_final = ((problems / problems_points) + (theoretical / theoretical_points) + (practice / practice_points)) / (problems_points + theoretical_points + practice_points);
							
								System.out.println(problems_result + ", " + theoretical_result + ", " + practice_result);
								//System.out.println("\nNota final: " + result_final);
		}
	}

/*
	Integer day
	Integer month
	Integer year

	Integer day_limit

	String day_formated
	String month_formated
	String year_formated

	Boolean output_status = false
	String output_text

	Mientras output_status != true
		Enviar "Introduce el número de día"
		Introduce day

		Enviar "Introduce el número del mes"
		Introduce month

		Enviar "Introduce el número del año"
		Introduce year


		Si year < 0
			year_formated = (year + "ac");


		Si month == 1
			month_formated = "Enero"
			day_limit = 31
		y Si month == 2
			month_formated = "Febrero"
			day_limit = 30
		y Si month == 3
			month_formated = "Marzo"
			day_limit = 31
		y Si month == 4
			month_formated = "Abril"
			day_limit = 30
		y Si month == 5
			month_formated = "Mayo"
			day_limit = 31
		y Si month == 6
			month_formated = "Junio"
			day_limit = 30
		y Si month == 7
			month_formated = "Julio"
			day_limit = 31
		y Si month == 8
			month_formated = "Agosto"
			day_limit = 31
		y Si month == 9
			month_formated = "Septiembre"
			day_limit = 30
		y Si month == 10
			month_formated = "Octubre"
			day_limit = 31
		y Si month == 11
			month_formated = "Nomviembre"
			day_limit = 30
		Si no
			month_formated = "Diciembre"
			day_limit = 31


		Si day == day_limit
			day_formated = day
			output_text + day_formated
		y Si month >= 1 y <= 12
			output_status = true
			output_text + (" de " + month_formated)
		Si no 
			output_status = false


		Si output_status == true
			Enviar day_formated + month_formated + " de " + year_formated
		si no
			Enviar "[ERROR]"
	Mientras_fin
*/