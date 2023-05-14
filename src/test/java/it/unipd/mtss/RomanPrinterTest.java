package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class RomanPrinterTest {
    static RomanPrinter printer;

    @BeforeClass
    public static void initializePrinter() {
        printer = new RomanPrinter();
    }

    @Test
    public void testPrintI() throws NumberUnderZeroException, NumberOverThousand, NonRightCharacterException {
        //arrange
        int arabic_number = 1;
        String res = " _____ \n" +
        "|_   _|\n" +
        "  | |  \n" +
        "  | |  \n" +
        " _| |_ \n" +
        "|_____|\n";
        //act
        String ascii_art_for_I = printer.print(arabic_number);
        //assert
        assertEquals(res, ascii_art_for_I);
    }

    @Test
    public void testPrintV() throws NumberUnderZeroException, NumberOverThousand, NonRightCharacterException {
        //arrange
        int arabic_number = 5;
        String res = "__      __\n" +
                    "\\ \\    / /\n" +
                    " \\ \\  / / \n" +
                    "  \\ \\/ /  \n" +
                    "   \\  /   \n" +
                    "    \\/    \n";
        //act
        String ascii_art_for_V = printer.print(arabic_number);
        //assert
        assertEquals(res, ascii_art_for_V);

    }

    @Test
    public void testPrintX() throws NumberUnderZeroException, NumberOverThousand, NonRightCharacterException {
        //arrange
        int arabic_number = 10;
        String res = "__   __\n" +
        "\\ \\ / /\n" +
        " \\ V / \n" +
        "  > <  \n" +
        " / . \\ \n" +
        "/_/ \\_\\\n";
        //act
        String ascii_art_for_X = printer.print(arabic_number);
        //assert
        assertEquals(res, ascii_art_for_X);

    }

    @Test
    public void testPrintL() throws NumberUnderZeroException, NumberOverThousand, NonRightCharacterException {
        //arrange
        int arabic_number = 50;
        String res = " _      \n" +
        "| |     \n" +
        "| |     \n" +
        "| |     \n" +
        "| |____ \n" +
        "|______|\n";
        //act
        String ascii_art_for_L = printer.print(arabic_number);
        //assert
        assertEquals(res , ascii_art_for_L);

    }

    @Test
    public void testPrintC() throws NumberUnderZeroException, NumberOverThousand, NonRightCharacterException {
        //arrange
        int arabic_number = 100;
        String res = "  _____ \n" +
        " / ____|\n" +
        "| |     \n" +
        "| |     \n" +
        "| |____ \n" +
        " \\_____|\n";
        //act
        String ascii_art_for_C = printer.print(arabic_number);
        //assert
        assertEquals(res, ascii_art_for_C);

    }

    @Test
    public void testPrintD() throws NumberUnderZeroException, NumberOverThousand, NonRightCharacterException {
        //arrange
        int arabic_number = 500;
        String res = " _____  \n" +
        "|  __ \\ \n" +
        "| |  | |\n" +
        "| |  | |\n" +
        "| |__| |\n" +
        "|_____/ \n";
        //act
        String ascii_art_for_D = printer.print(arabic_number);
        //assert
        assertEquals(res , ascii_art_for_D );

    }

    @Test
    public void testPrintM() throws NumberUnderZeroException, NumberOverThousand, NonRightCharacterException {
        //arrange
        int arabic_number = 1000;
        String res = " __  __ \n" +
        "|  \\/  |\n" +
        "| \\  / |\n" +
        "| |\\/| |\n" +
        "| |  | |\n" +
        "|_|  |_|\n";
        //act
        String ascii_art_for_M = printer.print(arabic_number);
        //assert
        assertEquals(res,ascii_art_for_M );

    }

    @Test
    public void testNumberZeroAsciiArt()
            throws NumberUnderZeroException, NumberOverThousand, NonRightCharacterException {
        //Arrange
        int arabic_number = 0;
        String res = "";
        //act
        String ascii_art_for_zero = printer.print(arabic_number);
        //assert
        assertEquals(ascii_art_for_zero, res);
    }

    @Test
    public void testLettersCombination511()
            throws NumberUnderZeroException, NumberOverThousand, NonRightCharacterException {
        //Arrange
        int arabic_number = 11;
        String art11_res  = ( "__   __" +     " _____ \n" +
                            "\\ \\ / /" +   "|_   _|\n" +
                            " \\ V / " +    "  | |  \n" +
                            "  > <  " +     "  | |  \n" +
                            " / . \\ " +    " _| |_ \n" +
                            "/_/ \\_\\"+    "|_____|\n");
        //act
        String ascii_art_for_11 = printer.print(arabic_number);
        //assert
        assertEquals(art11_res, ascii_art_for_11);
        //assertEquals(ascii_art_for_11, art11_res);
    }

    @Test
    public void testLettersCombination56()
            throws NumberUnderZeroException, NumberOverThousand, NonRightCharacterException {
        //arrange
        int arabic_number = 126;
        String art126_res = "  _____ " +  "__   __" +    "__   __" +     "__      __" +     " _____ \n"+
                            " / ____|"+  "\\ \\ / /" +    "\\ \\ / /" + "\\ \\    / /" +   "|_   _|\n" +
                            "| |     " +  " \\ V / " +   " \\ V / " +    " \\ \\  / / " +   "  | |  \n" +
                            "| |     " +  "  > <  " +    "  > <  " +     "  \\ \\/ /  " +   "  | |  \n" +
                            "| |____ " +  " / . \\ " +   " / . \\ " +    "   \\  /   " +    " _| |_ \n" +
                            " \\_____|" + "/_/ \\_\\" + "/_/ \\_\\" +    "    \\/    "+     "|_____|\n";
        //act
        String ascii_art_for_126 = printer.print(arabic_number);
        //assert
        assertEquals(art126_res, ascii_art_for_126);
    }

    @Test(expected = NullPointerException.class)
    public void testNullInsertion() throws NumberUnderZeroException, NumberOverThousand, NonRightCharacterException {
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> IntegerToRoman.convert(0)).thenReturn(null);
            printer.print(0);
        }
    }
    @Test(expected = NonRightCharacterException.class)
    public void testNonRightCharacters()
            throws NumberUnderZeroException, NumberOverThousand, NonRightCharacterException {
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> IntegerToRoman.convert(0)).thenReturn("PROVA");
            printer.print(0);
        }
    }
    
}