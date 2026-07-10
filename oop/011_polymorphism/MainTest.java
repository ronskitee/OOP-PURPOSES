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

        assertEquals("Area of Circle (10) = 314.1592653589793\nArea of Rectangle (10x5)50.0\n", outContent.toString());

        Circle c1 = new Circle(10);
        assertEquals(314.1592653589793, c1.area(), 0);

        Rectangle r1 = new Rectangle(10, 5);
        assertEquals(50.0, r1.area(), 0);
    }
}
