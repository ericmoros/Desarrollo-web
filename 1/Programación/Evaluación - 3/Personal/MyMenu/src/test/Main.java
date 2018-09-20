package test;

public class Main {
	public static void main(String[] args) {
		MyMenu.addOption('1', "Lechuga", () -> Test.lechuga());
		MyMenu.setOptionsBuffer("1");
		MyMenu.addOption('2', "Funciona", () -> System.out.println("Funcionaaaaaaaaa!!!!!!"));
		MyMenu.setHelp('h');
		MyMenu.setDefaultNoOptions("fdfs");
		MyMenu.lauch();
	}
}