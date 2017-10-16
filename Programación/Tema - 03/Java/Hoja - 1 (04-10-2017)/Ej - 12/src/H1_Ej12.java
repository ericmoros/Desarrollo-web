public class H1_Ej12 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("+------------+----+");
		System.out.println("|NATURALES   | ^2 |");
		System.out.println("+------------+----+");
		for(int naturals = 1; naturals <= 9; naturals++) { //La tabla es una chapuza rapida pero se adapta al ejercicio, mejor no mirarla jajaja
			if (naturals <= 3) {
				System.out.println("| " + naturals + "          | " + (naturals * naturals) + "  |");
				System.out.println("+------------+----+");
			} else {
				System.out.println("| " + naturals + "          | " + (naturals * naturals) + " |");
				System.out.println("+------------+----+");
			}
		}
    }
}


/*
Proceso H1_Ej12
	Definir naturals Como Entero;
	
	
		Para naturals <- 1 Hasta 9 Con Paso 1 Hacer
			Escribir "El cuadrado de ", naturals, " es: ", (naturals * naturals);
		FinPara
FinProceso
*/
