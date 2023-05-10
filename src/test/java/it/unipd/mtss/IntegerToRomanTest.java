package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class IntegerToRomanTest {
    static IntegerToRoman converter = null;

    @BeforeClass
    public static void initializeConverter() {
        converter = new IntegerToRoman();
    }

    @Test(expected = NumberUnderZeroException.class)
    public void testNumberUnderZero() throws NumberUnderZeroException, NumberOverThousand {
        int arabic_number = -5;
        converter.convert(arabic_number);
    }

    @Test(expected = NumberOverThousand.class)
    public void testNumberAbove999() throws NumberUnderZeroException, NumberOverThousand {
        int arabic_number = 1001;
        converter.convert(arabic_number);
    }

    @Test
    public void testZeroNumber() throws NumberUnderZeroException, NumberOverThousand {
        int arabic_number = 0;
        String roman_number = converter.convert(arabic_number);
        assertEquals(roman_number, "");
    }
}