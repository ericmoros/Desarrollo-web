import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
    	Integer totalDishes = 6;
    	ArrayList<Dish> dishes = new ArrayList<>();
    	ArrayList<Dish> dishes2 = new ArrayList<>();
    	ArrayList<ArrayList<String>> dataLists = new ArrayList<>();
    	ArrayList<String> dataRows = new ArrayList<>();
    	
    	dataRows = getFileLines("data/dishes.dat");
    	dataLists = getCSVStyle(dataRows, ";");
    	dishes = getDishesFromLists(dataLists);
    	
    	dataRows = getFileLines("data/dishes2.dat");
    	dataLists = getCSVStyle(dataRows, ";");
    	dishes2 = getDishesFromLists(dataLists);
    	
    	
    	System.out.println(dishes);
    	System.out.println(dishes2);
    	
    }

	/**
	 * @param dishesLists
	 * @return
	 */
	private static ArrayList<Dish> getDishesFromLists(ArrayList<ArrayList<String>> dishesLists) {
		ArrayList<Dish> dishes = new ArrayList<>();
		Dish dish;
		for (ArrayList<String> dishData : dishesLists) {
			dish = new Dish();
			dish.setName(dishData.get(0));
			for (Integer ingredientPos = 1; ingredientPos < dishData.size(); ingredientPos++) {
				dish.getIngredients().add(dishData.get(ingredientPos));
			}
			dishes.add(dish);
		}
		return dishes;
	}

	/**
	 * @param dataLines
	 * @param dataLines
	 * @param totalDishes
	 * @return
	 */
	private static ArrayList<ArrayList<String>> getCSVStyle(ArrayList<String> dataLines, String delimiter) {
		ArrayList<ArrayList<String>> data = new ArrayList<>();
		for (String str : dataLines) {
			ArrayList<String> row = new ArrayList<String>(Arrays.asList(str.split("\\" + delimiter)));
			data.add(row);
		}
		
		return data;
	}

	private static ArrayList<String> getFileLines(String path) {
		ArrayList<String> destinyArray = new ArrayList<>();
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