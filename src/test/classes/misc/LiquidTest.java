package classes.misc;

import org.junit.Test;

import static org.junit.Assert.*;

public class LiquidTest {
    @Test
    public void getUnits() throws Exception {
        Liquid liquid = new Liquid(1);
        assertEquals(1, liquid.getUnits(), 0);
    }

    @Test
    public void setUnits() throws Exception {
        Liquid liquid = new Liquid(1);
        liquid.setUnits(5);
        assertEquals(5, liquid.getUnits(), 0);
    }

    @Test
    public void getUoM() throws Exception {
        Liquid liquid = new Liquid(1, "ounce");
        assertEquals("ounce", liquid.getUoM());
    }

    @Test
    public void setUoM() throws Exception {
        Liquid liquid = new Liquid(1);
        liquid.setUoM("$");
        assertEquals("$", liquid.getUoM());
    }
}