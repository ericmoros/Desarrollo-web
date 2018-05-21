import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class FicheroTexto {
	private String path;
	private String delimiter;

	public FicheroTexto(String path, String delimiter) {
		this.path = path;
		this.delimiter = delimiter;
	}

	private ArrayList<String> getFileLines() {
		ArrayList<String> destinyArray = new ArrayList<>();
		File file = new File(path);
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
		BufferedReader bufferReader = new BufferedReader(streamReader);
		
		bufferReader.lines().forEach(line -> destinyArray.add(line));
		return destinyArray;
	}
	
//	private ArrayList<String> writePersonas() { NO DA TIEMPO
//		ArrayList<String> destinyArray = new ArrayList<>();
//		File file = new File(path);
//		FileOutputStream inputStream = null;
//		try {
//			inputStream = new FileOutputStream(file);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
//		BufferedReader bufferReader = new BufferedReader(streamReader);
//		
//		bufferReader.lines().forEach(line -> destinyArray.add(line));
//		return destinyArray;
//	}

	private ArrayList<ArrayList<String>> getCSVStyle() {
		ArrayList<String> dataLines = getFileLines();
		ArrayList<ArrayList<String>> data = new ArrayList<>();
		for (String str : dataLines) {
			ArrayList<String> row = new ArrayList<String>(Arrays.asList(str.split("\\" + delimiter)));
			data.add(row);
		}

		return data;
	}
	
	public ArrayList<Persona> getPersonas() {
		ArrayList<ArrayList<String>> data = getCSVStyle();
		ArrayList<Persona> personas = new ArrayList<>();
		Integer personaTipo = null;
		//Persona
		Persona persona = null;
		String nombre = null;
		String apellido = null;
		//Estudiante
		Estudiante estudiante = null;
		String estudios = null;
		Integer curso = null;
		//Trabajador
		Persona trabajador = null;
		String categoria = null;
		Float sueldo = null;
		
		for (ArrayList<String> row : data) {
				personaTipo = Integer.parseInt(row.get(0));
				nombre = row.get(1);
				apellido = row.get(2);
				if(personaTipo == 1) {
					estudios = row.get(3);
					curso = Integer.parseInt(row.get(4));
					estudiante = new Estudiante(nombre, apellido, estudios, curso);
					personas.add(estudiante);
				} else if (personaTipo == 2) {
					categoria = row.get(3);
					sueldo = Float.parseFloat(row.get(4));
					trabajador = new Trabajador(nombre, apellido, categoria, sueldo);
					personas.add(trabajador);
				} else {
					persona = new Persona(nombre, apellido);					
					personas.add(persona);
				}
				
				
		}
		return personas;
	}
}