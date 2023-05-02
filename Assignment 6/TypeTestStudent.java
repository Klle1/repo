import org.junit.Test;
import static org.junit.Assert.*;

public class TypeTestStudent {

    @Test
    public void testValueOf() {
        Type coffee = Type.valueOf("COFFEE");
        assertEquals(coffee, Type.COFFEE);
    }

    @Test
    public void testValues() {
        Type[] types = Type.values();
        assertEquals(3, types.length);
        assertEquals(types[0], Type.SMOOTHIE);
        assertEquals(types[1], Type.COFFEE);
        assertEquals(types[2], Type.ALCOHOL);
    }
}

