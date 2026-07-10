import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
    @Test
    public void testMainOutput() {
      Pigeon b1 = new Pigeon();

      assertTrue(b1 instanceof Bird);
      assertTrue(b1 instanceof FlyingBird);

      Penguin b2 = new Penguin();

      assertTrue(b2 instanceof Bird);
      assertTrue(b2 instanceof SwimmingBird);
    }
}

