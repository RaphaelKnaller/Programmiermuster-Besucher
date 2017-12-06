package classes.products;

import classes.misc.Price;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class MeatTest {
    @Test
    public void getValue() throws Exception {
        Meat meat = new Meat();
        assertEquals(new Price(12.99*1).toString(), meat.getValue().toString());
    }

    @Test
    public void lookatExpired() throws Exception {
        Meat meat = new Meat(0, new Date(0,1,1), 0);
        assertEquals("Meat is spoiled", meat.lookat());
    }

    @Test
    public void lookat() throws Exception {
        Meat meat = new Meat(0, new Date(118,1,1),0);
        assertEquals("Meat is OK", meat.lookat());
    }
}