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

        Chalk chalk = new Chalk();
        chalk.write("CMI!");

        assertEquals("CMI!\n", outContent.toString());
        outContent.reset();

        Pencil pencil = new Pencil();
        pencil.write("Welcome!");
        pencil.sharpen();

        assertEquals("Welcome!\ngetting it sharp...\n", outContent.toString());
        outContent.reset();

        Marker marker = new Marker();
        marker.write("COMSCI");
        marker.refill();

        assertEquals("COMSCI\nink refilled\n", outContent.toString());
        assertTrue(marker instanceof WritingTool);
        assertTrue(marker instanceof Refillable);

        System.setOut(originalOut);
    }
}
