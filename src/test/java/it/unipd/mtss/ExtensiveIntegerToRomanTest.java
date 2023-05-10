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
                { "974", "CMLXXIV" },
                { "150", "CL" },
                { "516", "DXVI" },
                { "398", "CCCXCVIII" },
                { "404", "CDIV" },
                { "37", "XXXVII" },
                { "18", "XVIII" },
                { "256", "CCLVI" },
                { "887", "DCCCLXXXVII" },
                { "116", "CXVI" },
                { "44", "XLIV" },
                { "678", "DCLXXVIII" },
                { "939", "CMXXXIX" },
                { "412", "CDXII" },
                { "213", "CCXIII" },
                { "24", "XXIV" },
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
                { "492", "CDXCII" },
                { "399", "CCCXCIX" },
                { "87", "LXXXVII" },
                { "957", "CMLVII" },
                { "146", "CXLVI" },
                { "329", "CCCXXIX" },
                { "574", "DLXXIV" },
                { "681", "DCLXXXI" },
                { "897", "DCCCXCVII" }
        };
        return Arrays.asList(tests);
    }

    @Test
    public void testConvertFromArabicToRoman() throws NumberUnderZeroException, NumberOverThousand {
        int arabic_number = input;
        String roman_number = IntegerToRoman.convert(arabic_number);
        assertEquals(expectedOutput, roman_number);
    }
}