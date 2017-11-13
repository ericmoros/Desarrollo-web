import java.util.Scanner;
public class DNI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String DNI;
		int parteNum = 0;
		String letraControl;
		Scanner teclado = new Scanner(System.in);
		char control = '0';
		String control2;
		String opcion;
		do {
			letraControl="";
			control2 ="";
			System.out.println("1) Introducir DNI");
			System.out.println("2) Salir");
			opcion = teclado.next();
			teclado.nextLine();

			if(opcion.equals("1")) {

				System.out.println("Introduce el DNI");
				DNI = teclado.nextLine();

				if (DNI.length()==9) {
					if (DNI.charAt(0) >= 48 && DNI.charAt(0) <= 57) {
						DNI.substring(0, 9);
						parteNum = Integer.parseInt(DNI.substring(0,8));
					}
					if(DNI.charAt(0)>=88 && DNI.charAt(0)<=90) {
						//parteNum= Integer.parseInt(DNI.substring(1,8));

						switch(DNI.charAt(0)) {
						case 'Y':
							parteNum= Integer.parseInt('1'+DNI.substring(1,8));
							//parteNum = parteNum + (1*(10^8));
							break;
						case 'Z':
							parteNum= Integer.parseInt('2'+DNI.substring(1,8));
							//parteNum = parteNum + (2*(10^8));
							break;
						default: break;
						}
					}
					switch(parteNum % 23 ){
					case 0:
						control='T';
						break;
					case 1:
						control='R';
						break;
					case 2:
						control='W';
						break;
					case 3:
						control='A';
						break;
					case 4:
						control='G';
						break;
					case 5:
						control='M';
						break;
					case 6:
						control='Y';
						break;
					case 7:
						control='F';
						break;
					case 8:
						control='P';
						break;
					case 9:
						control='D';
						break;
					case 10:
						control='X';
						break;
					case 11:
						control='B';
						break;
					case 12:
						control='N';
						break;
					case 13:
						control='J';
						break;
					case 14:
						control='Z';
						break;
					case 15:
						control='S';
						break;
					case 16:
						control='Q';
						break;
					case 17:
						control='V';
						break;
					case 18:
						control='H';
						break;
					case 19:
						control='L';
						break;
					case 20:
						control='C';
						break;
					case 21:
						control='K';
						break;
					case 22:
						control='E';
						break;
					}
					
					control2 += control;
					letraControl += DNI.charAt(8);
					if (letraControl.compareToIgnoreCase(control2) == 0)  {
						System.out.println("DNI Valido\n");
					} else {
						System.out.println("DNI Invalido\n");
					}

				} else{
					System.out.println("DNI incorrecto\n");
				}
			}
			
		}while(!opcion.equals("2")); 			

		teclado.close();

	}//main	

}//class
