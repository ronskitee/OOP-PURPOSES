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

        assertEquals("Dog is eating...\nDog is barking...\n", outContent.toString());

        Dog blues = new Dog();

        assertTrue(blues instanceof Animal);
        assertTrue(blues instanceof Canine);
    }
}
