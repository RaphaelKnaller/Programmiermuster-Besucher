package classes.misc;

import org.junit.Test;

import static org.junit.Assert.*;

public class PriceTest {
    @Test
    public void getPrice() throws Exception {
        Price price = new Price(1);
        assertEquals(true, true);
    }

    @Test
    public void setPrice() throws Exception {
        Price price = new Price(1);
        price.setPrice(5);
        assertEquals(5, price.getPrice(), 0);
    }

    @Test
    public void getCurrency() throws Exception {
        Price price = new Price(1, '$');
        assertEquals('$', price.getCurrency());
    }

    @Test
    public void setCurrency() throws Exception {
        Price price = new Price(1);
        price.setCurrency('$');
        assertEquals('$', price.getCurrency());
    }

    @Test
    public void toStringTest() throws Exception {
        Price price = new Price(1, '$');
        assertEquals("1.0 $", price.toString());
    }
}