import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.PrintStream;

import java.lang.reflect.Modifier;

public class MainTest {
    @Test
    public void testMainOutput() {
        Discount seniorDiscount = new SeniorDiscount();
        assertEquals(seniorDiscount.calculate(10.0), 10.0 * 0.05, 0.0);

        Discount memberDiscount = new MemberDiscount();
        assertEquals(memberDiscount.calculate(10.0), 10.0 * 0.02, 0.0);

        Discount regularDiscount = new RegularCustomerDiscount();
        assertEquals(regularDiscount.calculate(10.0), 0.0, 0.0);
    }
}
