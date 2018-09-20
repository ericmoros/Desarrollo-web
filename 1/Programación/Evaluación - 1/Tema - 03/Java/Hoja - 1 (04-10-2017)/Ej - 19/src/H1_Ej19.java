import java.util.Calendar;
import java.util.Scanner;

public class H1_Ej19 {

	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		boolean output_status = false;
		String output_text = "";
		
		while (output_status != true) {
			int year_current = Calendar.getInstance().get(Calendar.YEAR);
			
			int day;
			int day_limit = 0;
			int day_formated = 0;
			boolean day_status = false;
			
			int month;
			String month_formated = "";
			boolean month_status = false;
			
			int year;
			int year_formated = 0;
			boolean year_status = false;
			
			
				System.out.println("Introduce el número de:");
					System.out.print(" - Día: ");
					day = keyboard.nextInt();
		
					System.out.print(" - Mes: ");
					month = keyboard.nextInt();
		
					System.out.print(" - Año: ");
					year = keyboard.nextInt();
				
				
						if (year > 0 && year <= year_current) {
							year_status = true;
							
							year_formated = year;
						}
						
						
						if (month >= 1 && month <= 12) {
							month_status = true;
							
							switch (month) {
								case 1:
									month_formated = "Enero";
									day_limit = 31;
									break;
								case 2:
									month_formated = "Febrero";
									if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
								    	day_limit = 29;
									} else {
										day_limit = 28;
									}
									break;
								case 3:
									month_formated = "Marzo";
									day_limit = 31;
									break;
								case 4:
									month_formated = "Abril";
									day_limit = 30;
									break;
								case 5:
									month_formated = "Mayo";
									day_limit = 31;
									break;
								case 6:
									month_formated = "Junio";
									day_limit = 30;
									break;
								case 7:
									month_formated = "Julio";
									day_limit = 31;
									break;
								case 8:
									month_formated = "Agosto";
									day_limit = 31;
									break;
								case 9:
									month_formated = "Septiembre";
									day_limit = 30;
									break;
								case 10:
									month_formated = "Octubre";
									day_limit = 31;
									break;
								case 11:
									month_formated = "Nomviembre";
									day_limit = 30;
									break;
								case 12:
									month_formated = "Diciembre";
									day_limit = 31;
									break;
							}
						}
						
						
							if (month_status == true && day > 0 && day <= day_limit) {
								day_status = true;
								
								day_formated = day;
							}
							
							
								if (year_status && month_status && day_status) {
									output_status = true;
									
									output_text =
										 "\n" 
											  + day_formated + " de " + month_formated + " de " + year_formated
									;
								} else {
									output_text = 
									     "\n" + "[ERROR]"
									   + "\n" + " - Día: " + day_status
									   + "\n" + " - Mes: " + month_status
									   + "\n" + " - Año: " + year_status
									   + "\n"
									   + "\n"
									;
								}
										
										
									System.out.println(output_text);
			}
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