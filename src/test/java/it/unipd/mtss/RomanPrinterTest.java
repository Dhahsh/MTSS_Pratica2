package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {

    @Test                                               //Test per 1
    public void testAsciiArtI() {
        String expected = 
                " _____  \n" +
                "|_   _| \n" +
                "  | |   \n" +
                "  | |   \n" +
                " _| |_  \n" +
                "|_____| \n";

        String actual = RomanPrinter.print(1);
        assertEquals(expected, actual);
    }

    @Test                                               //Test per 4
    public void testAsciiArtIV() {
        String expected = 
                " _____  __      __ \n" +
                "|_   _| \\ \\    / / \n" +
                "  | |    \\ \\  / /  \n" +
                "  | |     \\ \\/ /   \n" +
                " _| |_     \\  /    \n" +
                "|_____|     \\/     \n";

        String actual = RomanPrinter.print(4);
        assertEquals(expected, actual);
    }

    @Test                                               //Test per 5
    public void testAsciiArtV() {
        String expected = 
                "__      __ \n" +
                "\\ \\    / / \n" +
                " \\ \\  / /  \n" +
                "  \\ \\/ /   \n" +
                "   \\  /    \n" +
                "    \\/     \n";

        String actual = RomanPrinter.print(5);
        assertEquals(expected, actual);
    }

    @Test                                               //Test per 9
    public void testAsciiArtIX() {
        String expected = 
                " _____  __   __ \n" +
                "|_   _| \\ \\ / / \n" +
                "  | |    \\ V /  \n" +
                "  | |     > <   \n" +
                " _| |_   / . \\  \n" +
                "|_____| /_/ \\_\\ \n";

        String actual = RomanPrinter.print(9);
        assertEquals(expected, actual);
    }

    @Test                                               //Test per 10
    public void testAsciiArtX() {
        String expected = 
                "__   __ \n" +
                "\\ \\ / / \n" +
                " \\ V /  \n" +
                "  > <   \n" +
                " / . \\  \n" +
                "/_/ \\_\\ \n";

        String actual = RomanPrinter.print(10);
        assertEquals(expected, actual);
    }

    @Test                                               //Test per 39
    public void testAsciiArtXXXIX() {
        String expected = 
                "__   __ __   __ __   __  _____  __   __ \n" +
                "\\ \\ / / \\ \\ / / \\ \\ / / |_   _| \\ \\ / / \n" +
                " \\ V /   \\ V /   \\ V /    | |    \\ V /  \n" +
                "  > <     > <     > <     | |     > <   \n" +
                " / . \\   / . \\   / . \\   _| |_   / . \\  \n" +
                "/_/ \\_\\ /_/ \\_\\ /_/ \\_\\ |_____| /_/ \\_\\ \n";

        String actual = RomanPrinter.print(39);
        assertEquals(expected, actual);
    }

    @Test                                               //Test per 40
    public void testAsciiArtXL() {
        String expected = 
                "__   __  _       \n" +
                "\\ \\ / / | |      \n" +
                " \\ V /  | |      \n" +
                "  > <   | |      \n" +
                " / . \\  | |____  \n" +
                "/_/ \\_\\ |______| \n";

        String actual = RomanPrinter.print(40);
        assertEquals(expected, actual);
    }

    @Test                                               //Test per 49
    public void testAsciiArtXLIX() {
        String expected = 
                "__   __  _        _____  __   __ \n" +
                "\\ \\ / / | |      |_   _| \\ \\ / / \n" +
                " \\ V /  | |        | |    \\ V /  \n" +
                "  > <   | |        | |     > <   \n" +
                " / . \\  | |____   _| |_   / . \\  \n" +
                "/_/ \\_\\ |______| |_____| /_/ \\_\\ \n";

        String actual = RomanPrinter.print(49);
        assertEquals(expected, actual);
    }

    @Test                                               //Test per 50
    public void testAsciiArtL() {
        String expected = 
                " _       \n" +
                "| |      \n" +
                "| |      \n" +
                "| |      \n" +
                "| |____  \n" +
                "|______| \n";

        String actual = RomanPrinter.print(50);
        assertEquals(expected, actual);
    }

    @Test                                               //Test per 90
    public void testAsciiArtXC() {
        String expected = 
                "__   __   _____  \n" +
                "\\ \\ / /  / ____| \n" +
                " \\ V /  | |      \n" +
                "  > <   | |      \n" +
                " / . \\  | |____  \n" +
                "/_/ \\_\\  \\_____| \n";

        String actual = RomanPrinter.print(90);
        assertEquals(expected, actual);
    }

    @Test                                               //Test per 99
    public void testAsciiArtXCIX() {
        String expected = 
                "__   __   _____   _____  __   __ \n" +
                "\\ \\ / /  / ____| |_   _| \\ \\ / / \n" +
                " \\ V /  | |        | |    \\ V /  \n" +
                "  > <   | |        | |     > <   \n" +
                " / . \\  | |____   _| |_   / . \\  \n" +
                "/_/ \\_\\  \\_____| |_____| /_/ \\_\\ \n";
                                 
        String actual = RomanPrinter.print(99);
        assertEquals(expected, actual);
    }

    @Test                                               //Test per 100
    public void testAsciiArtC() {
        String expected = 
                "  _____  \n" +
                " / ____| \n" +
                "| |      \n" +
                "| |      \n" +
                "| |____  \n" +
                " \\_____| \n";
                                 
        String actual = RomanPrinter.print(100);
        assertEquals(expected, actual);
    }
    
    @Test                                               //Test per 400
    public void testAsciiArtCD() {
        String expected = 
                "  _____   _____   \n" +
                " / ____| |  __ \\  \n" +
                "| |      | |  | | \n" +
                "| |      | |  | | \n" +
                "| |____  | |__| | \n" +
                " \\_____| |_____/  \n";
                                 
        String actual = RomanPrinter.print(400);
        assertEquals(expected, actual);
    }
    
    @Test                                               //Test per 449
    public void testAsciiArtCDXLIX() {
        String expected = 
                "  _____   _____   __   __  _        _____  __   __ \n" +
                " / ____| |  __ \\  \\ \\ / / | |      |_   _| \\ \\ / / \n" +
                "| |      | |  | |  \\ V /  | |        | |    \\ V /  \n" +
                "| |      | |  | |   > <   | |        | |     > <   \n" +
                "| |____  | |__| |  / . \\  | |____   _| |_   / . \\  \n" +
                " \\_____| |_____/  /_/ \\_\\ |______| |_____| /_/ \\_\\ \n";
                                 
        String actual = RomanPrinter.print(449);
        assertEquals(expected, actual);
    }
    
    @Test                                               //Test per 500
    public void testAsciiArtD() {
        String expected = 
                " _____   \n" +
                "|  __ \\  \n" +
                "| |  | | \n" +
                "| |  | | \n" +
                "| |__| | \n" +
                "|_____/  \n";
                                 
        String actual = RomanPrinter.print(500);
        assertEquals(expected, actual);
    }
    
    @Test                                               //Test per 893
    public void testAsciiArtDCCCXCIII() {
        String expected = 
                " _____     _____    _____    _____  __   __   _____   _____   _____   _____  \n" +
                "|  __ \\   / ____|  / ____|  / ____| \\ \\ / /  / ____| |_   _| |_   _| |_   _| \n" +
                "| |  | | | |      | |      | |       \\ V /  | |        | |     | |     | |   \n" +
                "| |  | | | |      | |      | |        > <   | |        | |     | |     | |   \n" +
                "| |__| | | |____  | |____  | |____   / . \\  | |____   _| |_   _| |_   _| |_  \n" +
                "|_____/   \\_____|  \\_____|  \\_____| /_/ \\_\\  \\_____| |_____| |_____| |_____| \n";
                                 
        String actual = RomanPrinter.print(893);
        assertEquals(expected, actual);
    }
    
    @Test                                               //Test per 900
    public void testAsciiArtCM() {
        String expected = 
                "  _____   __  __  \n" +
                " / ____| |  \\/  | \n" +
                "| |      | \\  / | \n" +
                "| |      | |\\/| | \n" +
                "| |____  | |  | | \n" +
                " \\_____| |_|  |_| \n";
                                 
        String actual = RomanPrinter.print(900);
        assertEquals(expected, actual);
    }
    
    @Test                                               //Test per 1000
    public void testAsciiArtM() {
        String expected = 
                " __  __  \n" +
                "|  \\/  | \n" +
                "| \\  / | \n" +
                "| |\\/| | \n" +
                "| |  | | \n" +
                "|_|  |_| \n";
                                 
        String actual = RomanPrinter.print(1000);
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidRomanInput() {
        RomanPrinter.print(1001); // Input non valido
    }
}
/*
  _____  __      __ __   __  _         _____   _____    __  __ 
 |_   _| \ \    / / \ \ / / | |       / ____| |  __ \  |  \/  |
   | |    \ \  / /   \ V /  | |      | |      | |  | | | \  / |
   | |     \ \/ /     > <   | |      | |      | |  | | | |\/| |
  _| |_     \  /     / . \  | |____  | |____  | |__| | | |  | |
 |_____|     \/     /_/ \_\ |______|  \_____| |_____/  |_|  |_|
                                                                      
*/