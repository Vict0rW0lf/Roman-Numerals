package romannumerals.util;

import java.util.TreeMap;

public class RomanNumeral {
	
	private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

    public final static String toRoman(int number) {
        int l =  map.floorKey(number);
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number-l);
    }
    
    public final static int toInteger(String s) {
        int num = 0;
        int left = 0;
        char prev = '0';
        while(left < s.length()) {
            char letter = s.charAt(left++);
            if (letter == 'M') {
                num += prev == 'C' ? 800 : 1000;
            } else if (letter == 'D') {
                num += prev == 'C' ? 300 : 500;
            } else if (letter == 'C') {
                num += prev == 'X' ? 80 : 100;
            } else if (letter == 'L') {
                num += prev == 'X' ? 30 : 50;
            } else if (letter == 'X') {
                num += prev == 'I' ? 8 : 10;
            } else if (letter == 'V') {
                num += prev == 'I' ? 3 : 5;
            } else if (letter == 'I') {
                num += 1;
            }
            prev = letter;
        }
        return num;
    }

}
