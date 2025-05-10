////////////////////////////////////////////////////////////////////
// Riccardo     Contesso    2101053
// Zhong Xing   Qiu         2111035
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

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

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        if (romanNumber == null || romanNumber.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int artHeight = 6; // l'altezza di ogni asciiart
        
        for (int i = 0; i < artHeight; i++) {           // per ogni riga dei caratteri
            for (char c : romanNumber.toCharArray()) {  // per ogni carattere del numero
                switch (c) {
                    case 'I':
                        result.append(I_ART[i]);
                        break;
                    case 'V':
                        result.append(V_ART[i]);
                        break;
                    case 'X':
                        result.append(X_ART[i]);
                        break;
                    case 'L':
                        result.append(L_ART[i]);
                        break;
                    case 'C':
                        result.append(C_ART[i]);
                    case 'D':
                        result.append(D_ART[i]);
                        break;
                    case 'M':
                        result.append(M_ART[i]);
                        break;
                    default:
                        continue;
                }
                result.append("  "); // Aggiungo uno spazio tra i caratteri
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