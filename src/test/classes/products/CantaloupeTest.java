package classes.products;

import classes.misc.Price;
import com.oracle.webservices.internal.api.databinding.Databinding;
import com.oracle.webservices.internal.api.databinding.WSDLGenerator;
import org.junit.Test;
import org.xml.sax.EntityResolver;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.WebServiceFeature;
import java.net.URL;
import java.util.Date;

import static org.junit.Assert.*;

public class CantaloupeTest {
    @Test
    public void getValue() throws Exception {
        Cantaloupe cantaloupe = new Cantaloupe();
        assertEquals(new Price(5.99*1).toString(), cantaloupe.getValue().toString());
    }

    @Test
    public void smellExpired() throws Exception {
        Cantaloupe cantaloupe = new Cantaloupe(0, new Date(0, 1, 1), 0);
        assertEquals("Cantalope is spoiled", cantaloupe.smell());
    }

    @Test
    public void smell() throws Exception {
        Cantaloupe cantaloupe = new Cantaloupe(0, new Date(118, 1, 1), 0);
        assertEquals("Cantalope is OK", cantaloupe.smell());
    }
}