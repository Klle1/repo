import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CoffeeTestStudent {

    @Test
    public void testCalcPrice() {
        Coffee coffee1 = new Coffee("Espresso", Size.SMALL, false, false);
        assertEquals(2.0, coffee1.calcPrice(), 0.001);

        Coffee coffee2 = new Coffee("Latte", Size.MEDIUM, true, true);
        assertEquals(4.0, coffee2.calcPrice(), 0.001);
    }

    @Test
    public void testEquals() {
        Coffee coffee1 = new Coffee("Espresso", Size.SMALL, false, false);
        Coffee coffee2 = new Coffee("Espresso", Size.SMALL, false, false);
        Coffee coffee3 = new Coffee("Latte", Size.MEDIUM, true, true);

        assertTrue(coffee1.equals(coffee2));
        assertFalse(coffee1.equals(coffee3));
    }

    @Test
    public void testToString() {
        Coffee coffee = new Coffee("Espresso", Size.SMALL, false, false);
        assertEquals("Espresso, COFFEE, SMALL, Price: $2.0", coffee.toString());
    }
}


