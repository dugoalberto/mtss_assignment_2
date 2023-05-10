package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PerformanceTimeTest {
    @Rule
    public Timeout timer = new Timeout(10);

    @Test
    public void performanceTimeTestIntegerToRoman()
            throws NumberUnderZeroException, NumberOverThousand, NonRightCharacterException {
        int arabic_number = 50;
        String roman_number = IntegerToRoman.convert(arabic_number);
        assertEquals("L", roman_number);
    }

    @Test()
    public void performanceTimeTestRomanPrinter()
            throws NumberUnderZeroException, NonRightCharacterException, NumberOverThousand {
        String ascii_art_for_I = RomanPrinter.print(50);
        assertEquals(ascii_art_for_I,
                new String( " _      \n" +
                            "| |     \n"+
                            "| |     \n"+
                            "| |     \n"+
                            "| |____ \n"+
                            "|______|\n"
                ));

    }
}