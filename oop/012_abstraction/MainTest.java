import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.PrintStream;

import java.lang.reflect.Modifier;

public class MainTest {
    @Test
    public void testMainOutput() {
        PrintStream originalOut = System.out;

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[] {});

        System.setOut(originalOut);

        assertEquals("Sending SMS to 911 with 'Help'\nCalling 911\n", outContent.toString());

        assertTrue(Modifier.isAbstract(Phone.class.getModifiers()));
    }
}
