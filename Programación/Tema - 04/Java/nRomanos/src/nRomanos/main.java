package nRomanos;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int arabigo, mil, cien, dec, ud;
		String nRomano;
		String entrada;
		boolean keyExit = false;
		boolean correcto;
		boolean cmil;
		do {
			nRomano = "";
			entrada = "";
			System.out.println("Introduce un numero ('0') para salir)");
			entrada = keyboard.nextLine();
			correcto = true;
			cmil=false;
			if (entrada.equals("0")) {
				keyExit = true;
			}

			if (keyExit == false) {
				for(int i = 0; i < entrada.length() && correcto == true; i++){
					if(entrada.charAt(i) < 48 || entrada.charAt(i)>57){
						correcto = false;
					}
				}if(correcto==true) {
					arabigo = Integer.parseInt(entrada);
					if (arabigo < 5000) {
						//MILES
						mil = arabigo/1000;
						arabigo = arabigo%1000;

						if(mil==4) {
							cmil = true;
							nRomano += "IV";
						}
						else{

							for(int i = 0;i<mil;i++) {
								nRomano +="M";
							}

						}

						//FIN MILES

						//CENTENAS
						cien = arabigo/100;
						arabigo = arabigo%100;
						if (cien==9) {
							nRomano +="CM";
						}else if(cien >= 5 && cien <= 8) {
							nRomano += "D";
							for (int i =0; i<cien%5; i++) {
								nRomano += "C";
							}
						}

						if (cien == 4) {
							nRomano +="CD";
						} else if(cien >= 0 && cien <= 4) {
							for (int i = 0; i < cien; i++) {
								nRomano += "C";
							}
						}
						//FIN CENTENAS

						//DECENAS
						dec = arabigo / 10;
						arabigo = arabigo % 10;
						if(dec == 9) {
							nRomano += "XC"; 
						} else if(dec == 4) {
							nRomano += "XL";
						}
						if(dec >= 5 && dec <= 8) {
							nRomano+="L";
							for(int i = 0; i < dec%5;i++) {
								nRomano += "X";
							}
						}else if(dec> 0 && dec <=3) {
							for(int i = 0; i < dec;i++) {
								nRomano += "X";
							}
						}
						//FIN DECENAS

						//UNIDADES
						ud = arabigo;
						if(ud==9) {
							nRomano+="IX";
						}
						else if(ud ==4) {
							nRomano +="IV";
						}
						if(ud>=5 && ud<=8) {
							nRomano+="V";
							for(int i = 0;i<ud%5;i++) {
								nRomano+="I";
							}
						}
						if(ud>0 && ud<=3) {
							for(int i = 0;i<ud;i++) {
								nRomano+="I";
							}
						}
						//FIN UNIDADES
						if (cmil == true) {
							System.out.println("__");
						}
						System.out.println(nRomano);
					} else {
						System.out.println("Introduce un número menor a 5000");
					}

				} 
			}
		} while(keyExit != true);
	}
}
