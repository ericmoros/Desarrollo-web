import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		final String cornerUpLeft = "╔";
		final String cornerUpRight = "╗";
		final String cornerDownLeft = "╚";
		final String cornerDownRight = "╝";
		
		final String sideX = "═";
		final String sideY = "║";
		
		final String insideUp = "╦";
		final String insideDown = "╩";
		final String insideLeft = "╠";
		final String insideRight = "╣";
		
		final String corner = "╬";
		
		final short resolutionX = 12;
		final short resolutionY = 6;
		
		final boolean sea[][] = new boolean[resolutionY][resolutionX];
		
		final String trieSea  = " S ";
		final String trieShip = " X ";

		
	//___ TABLERO DEL JUEGO__________________________________________
		System.out.print(cornerUpLeft + sideX + sideX + sideX);
		for (int temp = 0; temp < resolutionX; temp++) {
			System.out.print(insideUp + sideX + sideX + sideX);
		}
		System.out.println(cornerUpRight);
		
		System.out.print(sideY + "   ");
		for (int temp = 0; temp < resolutionX; temp++) {
			System.out.print(sideY + " "+ (char)(65 + temp) + " ");
		}
		System.out.print(sideY);
		
		for (int temp = 0; temp < resolutionY; temp++) {
			System.out.println();
			System.out.print(insideLeft + sideX + sideX + sideX);
			for (int temp2 = 0; temp2 < resolutionX; temp2++) {
				System.out.print(corner + sideX + sideX + sideX);
			}
			System.out.print(insideRight);
			
			System.out.println();
			System.out.print(sideY + " "+ (temp + 1) +" ");
			for (int temp2 = 0; temp2 < resolutionX; temp2++) {
				if (sea[temp][temp2] == true) {			// <---- POSICIÓN BARCO
					System.out.print(sideY + trieShip);
				} else {
					System.out.print(sideY + trieSea);
				}
			}
			System.out.print(sideY);
		}
		System.out.println();
		System.out.print(cornerDownLeft + sideX + sideX + sideX);
		for (int temp = 0; temp < resolutionX; temp++) {
			System.out.print(insideDown + sideX + sideX + sideX);
		}
		System.out.println(cornerDownRight);
	//________________________________________________________________
		
		
		System.out.println("\nPosiciona tu barco: ");
		System.out.println("          Nº     Lª");
		System.out.print  ("- Proa:   ");
		keyboard.nextInt();
		System.out.println("      ");
		keyboard.next();
		System.out.println("- Puente: ");
		keyboard.nextInt();
		System.out.println("      ");
		keyboard.next();
		System.out.println("- Popa:   ");
		keyboard.nextInt();
		System.out.println("      ");
		keyboard.next();
	}
}
