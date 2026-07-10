import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {
    @Test
    public void testMainOutput() {
        PrintStream originalOut = System.out;

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[] {});

        System.setOut(originalOut);

        assertEquals(String.format("a\n%d\n", (int) 'a'), outContent.toString());
    }
}
