import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.PrintStream;

import java.lang.reflect.Modifier;

public class MainTest {
    @Test
    public void testMainOutput() {
        assertTrue(Modifier.isAbstract(Person.class.getModifiers()));

        Student juan = new Student("Juan", "BSCS");

        assertEquals(juan.getName(), "Juan");
        assertEquals(juan.getCourse(), "BSCS");
    }
}
