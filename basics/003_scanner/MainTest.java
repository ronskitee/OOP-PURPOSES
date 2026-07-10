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

        String name = "John";
        System.setIn(new ByteArrayInputStream(name.getBytes()));

        Main.main(new String[] {});

        System.setOut(originalOut);

        assertEquals("Enter Name: Hello, John\n", outContent.toString());
    }
}
