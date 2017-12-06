package classes.misc;

import org.junit.Test;

import static org.junit.Assert.*;

public class WeightTest {
    @Test
    public void getWeight() throws Exception {
        Weight weight = new Weight(1);
        assertEquals(1, weight.getWeight(), 0);
    }

    @Test
    public void setWeight() throws Exception {
        Weight weight = new Weight(1);
        weight.setWeight(5);
        assertEquals(5, weight.getWeight(), 0);
    }

    @Test
    public void getUoM() throws Exception {
        Weight weight = new Weight(1, "ton");
        assertEquals("ton", weight.getUoM());
    }

    @Test
    public void setUoM() throws Exception {
        Weight weight = new Weight(1);
        weight.setUoM("ton");
        assertEquals("ton", weight.getUoM());
    }

}