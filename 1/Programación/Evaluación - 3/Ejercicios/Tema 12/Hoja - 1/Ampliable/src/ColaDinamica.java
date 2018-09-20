import java.util.Arrays;

public class ColaDinamica implements Dinamizable {
	private Integer cola[];
	private Integer ultimo;

	ColaDinamica(Integer tamanioMax) {
		cola = new Integer[tamanioMax];
		ultimo = 0;
	}

	public void add(Integer elemento) { // apilar un elemento
		if (ultimo == cola.length) {
			System.out.println("La pila esta llena.");
		} else {
			cola[ultimo] = elemento;
			ultimo++;
		}
	}

	public Integer delete() { // desapilar un elemento
		if (ultimo == 0) {
			System.out.println("Pila vacía.");
			return 0;
		} else {
			ultimo--;
			Integer tmp = cola[0];
			cola = Arrays.copyOfRange(cola, 1, cola.length);
			return tmp;
		}
	}
	
	@Override
	public String toString() {
		String str = "";
		
		for (Integer actualNodo = 0; actualNodo < cola.length; actualNodo++) {
			try {				
				str += cola[actualNodo].toString() + ';';
			} catch (Exception e) {
				break;
			}
		}
		return str;
		
	}
}
