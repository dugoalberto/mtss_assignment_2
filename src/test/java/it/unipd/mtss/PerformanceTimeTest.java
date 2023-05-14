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
        //arrange
        int arabic_number = 50;
        String res = "L";
        //act
        String roman_number = IntegerToRoman.convert(arabic_number);
        //assert
        assertEquals(res, roman_number);
    }

    @Test()
    public void performanceTimeTestRomanPrinter()
            throws NumberUnderZeroException, NonRightCharacterException, NumberOverThousand {
        //arrange
        int arabic_number = 50;
        String res = " _      \n" +
                        "| |     \n"+
                        "| |     \n"+
                        "| |     \n"+
                        "| |____ \n"+
                        "|______|\n";
        //act
        String ascii_art_for_I = RomanPrinter.print(arabic_number);
        //assert
        assertEquals(res,ascii_art_for_I);

    }
}