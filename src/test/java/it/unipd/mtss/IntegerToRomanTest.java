import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerToRoman {

    @Test
    public void testSimpleValues() {                                    //test su valori semplici

        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("X", IntegerToRoman.convert(10));

    }

    @Test                                                               //test su valori casuali
    public void testCompositeValues() {

        assertEquals("III", IntegerToRoman.convert(3));
        assertEquals("VIII", IntegerToRoman.convert(8));

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
            IntegerToRoman.convert(11);
            fail("Si aspetta un IllegalArgumentException per l'input 11");
        } catch (IllegalArgumentException e) {
            assertEquals("l'input dev'essere compreso tra 1 e 10", e.getMessage());
        }

    }

}
