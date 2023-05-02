import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AlcoholTestStudent {

    @Test
    public void testCalcPrice() {
        Alcohol alcohol1 = new Alcohol("Wine", Size.SMALL, false);
        assertEquals(2.0, alcohol1.calcPrice(), 0.001);

        Alcohol alcohol2 = new Alcohol("Beer", Size.LARGE, true);
        assertEquals(4.6, alcohol2.calcPrice(), 0.001);
    }

    @Test
    public void testEquals() {
        Alcohol alcohol1 = new Alcohol("Wine", Size.SMALL, false);
        Alcohol alcohol2 = new Alcohol("Wine", Size.SMALL, false);
        Alcohol alcohol3 = new Alcohol("Beer", Size.LARGE, true);

        assertTrue(alcohol1.equals(alcohol2));
        assertFalse(alcohol1.equals(alcohol3));
    }

    @Test
    public void testToString() {
        Alcohol alcohol = new Alcohol("Wine", Size.SMALL, false);
        assertEquals("Wine, ALCOHOL, SMALL, Price: $2.0", alcohol.toString());
    }
}





