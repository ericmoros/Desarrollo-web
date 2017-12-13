import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		final String cornerUpLeft = "╔";
		final String cornerUpRight = "╗";
		final String cornerDownLeft = "╚";
		final String cornerDownRight = "╝";
		int noHay = 0;
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
		
		final String exitPlayers = "X";
		

//		for (short loops = 0; loops < 4; loops++) {
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
		
		
	//________________________________________________________________
		System.out.println("Jugadores ('X' para salir)");
		short actualPlayer = 0;
		String player = "";
		String inputText;
		do {
			System.out.print("Jugador " + (actualPlayer + 1) + ": ");
			inputText = keyboard.nextLine();
			if (!inputText.equalsIgnoreCase(exitPlayers)) {
				player += inputText;
				player += "§;";
				actualPlayer++;
			}
		} while (!inputText.equalsIgnoreCase(exitPlayers));
		
		String playerList[] = new String [actualPlayer];
		for (int actualChar = 0,i=0;noHay != -1;actualChar += 2,i++) {
			String namePlayer = player.substring(actualChar, player.indexOf("§;",actualChar));
			actualChar=player.indexOf("§;",actualChar);
			noHay=player.indexOf("§;",actualChar+1);
			playerList[i]=namePlayer;
		}
	//________________________________________________________________
		
		
	//________________________________________________________________
		System.out.println("\nPosiciona tu barco: ");
		for(String players: playerList) {
			System.out.println(" " + players + ":");
			
			System.out.println("          NºLª");
			System.out.print  (" - Proa:   ");
			String bow = keyboard.next();
//			String bow = "6C";
			
			System.out.print(" - Puente: ");
			String bridge = keyboard.next();
//			String bridge = "6B";
			
			System.out.print(" - Popa:   ");
			String stern = keyboard.next();
//			String stern = "6A";
			
			System.out.println("\nBarco 1: " + bow + bridge + stern);
		}
	//________________________________________________________________
	}
}
