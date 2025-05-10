////////////////////////////////////////////////////////////////////
// Riccardo     Contesso    2101053
// Zhong Xing   Qiu         2111035
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.HashMap;
import java.util.Map;

public class RomanPrinter {
    // rappresentazione in asciiart di ogni carattere in numero romano
    private static final String[] I_ART = {
        " _____ ",
        "|_   _|",
        "  | |  ",
        "  | |  ",
        " _| |_ ",
        "|_____|"
    };
    
    private static final String[] V_ART = {
        "__      __",
        "\\ \\    / /",
        " \\ \\  / / ",
        "  \\ \\/ /  ",
        "   \\  /   ",
        "    \\/    "
    };
    
    private static final String[] X_ART = {
        "__   __",
        "\\ \\ / /",
        " \\ V / ",
        "  > <  ",
        " / . \\ ",
        "/_/ \\_\\"
    };
    
    private static final String[] L_ART = {
        " _      ",
        "| |     ",
        "| |     ",
        "| |     ",
        "| |____ ",
        "|______|"
    };
    
    private static final String[] C_ART = {
        "  _____ ",
        " / ____|",
        "| |     ",
        "| |     ",
        "| |____ ",
        " \\_____|"
    };

    private static final String[] D_ART = {
        " _____  ",
        "|  __ \\ ",
        "| |  | |",
        "| |  | |",
        "| |__| |",
        "|_____/ "
    };

    private static final String[] M_ART = {
        " __  __ ",
        "|  \\/  |",
        "| \\  / |",
        "| |\\/| |",
        "| |  | |",
        "|_|  |_|"
    };

    private static final Map<Character, String[]> mapAsciiArt=new HashMap<>();
    static{
        mapAsciiArt.put('I', I_ART);
        mapAsciiArt.put('V', V_ART);
        mapAsciiArt.put('X', X_ART);
        mapAsciiArt.put('L', L_ART);
        mapAsciiArt.put('C', C_ART);
        mapAsciiArt.put('D', D_ART);
        mapAsciiArt.put('M', M_ART);
    }

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        if (romanNumber == null || romanNumber.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int artHeight = 6; // l'altezza di ogni asciiart

        // per ogni riga dei caratteri
        for (int i = 0; i < artHeight; i++) {
            // per ogni carattere del numero
            for (char c : romanNumber.toCharArray()) {
                result.append(mapAsciiArt.get(c)[i]).append(" ");
            }
            result.append("\n"); // nuova riga
        }
        
        return result.toString();
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