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