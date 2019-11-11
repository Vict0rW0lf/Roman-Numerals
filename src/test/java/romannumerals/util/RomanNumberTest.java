package romannumerals.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class RomanNumberTest {
	
	private static Stream<Arguments> dataSet() {
	    return Stream.of(
	      Arguments.of(1, "I"),
	      Arguments.of(2, "II"),
	      Arguments.of(3, "III"),
	      Arguments.of(5, "V"),
	      Arguments.of(6, "VI"),
	      Arguments.of(7, "VII"),
	      Arguments.of(8, "VIII"),
	      Arguments.of(9, "IX"),
	      Arguments.of(13, "XIII"),
	      Arguments.of(14, "XIV"),
	      Arguments.of(20, "XX"),
	      Arguments.of(39, "XXXIX"),
	      Arguments.of(79, "LXXIX"),
	      Arguments.of(90, "XC"),
	      Arguments.of(99, "XCIX"),
	      Arguments.of(100, "C"),
	      Arguments.of(200, "CC"),
	      Arguments.of(499, "CDXCIX"),
	      Arguments.of(500, "D"),
	      Arguments.of(999, "CMXCIX"),
	      Arguments.of(2999, "MMCMXCIX"),
	      Arguments.of(3999, "MMMCMXCIX")
	    );
	}
	
    @ParameterizedTest
    @MethodSource("dataSet")
    public void testToRoman(int input, String expected) {
        assertEquals(expected, RomanNumeral.toRoman(input));
    }
    
    @ParameterizedTest
    @MethodSource("dataSet")
    public void testToInteger(int expected, String input) {
        assertEquals(expected, RomanNumeral.toInteger(input));
    }

}
