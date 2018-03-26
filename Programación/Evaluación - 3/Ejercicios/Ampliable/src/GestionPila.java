
public class GestionPila {
	public static void main(String args[]) {
		ColaDinamica cola = new ColaDinamica(10);

		for (Integer i = 0; i < 8; i++)
			cola.add(i);
		System.out.println("Nodos añadidos");
		System.out.println(cola.toString() + "\n");

		cola.delete();
		
		System.out.println("cola actual");
		System.out.println(cola.toString());

	}// main
}
