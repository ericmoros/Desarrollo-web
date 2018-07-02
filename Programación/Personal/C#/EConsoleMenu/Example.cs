menu.AddOption("1", "Factorial", () => Option1());
menu.AddOption("2", "Potencia", () => Option2());
menu.AddOption("3", "División", () => Option3());
menu.AddOption("4", "Invertir", () => Option4());
menu.AddOption("5", "Suma por dígito", () => Option5());
menu.AddOption("6", "Suma elemento vector", () => Option6());
menu.AddOption("7", "Multiplica elemento vector", () => Option7());
menu.AddOption("8", "Máximo común divisor", () => Option8());
menu.AddOption("9", "Menor vector", () => Option9());
menu.AddOption("10", "Mayor vector", () => Option10());
menu.AddOption("H", "Menu", (() => Console.WriteLine(menu.StringMenu)), false);
menu.AddOption("0", "Salir", () => menu.Exit());

menu.Title = "Algoritmos Recursivos – C#";

menu.AddOptionBuffer("H");
menu.UseAutoPrintStringMenu = false;

menu.ExeEConsoleMenu();