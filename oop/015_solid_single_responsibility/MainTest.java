import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.PrintStream;

import java.lang.reflect.Modifier;

public class MainTest {
    @Test
    public void testMainOutput() {
        Grade oop = new Grade("OOP", "Object-Oriented Programming", 1.0f);

        assertEquals(oop.getSubjectTitle(), "Object-Oriented Programming");
        assertEquals(oop.getSubjectCode(), "OOP");
        assertEquals(oop.getValue(), 1.0f, 0.01);
    }
}
