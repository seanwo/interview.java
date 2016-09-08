import org.junit.Test;

import static org.junit.Assert.*;

public class IsBinaryTest {

    IsBinary ib = new IsBinary();

    @Test
    public void testIsBinary0() throws Exception {
        assertTrue(ib.IsBinary(0));
    }

    @Test
    public void testIsBinary1() throws Exception {
        assertTrue(ib.IsBinary(1));
    }

    @Test
    public void testIsBinary10() throws Exception {
        assertTrue(ib.IsBinary(10));
    }

    @Test
    public void testIsBinary12() throws Exception {
        assertFalse(ib.IsBinary(12));
    }
}