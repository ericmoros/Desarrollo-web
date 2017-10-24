import java.util.*;
public class H4_Ej2 {
	public static void main(String[] args){		
		final int MAX_LONGITUD = 80;
		int contaMay, contaMin,k;
		String frase;
		Scanner teclado = new Scanner(System.in);
		int linea, numLetras;
		do{
			System.out.println("Frase de " + MAX_LONGITUD + " caracteres como máximo");
			frase = teclado.nextLine();
		}while(frase.length() > MAX_LONGITUD);
		contaMay = contaMin = 0;
		for(k=0; k < frase.length(); k++){
			if(frase.charAt(k) >= 97 && frase.charAt(k) <= 122){
				contaMin++;
			}else if(frase.charAt(k) >= 'A' && frase.charAt(k) <= 'Z'){
				contaMay++;
			}
		}
		System.out.println(frase + "\ntiene " + contaMay + " mayuscula(s) " + contaMin + " minusculas");
	}//main
}//class