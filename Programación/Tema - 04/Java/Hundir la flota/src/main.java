public class main {
	public static void main(String[] args) {
		
		final String cornerUpLeft = "╔";
		final String cornerUpRight = "╗";
		final String cornerDownLeft = "╚";
		final String cornerDownRight = "╝";
		
		final String sideX = "═";
		final String sideY = "║";
		
		final String insideUp = "╦";
		final String insideDown = "╩";
		final String insideLeft = "╠";
		final String insideRight = "╣";
		
		
		System.out.println(cornerUpLeft + sideX + sideX + sideX + insideUp);
		System.out.println(sideY + " X " + sideY);
		System.out.println(cornerDownLeft + sideX + sideX + sideX + cornerDownRight);
	}
}
