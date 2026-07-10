import static org.junit.Assert.*;
import org.junit.Test;

import java.lang.reflect.*;

public class MainTest {
    @Test
    public void testMainOutput() {
        Car civic = new Car();

        assertTrue(civic instanceof Vehicle);
        assertTrue(civic instanceof Car);

        try {
            Method move = civic.getClass().getMethod("move");
        } catch (Exception e) {
            fail("Method Not Implemented" + e.getMessage());
        }
    }
}