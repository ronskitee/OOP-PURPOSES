import static org.junit.Assert.*;
import org.junit.Test;

import java.lang.reflect.*;

public class MainTest {
    @Test
    public void testMainOutput() {
        BasicTelevision plainTv = new BasicTelevision();

        assertTrue(plainTv instanceof ElectronicDevice);
        assertTrue(plainTv instanceof BasicTelevision);

        try {
            Method onMethod = plainTv.getClass().getMethod("on");
            Method offMethod = plainTv.getClass().getMethod("off");        
            
            boolean hasBrowseChannels = false;
            for (Method method : plainTv.getClass().getSuperclass().getDeclaredMethods()) {
                if (method.getName().equals("browseChannels") &&
                    !Modifier.isAbstract(method.getModifiers())) {
                    hasBrowseChannels = true;
                    break;
                }
            }

            if (!hasBrowseChannels) {
                fail("Method `browseChannels` not implemented in Television");
            }
        } catch (Exception e) {
            fail("Method Not Implemented" + e.getMessage());
        }


        SmartTelevision smartTv = new SmartTelevision();

        assertTrue(smartTv instanceof ElectronicDevice);
        assertTrue(smartTv instanceof SmartTelevision);

        try {
            Method netflix = smartTv.getClass().getMethod("netflix");
            Method youtube = smartTv.getClass().getMethod("youtube");
        } catch (Exception e) {
            fail("Method Not Implemented" + e.getMessage());
        }
    }
}