import org.junit.Test;

import static org.junit.Assert.*;

public class TinyURLTest {

    TinyURL tinyURL = new TinyURL(10);

    @Test
    public void createAndLookup() {
        String url = "http://www.google.com/";
        String shortURL = tinyURL.create(url);
        String lookupURL = tinyURL.lookup(shortURL);
        assertEquals(url, lookupURL);
    }

    @Test
    public void createUniqueURLs() {
        String url = "http://www.google.com/";
        String sURL1 = tinyURL.create(url);
        String sURL2 = tinyURL.create(url);
        String lURL1 = tinyURL.lookup(sURL1);
        String lURL2 = tinyURL.lookup(sURL2);
        assertNotEquals(sURL1, sURL2);
        assertEquals(lURL1, lURL2);
    }

    @Test
    public void invalidLookup() {
        String lookupURL = tinyURL.lookup("http://localhost/");
        assertNull(lookupURL);
    }

    @Test
    public void tooManyCreates() {
        TinyURL tinyURL = new TinyURL(1);
        String url = "http://www.google.com/";
        String sURL1 = tinyURL.create(url);
        String sURL2 = tinyURL.create(url);
        assertNotNull(sURL1);
        assertNull(sURL2);
    }

}