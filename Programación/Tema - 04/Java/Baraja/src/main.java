import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		String salida, entrada;
		boolean baraja[] = new boolean[52];
		int posicion[] = new int [52];
		boolean correcto;
		int pos, cont=0, peticion=0, substring;
		Scanner teclado = new Scanner (System.in);
		for(int carta=0; carta<52; carta++) {
			baraja [carta]=false;
		}

		for(int carta=0; carta<52; carta++) {
			do {
				pos = (int) (Math.random() * 52);
			} while (baraja[pos]==true);
			baraja[pos]=true;
			posicion[carta]=pos;
			salida = "";
			switch (pos % 13) {
			case 0: salida+="2 ";
			break;

			case 1: salida+="3 ";
			break;

			case 2: salida+="4 ";
			break;

			case 3: salida+="5 ";
			break;

			case 4: salida+="6 ";
			break;

			case 5: salida+="7 ";
			break;

			case 6: salida+="8 ";
			break;

			case 7: salida+="9 ";
			break;

			case 8: salida+="10";
			break;

			case 9: salida+="J ";
			break;

			case 10: salida+="Q ";
			break;

			case 11: salida+="K ";
			break;

			case 12: salida+="A ";
			break;
			}
			switch(pos/13) {
			case 0:
				salida+="♥";
				break;
			case 1:
				salida+="♦";
				break;
			case 2:
				salida +="♣";
				break;
			case 3:
				salida+="♠";
				break;
			}
			//			System.out.println(salida);
			System.out.printf("%6s",salida);
			cont++;
			if(cont%4==0){
				System.out.println();
			}


		}
		do {
			correcto=false;
			System.out.println("Elige una carta para saber su posición (0 para salir)");
			entrada = teclado.next().toUpperCase();
			if(!entrada.equals("0")) {//Corrección
				if(entrada.charAt(1)>=48 && entrada.charAt(1)<=57) {
					substring = 2;
				}else if(entrada.charAt(0)>=48 && entrada.charAt(0)<=57){
					substring = 1;
				}else {
					substring = 0;
					switch(entrada.charAt(0)) {
					case 'J':
						peticion=9;
						break;
					case 'Q':
						peticion=10;
						break;
					case 'K':
						peticion=11;
						break;
					case 'A':
						peticion=12;
						break;
					}
				}
				if(substring>0) {

					peticion = (Integer.parseInt(entrada.substring(0, substring)))-2;
				}
				switch(entrada.charAt(entrada.length()-1)){
				case '♥':
					correcto = true;
					break;
				case '♦':
					correcto = true;
					peticion+=13;
					break;
				case '♣':
					correcto = true;
					peticion+=26;
					break;
				case '♠':
					correcto = true;
					peticion+=39;
					break;
				default:
					System.out.println("Error al introducir la carta");
				}

				for(int lugar=0; lugar<52; lugar++) {
					if(peticion==posicion[lugar]&&correcto==true) {
						System.out.println("La carta esta en la posición "+(lugar+1));
					}
				}
			}
		}while(!entrada.equals("0"));
		//		System.out.println();
		//		for(int i=0;i<52;i++) {
		//			System.out.println(baraja[i]);
		//		}

	}

}

