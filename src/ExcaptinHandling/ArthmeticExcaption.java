package ExcaptinHandling;

public class ArthmeticExcaption {

	public static void main(String[] args) {
		//nullException();
		//arthmeticExcaption();
		arrayExcaption();
	}

	public static void arrayExcaption() {
		int[] table = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

		System.out.println(table[15]);

	}

	public static void nullException() {
		String Name = "fardin";
		// String Name=null;
		int FardinLength = Name.length();
		char chathaChar = Name.charAt(6);

		System.out.println("Length of name is " + FardinLength);

		System.out.println(" 7th Carachater of name is " + chathaChar);

	}

	public static void arthmeticExcaption() {
		int div = 0;
		int no = 15;
		int clac = 0;

		clac = no / div;
		System.out.println("Calc " + clac);

	}

}
