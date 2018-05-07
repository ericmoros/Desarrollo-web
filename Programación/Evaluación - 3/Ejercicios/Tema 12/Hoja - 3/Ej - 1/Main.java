import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    	Integer totalDishes = 6;
    	ArrayList<Dish> dishes = new ArrayList<>();
    	ArrayList<String> datadishes = new ArrayList<>();
    	ArrayList<String> dataingredients = new ArrayList<>();
    	
    	datadishes = fileToStringArray("data/dishes.dat");
    	dataingredients = fileToStringArray("data/ingredients.dat");
    	dishes = generateDishes(datadishes, dataingredients, totalDishes);
    	
    	System.out.println(datadishes);
    	System.out.println(dataingredients);
    }

	/**
	 * @param datadishes
	 * @param dataingredients
	 * @param totalDishes
	 * @return
	 */
	private static ArrayList<Dish> generateDishes(ArrayList<String> datadishes, ArrayList<String> dataingredients, Integer totalDishes) {
		ArrayList<Dish> dishes = new ArrayList<>();
		Random random = new Random();
		Integer rDishPos1;
		Integer rDishPos2;
		for (Integer dishPos = 0; dishPos < totalDishes; dishPos++) {
	    	
		}
		return null;
	}

	private static ArrayList<String> fileToStringArray(String path) {
		ArrayList<String> destinyArray = null;
		File file = new File(path);
    	FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
    	BufferedReader bufferReader = new BufferedReader(streamReader);
    	bufferReader.lines().forEach(line -> destinyArray.add(line));
    	return destinyArray;
	}
}