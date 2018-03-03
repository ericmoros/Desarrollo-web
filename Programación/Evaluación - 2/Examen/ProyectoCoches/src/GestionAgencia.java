public class GestionAgencia {
	public static void main(String[] args) {
		String entradaTexto = null;
		final Integer NUMCOCHE=20;
		Coche[] coches=new Coche[NUMCOCHE];
		Coche coche = null;
		
		// llamada al método para crear los coches	.
		crearCoches(coches);
		
		//No me ha dado tiempo de depurar los datos aleatorios y he dejado estos para probar 
		coches[12].setDisponible(true);
		coches[13].setDisponible(true);
		coches[13] = new Lujo("132453fcds", "Tesla", "Roadster", new Fecha(1, 1, 1999), true, 100);
		
		int opcion=4;//menu();//opción de menú
		while (opcion!=0) {//menú
			switch (opcion) {//acciones de menú
			case 1://alquilar
				//código
				alquilarCoche(entradaTexto, coches, coche);
				break;
			case 2://devolver
				//código
				devolverCoche(entradaTexto, coches, coche);
				break;
			case 3://Listar disponibles
				//código
				for (Integer actualCoche = 0; actualCoche < coches.length; actualCoche++) {
					if (coches[actualCoche].getDisponible()) {
						Leer.mostrarEnPantalla(coches[actualCoche].cadenaCoche());
					}
				}
				break;
			case 4://Listar ocupados
				//código
				for (Integer actualCoche = 0; actualCoche < coches.length; actualCoche++) {
					if (! coches[actualCoche].getDisponible()) {
						Leer.mostrarEnPantalla(coches[actualCoche].cadenaCoche());
					}
				}
			}
			opcion = menu();
		} 
	}

	private static void devolverCoche(String entradaTexto, Coche[] coches, Coche coche) {
		Integer numeroCoche;
		entradaTexto = "" + Leer.pedirEntero("Número del coche a devolver");
		numeroCoche = Integer.parseInt(entradaTexto);
		coche = coches[numeroCoche];
		if (! coche.getDisponible()) {
			coche.setDisponible(true);
			Leer.mostrarEnPantalla("Coche " + numeroCoche + "(" + coche.getMatricula() + ")" + " devuelto");					
		} else {
			Leer.mostrarEnPantalla("El coche " + numeroCoche + "(" + coche.getMatricula() + ")" + " Ya estaba disponible");
		}
	}

	private static void alquilarCoche(String entradaTexto, Coche[] coches, Coche coche) {
		Character valor = 'x';
		while (valor != 'N' && valor != 'L') {					
			entradaTexto = Leer.pedirCadena("¿Desea un coche normal o de lujo? (N/L)");
			
			if (entradaTexto.equalsIgnoreCase("N")) {
				Leer.mostrarEnPantalla(entradaTexto);
				valor = 'N';
				
			} else if (entradaTexto.equalsIgnoreCase("L")) {
				Leer.mostrarEnPantalla(entradaTexto);
				valor = 'L';
				
			} else {
				Leer.mostrarEnPantalla("[ERROR] el valor \"" + entradaTexto + "\" no está definido"
									 + "\n   Se esperaba   'N'   o   'L'");
			}
		}
		
		if (valor == 'N') {
			for (Integer actualCoche = 0; actualCoche < coches.length; actualCoche++) {
				if (coches[actualCoche] instanceof Normal) {
					if (coches[actualCoche].getDisponible()) {
						Leer.mostrarEnPantalla("Coche " + actualCoche + " ocupado");
						coche = coches[actualCoche];
						coche.setDisponible(false);
						break;
					}
				}
			}			
		} else {
			for (Integer actualCoche = 0; actualCoche < coches.length; actualCoche++) {
				if (coches[actualCoche] instanceof Lujo) {
					if (coches[actualCoche].getDisponible()) {
						Leer.mostrarEnPantalla("Coche " + actualCoche + " ocupado");
						coche = coches[actualCoche];
						coche.setDisponible(false);
						break;
					}
				}
			}			
		}
		
	}

	private static void crearCoches(Coche[] coches) {
		String matricula;
		Integer matriculaLong = 6;
		String marca = "Tesla";
		String modelo;
		Integer modeloLong = 10;
		Fecha fechaFabricacion = new Fecha(1, 1, 1985);
		Boolean disponible;
		Integer precioDiario = 30;
		String parking;
		
		for (Integer actualCoche = 0; actualCoche < coches.length; actualCoche++) {
			matricula = "";
			for (Integer actualChar = 0; actualChar < matriculaLong; actualChar++) {
				matricula += (char) (Math.random() * 200);
			}
			
			modelo = "";
			for (Integer actualChar = 0; actualChar < modeloLong; actualChar++) {
				modelo += (char) (Math.random() * 200);
			}
			
			if (((int) Math.random() * 10) > 5) {
				disponible = true;
			} else {
				disponible = false;
			}
			
			if (((int) Math.random() * 10) == 5) {
				coches[actualCoche] = new Lujo(matricula, marca, modelo, fechaFabricacion, disponible, precioDiario);
			} else {
				if (((int) Math.random() * 10) == 5) {
					parking = "Aparcamiento del Ebro";
				} else if (((int) Math.random() * 10) > 5) {
					parking = "Iber Park";
				} else {
					parking = "Aragonia";
				}
				
				coches[actualCoche] = new Normal(matricula, marca, modelo, fechaFabricacion, disponible, precioDiario, parking);
			}
		}
	}

	public static int menu(){
		int opcion;
		Leer.mostrarEnPantalla("1.- Alquilar coche");
		Leer.mostrarEnPantalla("2.- Devolver coche");
		Leer.mostrarEnPantalla("3.- Listado de coches disponibles");
		Leer.mostrarEnPantalla("4.- Listado de coches ocupados");
		Leer.mostrarEnPantalla("0.- Salir");
		opcion=1;//////////
		return opcion;
	}
}
