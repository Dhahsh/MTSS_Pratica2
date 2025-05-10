package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testSimpleValues() {                                    //test su valori semplici

        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("X", IntegerToRoman.convert(10));
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("L", IntegerToRoman.convert(50));
        assertEquals("XC", IntegerToRoman.convert(90));
        assertEquals("C", IntegerToRoman.convert(100));
        assertEquals("CD", IntegerToRoman.convert(400));
        assertEquals("D", IntegerToRoman.convert(100));

    }

    @Test                                                               //test su valori casuali
    public void testCompositeValues() {

        assertEquals("III", IntegerToRoman.convert(3));
        assertEquals("LVIII", IntegerToRoman.convert(58));
        assertEquals("CCCLXXXII", IntegerToRoman.convert(382));
        assertEquals("CDLIX", IntegerToRoman.convert(459));

    }

    @Test                                                               //valori test invalidi
    public void testInvalidValues() {

        try {
            IntegerToRoman.convert(0);
            fail("Si aspetta un IllegalArgumentException per l'input 0");
        } catch (IllegalArgumentException e) {
            assertEquals("Zero non e' un input valido", e.getMessage());
        }

        try {
            IntegerToRoman.convert(501);
            fail("Si aspetta un IllegalArgumentException per l'input 501");
        } catch (IllegalArgumentException e) {
            assertEquals("l'input dev'essere compreso tra 1 e 100", e.getMessage());
        }

    }

}
