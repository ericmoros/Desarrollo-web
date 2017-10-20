public class H1_Ej18 { //INCOMPLETOOOO!!!!!
	private static int result_2s[];
	private static int result_3s[];

	public static void main(String[] args) {
		int num_from = 1;
		int num_to 	 = 100;
		int counter = 0;
		result_2s = null;
		result_3s = null;
		
			
			for (int num = num_from; num_from <= num_to; num++) {
				if (num % 2 == 0) {
					result_2s[counter] = num;
				}
	
				if (num % 3 == 0) {
					result_3s[counter] = num;
				}
				
				
				counter++;
			}
			
			
				System.out.println(
							"Del " + num_from + " al " + num_to + "son multiplos de:"
				   + "\n" + " [2]:"
				   + "\n" + "    " + result_2s
				   + "\n" + " [3]:"
				   + "\n" + "    " + result_3s
						
				);
	}
}

/* TEMPORAL!!!!!
	Integer number
	Integer result_2 = 0
	Integer result_3 = 0


	Para  Integer numbers: los numeros del 1 al 100
		Si numbers % 2 == 0
			result_2 + numbers


		Si numbers % 3 == 0
			result_3 + numbers
	Para_fin


	Enviar "Estos números del 1 al 100 son multiplos de 2 " + result_2
	Enviar "Estos números del 1 al 100 son multiplos de 3 " + result_3
*/