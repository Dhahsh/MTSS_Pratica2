////////////////////////////////////////////////////////////////////
// Riccardo     Contesso    2101053
// Zhong Xing   Qiu         2111035
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    private static final int[] Values = {10, 9, 5, 4, 1};
    private static final String[] Symbols = {"X", "IX", "V", "IV", "I"};

    public static String convert(int number){
        if (number < 1 || number > 10) {
            throw new IllegalArgumentException("Il numero deve essere compreso tra 1 e 10");
        }
        String roman = "";
        int remaining = number;
        
        for(int i=0; i<Values.length; i++){
            while(remaining > Values[i]){
                roman += Symbols[i];
            }
        }
        return roman;
    }
}
