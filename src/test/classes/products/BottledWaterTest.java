package classes.products;

import classes.misc.Price;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class BottledWaterTest {

    @Test
    public void getValue() throws Exception {
        BottledWater bottledWater = new BottledWater();
        assertEquals(new Price(2.99 * 1).toString(), bottledWater.getValue().toString());
    }

    @Test
    public void lookatexpiryDateExpired() throws Exception {
        BottledWater bottledWater = new BottledWater(0, new Date(0,1 ,1), 0);
        assertEquals("Water is spoiled" , bottledWater.lookatexpiryDate());
    }

    @Test
    public void lookatexpiryDate() throws Exception {
        BottledWater bottledWater = new BottledWater(0, new Date(118,1 ,1), 0);
        assertEquals("Water is OK" , bottledWater.lookatexpiryDate());
    }

}