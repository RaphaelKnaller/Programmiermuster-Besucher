package classes.products;

import classes.misc.Price;
import com.sun.nio.sctp.PeerAddressChangeNotification;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class YogurtTest {
    @Test
    public void getValue() throws Exception {
        Yogurt yogurt = new Yogurt();
        assertEquals(new Price(3.99*1).toString(), yogurt.getValue().toString());
    }

    @Test
    public void lookatExpired() throws Exception {
        Yogurt yogurt = new Yogurt(0, new Date(0,1,1), 0);
        assertEquals("Yogurt is spoiled", yogurt.lookat());
    }

    @Test
    public void lookat() throws Exception {
        Yogurt yogurt = new Yogurt(0, new Date(118,1,1), 0);
        assertEquals("Yogurt is OK", yogurt.lookat());
    }
}