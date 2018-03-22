import java.util.Arrays;

public class PilaDinamica implements Dinamizable {
	private Integer pila[];
	private Integer cima;

	PilaDinamica(Integer tamanioInicial) {
		pila = new Integer[tamanioInicial];
		cima = 0;
	}

	public void add(Integer elemento) { // apilar un elemento
		if (cima == pila.length) { // si esta llena la ampliamos
			pila = Arrays.copyOf(pila, (pila.length + 1));
			pila[cima] = elemento;
			cima++;
		} else {
			pila[cima] = elemento;
			cima++;
		}
	}

	public Integer delete() { // desapilar un elemento
		if (cima == 0) {
			System.out.println("Pila vacía.");
			return 0;
		} else {
			cima--;
			return pila[cima];
		}
	}
}
