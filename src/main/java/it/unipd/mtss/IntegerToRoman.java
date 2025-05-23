////////////////////////////////////////////////////////////////////
// Riccardo     Contesso    2101053
// Zhong Xing   Qiu         2111035
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    private static final int[] Values = 
    {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    private static final String[] Symbols = 
    {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String convert(int number){
        if (number < 1 || number > 1000) {
            throw new IllegalArgumentException
            ("Il numero deve essere compreso tra 1 e 1000");
        }
        String roman = "";
        int remaining = number;
        
        for(int i=0; i<Values.length; i++){
            while(remaining >= Values[i]){
                roman += Symbols[i];
                remaining -= Values[i];
            }
        }
        return roman;
    }
}
