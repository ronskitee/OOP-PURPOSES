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

        assertEquals("A car is created.\n", outContent.toString());

        Car honda = new Car();
        honda.make = "Honda";
        honda.model = "Civic";

        assertEquals("Honda", honda.make);
        assertEquals("Civic", honda.model);
    }
}
