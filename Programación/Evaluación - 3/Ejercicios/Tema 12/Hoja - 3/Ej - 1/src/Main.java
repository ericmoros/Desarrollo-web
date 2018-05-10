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
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) {
		ArrayList<ArrayList<Dish>> menus = new ArrayList<>();
		ArrayList<Dish> dishes1 = new ArrayList<>();
		ArrayList<Dish> dishes2 = new ArrayList<>();
		Integer totalMenus = 3;

		String options = "1";
		Boolean exit = false;

		while (true) {
			loadDishes(dishes1, dishes2);
			for (Character option : options.toCharArray()) {
				switch (option) {
					case '1':
						Leer.mostrarEnPantalla("_ Menu ________________(0-Salir)__\n"
											 + " 1 - Mostrar menu\n"
											 + " 2 - Mostrar platos\n"
											 + " 3 - Mostrar cartas\n"
											 + " 4 - Añadir platos\n"
											 + " 5 - Generar cartas\n"
											 + "__________________________________\n");
						break;
					case '2':
						showDishes(dishes1, dishes2);
						break;
					case '3':
						showMenu(menus);
						break;
					case '4':
						//modifyUserPassword(usrPassList);
						break;
					case '5':
						menus = generateMenus(totalMenus, dishes1, dishes2);
						break;
					case '6':
						//login(usrPassList);
						break;
					case '0':
						exit = true;
						break;
					default:
						options += '1';
				}

			}
			
			if (exit) break;

			options = Leer.pedirCadena("Introduce una o varias opciones");
			
		}
		
		Leer.mostrarEnPantalla("Nos vemooos! :D");
		try {
			TimeUnit.MILLISECONDS.sleep(750);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.err.println("{Fin de programa}");
	}

	private static void showDishes(ArrayList<Dish> dishes1, ArrayList<Dish> dishes2) {
		System.out.println("[Platos]");
						System.out.println("+----------+");
						System.out.println("| Primeros |");
						System.out.println("+----------+");
						printDish(dishes1);
						
						System.out.println("+----------+");
						System.out.println("| Segundos |");
						System.out.println("+----------+");
						printDish(dishes2);
	}

	private static void printDish(ArrayList<Dish> dishes) {
		for (Dish dish : dishes) {
			System.out.println(dish.getName());
			System.out.println("\t"+ dish.getIngredients());
		}
	}

	public static void loadDishes(ArrayList<Dish> dishes, ArrayList<Dish> dishes2) {
		ArrayList<ArrayList<String>> dataLists = new ArrayList<>();
		ArrayList<String> dataRows = new ArrayList<>();
		ArrayList<Dish> tmpDishes = new ArrayList<>();
		
		dataRows = getFileLines("data/dishes.dat");
		dataLists = getCSVStyle(dataRows, ";");
		tmpDishes = getDishesFromLists(dataLists);
		for (Dish dish : tmpDishes) {
			dishes.add(dish);
		}

		tmpDishes.clear();

		dataRows = getFileLines("data/dishes2.dat");
		dataLists = getCSVStyle(dataRows, ";");
		tmpDishes = getDishesFromLists(dataLists);
		for (Dish dish : tmpDishes) {
			dishes2.add(dish);
		}
	}

	private static ArrayList<ArrayList<Dish>> generateMenus(Integer totalMenus, ArrayList<Dish> dishes, ArrayList<Dish> dishes2) {
		ArrayList<ArrayList<Dish>> menus = new ArrayList<>();
		ArrayList<Dish> menu;
		Random random = new Random();
		for (Integer menuPos = 0; menuPos < totalMenus; menuPos++) {
			menu = new ArrayList<>();
			menu.add(dishes.get(random.nextInt(dishes.size())));
			menu.add(dishes2.get(random.nextInt(dishes2.size())));
			menus.add(menu);
		}
		return menus;
	}

	/**
	 * @param dishesLists
	 * @return
	 */
	private static ArrayList<Dish> getDishesFromLists(ArrayList<ArrayList<String>> dishesLists) {
		ArrayList<Dish> dishes = new ArrayList<>();
		ArrayList<String> ingredients;
		Dish dish;
		for (ArrayList<String> dishData : dishesLists) {
			dish = new Dish();
			ingredients = new ArrayList<>();
			dish.setName(dishData.get(0));
			for (Integer ingredientPos = 1; ingredientPos < dishData.size(); ingredientPos++) {
				ingredients.add(dishData.get(ingredientPos));
			}
			dish.setIngredients(ingredients);
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
			e.printStackTrace();
		}
		InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
		BufferedReader bufferReader = new BufferedReader(streamReader);
		bufferReader.lines().forEach(line -> destinyArray.add(line));
		return destinyArray;
	}

	private static void showMenu(ArrayList<ArrayList<Dish>> menus) {
		Integer menuCount = 1;
		for (ArrayList<Dish> menu : menus) {
			System.out.println("Menu" + menuCount);
			printDish(menu);
			menuCount++;
		}
	}
}