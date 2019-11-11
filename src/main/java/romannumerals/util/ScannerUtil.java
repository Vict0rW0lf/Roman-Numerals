package romannumerals.util;

import static romannumerals.util.PrintUtil.println;

import java.util.Scanner;

public class ScannerUtil {
	
	private final static Scanner scanner = new Scanner(System.in);
	
	public static int getValidInteger() {
		while (!scanner.hasNextInt()) {
            println("Please enter a valid number!");
            scanner.next();
        }
		
		int value = scanner.nextInt();
		
		/* otherwise scanner won't work with Strings after a nextInt method call */
		scanner.nextLine();
		
		return value;
	}
	
	public static String getValidRomanNumeral() {
		String romanNumeral = scanner.nextLine().toUpperCase();
		
		while (!romanNumeral.matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$")) {
            println("Please enter a valid roman numeral!");
			romanNumeral = scanner.nextLine().toUpperCase();
		}
		
		return romanNumeral;
	}

}
