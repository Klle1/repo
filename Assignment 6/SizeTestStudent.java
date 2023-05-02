import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SizeTestStudent {

    @Test
    public void testSizeEnum() {
        assertEquals(Size.SMALL, Size.valueOf("SMALL"));
        assertEquals(Size.MEDIUM, Size.valueOf("MEDIUM"));
        assertEquals(Size.LARGE, Size.valueOf("LARGE"));
    }
}

