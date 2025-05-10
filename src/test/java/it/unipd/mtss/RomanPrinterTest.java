package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.*;

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

        String actual = RomanPrinter.print("I");
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

        String actual = RomanPrinter.print("IV");
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

        String actual = RomanPrinter.print("V");
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

        String actual = RomanPrinter.print("IX");
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

        String actual = RomanPrinter.print("X");
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

        String actual = RomanPrinter.print("XXXIX");
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

        String actual = RomanPrinter.print("XL");
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

        String actual = RomanPrinter.print("XLIX");
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

        String actual = RomanPrinter.print("L");
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

        String actual = RomanPrinter.print("XC");
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
                                 
        String actual = RomanPrinter.print("XCIX");
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
                                 
        String actual = RomanPrinter.print("C");
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidRomanInput() {
        RomanPrinter.print("XYZ"); // Input non valido
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