import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SmoothieTestStudent {

	@Test
	public void testCalcPrice() {
	    Smoothie smoothie1 = new Smoothie("Strawberry Smoothie", Size.SMALL, 3, false);
	    assertEquals(3.5, smoothie1.calcPrice(), 0.001);

	    Smoothie smoothie2 = new Smoothie("Mango Smoothie", Size.MEDIUM, 4, true);
	    assertEquals(6.5, smoothie2.calcPrice(), 0.001);
	}


    @Test
    public void testEquals() {
        Smoothie smoothie1 = new Smoothie("Strawberry Smoothie", Size.SMALL, 3, false);
        Smoothie smoothie2 = new Smoothie("Strawberry Smoothie", Size.SMALL, 3, false);
        Smoothie smoothie3 = new Smoothie("Mango Smoothie", Size.MEDIUM, 4, true);

        assertTrue(smoothie1.equals(smoothie2));
        assertFalse(smoothie1.equals(smoothie3));
    }

    @Test
    public void testToString() {
        Smoothie smoothie = new Smoothie("Strawberry Smoothie", Size.SMALL, 3, false);
        assertEquals("Strawberry Smoothie, SMOOTHIE, SMALL, 3 fruits, Price: $3.5", smoothie.toString());
    }
}
