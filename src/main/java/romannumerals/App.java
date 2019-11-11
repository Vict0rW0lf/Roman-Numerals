package romannumerals;

import romannumerals.util.RomanNumeral;
import java.util.Scanner; 
import static romannumerals.util.PrintUtil.*;

public class App {

	public static void start() {

		boolean keepConverting = true;
		
		println("Welcome to Roman Numerals conversions!");
		
		while (keepConverting == true) {
			
			println("What would you like to do?");
			println("1. Convert integer value to roman numeral.");
			println("2. Convert roman numeral to an integer value.");
			println("3. Exit program.");
			
			int option = getValidInteger();
			
			switch(option) {
				case 1:
					println("Type an integer");
					println("Result: " + RomanNumeral.toRoman(getValidInteger()));
				break;
				case 2:
					println("Type a roman numeral");
					println("Result: " + RomanNumeral.toInteger(getValidRomanNumeral()));
				break;
				case 3:
					keepConverting = false;
				break;
				default:
					println("That option doesn't exist!");
			}
		}
	}
	
}
