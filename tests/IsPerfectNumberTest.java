import org.junit.Test;

import static org.junit.Assert.*;

public class IsPerfectNumberTest {

    IsPerfectNumber ip = new IsPerfectNumber();

    @Test
    public void testIsPerfectNumberSimpleTrue() throws Exception {
        assertTrue(ip.IsPerfectNumber(6));
    }

    @Test
    public void testIsPerfectNumberSimpleFalse() throws Exception {
        assertFalse(ip.IsPerfectNumber(5));
    }

    @Test
    public void testIsPerfectNumberZero() throws Exception {
        assertFalse(ip.IsPerfectNumber(0));
    }

    @Test
    public void testIsPerfectNumberNegative() throws Exception {
        assertFalse(ip.IsPerfectNumber(-1));
    }

    @Test
    public void testIsPerfectNumberLargeTrue() throws Exception {
        assertTrue(ip.IsPerfectNumber(496));
    }

    @Test
    public void testIsPerfectNumberLargeFalse() throws Exception {
        assertFalse(ip.IsPerfectNumber(497));
    }
}