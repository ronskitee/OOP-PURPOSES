import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.PrintStream;

public class MainTest {
    @Test
    public void testMainOutput() {
        PrintStream originalOut = System.out;

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[] {});

        System.setOut(originalOut);

        assertEquals("A new car is created.\nHonda Civic red\n", outContent.toString());

        Car honda = new Car("Honda", "Civic");
        honda.setColor("Black");

        assertEquals("Honda", honda.getMake());
        assertEquals("Civic", honda.getModel());
        assertEquals("Black", honda.getColor());
    }
}
