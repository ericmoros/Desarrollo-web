Proceso H1_Ej19
	//Salida de texto
	Definir output_status Como Logico;
	
	//Año actual
	Definir year_current Como Entero;
	
	//En relación al Día
	Definir day, day_limit, day_formated Como Entero;
	Definir day_status Como Logico;
	
	//En relación al Mes
	Definir month Como Entero;
	Definir month_formated Como Caracter;
	Definir month_status Como Logico;
	
	//En relación al Año
	Definir year, year_formated Como Entero;
	Definir year_status Como Logico;
	
	
		output_status <- Falso;
		Mientras output_status != Verdadero Hacer
			Escribir "Introduce el año actual";
			Leer year_current;
			Escribir "";
			
			day_limit <- 0;
			day_formated <- 0;
			day_status <- Falso;
			
			month_formated <- "";
			month_status <- Falso;
			
			year_formated <- 0;
			year_status <- Falso;
			
			
				Escribir "Introduce el número de:";
				Escribir " - Día: ";
				Leer day;
				Escribir " - Mes: ";
				Leer month;
				Escribir " - Año: ";
				Leer year;
				
				
					Si year > 0 && year <= year_current Entonces
						year_status <- Verdadero;
						
						year_formated <- year;
					Fin Si
					
					
					Si month >= 1 && month <= 12 Entonces
						month_status <- Verdadero;
						
						Segun month Hacer
							1:
								month_formated <- "Enero";
								day_limit <- 31;
							2:
								month_formated <- "Febrero";
								Si (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)) Entonces
									day_limit <- 29;
								SiNo
									day_limit <- 28;
								Fin Si
							3:
								month_formated <- "Marzo";
								day_limit <- 31;
							4:
								month_formated <- "Abril";
								day_limit <- 30;
							5:
								month_formated <- "Mayo";
								day_limit <- 31;
							6:
								month_formated <- "Junio";
								day_limit <- 30;
							7:
								month_formated <- "Julio";
								day_limit <- 31;
							8:
								month_formated <- "Agosto";
								day_limit <- 31;
							9:
								month_formated <- "Septiembre";
								day_limit <- 30;
							10:
								month_formated <- "Octubre";
								day_limit <- 31;
							11:
								month_formated <- "Nomviembre";
								day_limit <- 30;
							12:
								month_formated <- "Diciembre";
								day_limit <- 31;
						Fin Segun
					Fin Si
					
					
						Si month_status == Verdadero && day > 0 && day <= day_limit Entonces
							day_status <- Verdadero;
							
							day_formated <- day;
						Fin Si
						
							
							Si year_status && month_status && day_status Entonces
								output_status = Verdadero;
								
								Escribir "";
								Escribir day_formated, " de ", month_formated, " de ", year_formated;
							SiNo
								Escribir "";
								Escribir "[ERROR]";
								Escribir " - Día: ", day_status;
								Escribir " - Mes: ", month_status;
								Escribir " - Año: ", year_status;
								Escribir "";
								Escribir "";
							Fin Si
		Fin Mientras
FinProceso