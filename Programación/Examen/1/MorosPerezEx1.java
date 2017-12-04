package p;

import java.math.BigDecimal;

public class MorosPerezEx1 {
	public static void main(String[] args) {
		final short TOTAL_ALUMNOS = 5;
		final short TOTAL_PREGUNTAS = 10;
		char alumnos[][] = new char[TOTAL_ALUMNOS][TOTAL_PREGUNTAS];//Almacenare aquí las respuestas de las preguntas con letras
		
		final char POSIBLES_RESPUESTAS[] = {'A', 'B', 'C', 'D'};
		final short TOTAL_POSIBLES_RESPUESTAS = (short) POSIBLES_RESPUESTAS.length; //Cojo el tamaño para luego usarlo más comodamente
		
		char solucion[] = {'B', 'D', 'A', 'C', 'B', 'C', 'A', 'C', 'B', 'D'};
		
//		_____ MUESTRO POR PANTALLA LA SOLUCIÓN _____________________________________________________
		
		System.out.print("Solucion:  ");
		for (int actualRespuesta = 0;actualRespuesta < solucion.length;actualRespuesta++) {
			System.out.printf("%0$3c", solucion[actualRespuesta]);
		}
		
//		____________________________________________________________________________________________
		System.out.println("\n\t\t\t\t\t\tAciertos\tFallos\tCalificacion");
		for (short actualAlumno = 0;actualAlumno < TOTAL_ALUMNOS; actualAlumno++) {
			System.out.print("\nAlumno  " + (actualAlumno + 1) + ":   ");
			short aciertos	= 0;
			short fallos	= 0;
			for (short actualPregunta = 0;actualPregunta < TOTAL_PREGUNTAS; actualPregunta++) {//Paso por todas las preguntas
				short respuesta = (short) (Math.random() * TOTAL_POSIBLES_RESPUESTAS);//Cojo una respuesta aleatoria del 1 al 4
				char letra = POSIBLES_RESPUESTAS[respuesta];//Elijo la letra con su posición en el vector
				alumnos[actualAlumno][actualPregunta] = letra;//La almaceno
				
				if (letra == solucion[actualPregunta]) {// Comparo la letra que ha puesto en la pregunta y si es igual
					aciertos++;							// que la de la solución le doy un acierto
				} else {								// Que no...
					fallos++;							// le sumo un fallo
				}
				
				System.out.print(alumnos[actualAlumno][actualPregunta] + "  ");//Imprimo la pregunta
			}
			final float NOTA = (float) aciertos - (float) fallos * 0.3F;//saco la nota
			BigDecimal notaFormateada = new BigDecimal(NOTA).setScale(2, BigDecimal.ROUND_HALF_UP);
			System.out.printf("\t    %0$2d\t\t   %0$2d", aciertos, fallos);//presento sus aciertos, sus fallos
			System.out.print("\t   " + notaFormateada);					   //y su nota
		}
	}
}

/*
CALIFICACIONES DE CADA ALUMNO...

ALUMNOS 5 (Generar respuestas de forma aleatoria y 0 en blanco)
 Examen 10 preguntas
 	PREGUNTAS
 		A/B/C/D
 	
 	SOLUCIÓN
 		PREGUNTA	1, 2, 3, 4, 5, 6, 7, 8, 9, 10
 		RESPUESTA	B, D, A, C, B, C, A, C, B, D
 		
	PONDERACIÓN
		NOTA = ACERTADAS - FALLADAS * 0.3
		
 FORMATO SALIDA DATOS
 
 	Solucion: 	B  D  A  C  B  C  A  C  B  D
 													Aciertos		Fallos	Calificacion
 	
 	Alumno	1:	X  X  X  X  X  X  X  X  X  X			?			   ?	 -?,??
 	Alumno	2:	X  X  X  X  X  X  X  X  X  X			?			   ?	 -?,??
 	Alumno	3:	X  X  X  X  X  X  X  X  X  X			?			   ?	 -?,??
 	Alumno	4:	X  X  X  X  X  X  X  X  X  X			?			   ?	 -?,??
 	Alumno	5:	X  X  X  X  X  X  X  X  X  X			?			   ?	 -?,??
		
*/
