package classes.products;

import classes.misc.Price;
import com.sun.nio.sctp.PeerAddressChangeNotification;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class RiceTest {
    @Test
    public void getValue() throws Exception {
        Rice rice = new Rice();
        assertEquals(new Price(12.99*1).toString(), rice.getValue().toString());
    }

    @Test
    public void lookatExpired() throws Exception {
        Rice rice = new Rice(0, new Date(0,1,1),0);
        assertEquals("Rice is spoiled", rice.lookat());
    }

    @Test
    public void lookat() throws Exception {
        Rice rice = new Rice(0, new Date(118,1,1),0);
        assertEquals("Rice is OK", rice.lookat());
    }

}