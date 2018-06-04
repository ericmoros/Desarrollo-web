import java.io.*;
import java.util.ArrayList;

public class Fichero {
	private ObjectInputStream entrada;
	private ObjectOutputStream salida;
	private String ruta;

	public Fichero(String nombre){
		ruta = nombre;
	}

	private void abrirBufferLectura() {
		try{
			entrada=new ObjectInputStream(new FileInputStream(ruta));//asignar fichero a buffer
		}catch(IOException e){//controlar el error
			Leer.mostrarEnPantalla("Error al abrir el archivo de entrada "+e.getMessage());
			System.exit(1);
		}
	}
	
	private void abrirBufferEscritura() {
		try{
			salida=new ObjectOutputStream(new FileOutputStream(ruta));//asignar fichero a buffer
		}catch(IOException e){//controlar el error
			Leer.mostrarEnPantalla("Error al abrir el archivo de salida "+e.getMessage());
			System.exit(1);
		}
	}
	
	public ArrayList<Alumno> leerAlumno() {
		ArrayList<Alumno> alumnos;
		alumnos = new ArrayList<>();
		try {
			abrirBufferLectura();
			alumnos = (ArrayList<Alumno>) entrada.readObject();
			cerrar("I");
		}catch(IOException e){
			System.err.println("Error al leer en el archivo " + e.getMessage());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}		
		return alumnos;
	}
//	
	public void escribirAlumno(ArrayList<Alumno> alumnos) {
		try {
			abrirBufferEscritura();
			salida.writeObject(alumnos);
			cerrar("O");
		}catch(IOException e){
			System.err.println("Error al escribir en el archivo " + e.getMessage());
		}
	}
	
	private void cerrar(String io){ 
		try{
			if(io.equals("I")){//cerrar el buffer de entrada
				entrada.close();
			}
			if(io.equals("O")){//cerrar el buffer de salida
				salida.close();
			}
		}catch(IOException e){//controlar la excepción
			Leer.mostrarEnPantalla("Error al cerrar el archivo "+e.getMessage());
			System.exit(1);
		}
	}
}
