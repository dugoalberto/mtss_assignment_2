package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ExtensiveIntegerToRomanTest {
    private String expectedOutput = null;
    private int input;

    public ExtensiveIntegerToRomanTest(String input, String expectedOutput) {
        this.expectedOutput = expectedOutput;
        this.input = Integer.parseInt(input);
    }

    @Parameters
    public static Collection<String[]> testProvider() {
        String[][] tests = {
                { "1", "I" },
                { "2", "II" },
                { "3", "III" },
                { "4", "IV" },
                { "5", "V" },
                { "6", "VI" },
                { "7", "VII" },
                { "8", "VIII" },
                { "9", "IX" },
                { "10", "X" },
                { "11", "XI" },
                { "12", "XII" },
                { "13", "XIII" },
                { "14", "XIV" },
                { "15", "XV" },
                { "16", "XVI" },
                { "17", "XVII" },
                { "18", "XVIII" },
                { "19", "XIX" },
                { "20", "XX" },
                { "30", "XXX" },
                { "40", "XL" },
                { "50", "L" },
                { "60", "LX" },
                { "70", "LXX" },
                { "80", "LXXX" },
                { "90", "XC" },
                { "100", "C" },
                { "200", "CC" },
                { "300", "CCC" },
                { "400", "CD" },
                { "500", "D" },
                { "600", "DC" },
                { "700", "DCC" },
                { "800", "DCCC" },
                { "900", "CM" },
                { "999", "CMXCIX" },
                { "1000", "M" },
                { "66", "LXVI" },
                { "222", "CCXXII" },
                { "376", "CCCLXXVI" },
                { "565", "DLXV" },
                { "119", "CXIX" },
                { "126", "CXXVI" },
                { "574", "DLXXIV" },
                { "444", "CDXLIV" },
                { "897", "DCCCXCVII" }
        };
        return Arrays.asList(tests);
    }

    @Test
    public void testConvertFromArabicToRoman() throws NumberUnderZeroException, NumberOverThousand {
        //arrange
        int arabic_number = input;
        //act
        String roman_number = IntegerToRoman.convert(arabic_number);
        //assert
        assertEquals(expectedOutput, roman_number);
    }
}