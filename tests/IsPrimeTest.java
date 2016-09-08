import org.junit.Test;

import static org.junit.Assert.*;

public class IsPrimeTest {

    IsPrime ip = new IsPrime();
    //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103

    @Test
    public void testIsPrime2() throws Exception {
        assertTrue(ip.IsPrime(2));
    }

    @Test
    public void testIsPrime3() throws Exception {
        assertTrue(ip.IsPrime(3));
    }

    @Test
    public void testIsPrime43() throws Exception {
        assertTrue(ip.IsPrime(43));
    }

    @Test
    public void testIsPrime61() throws Exception {
        assertTrue(ip.IsPrime(61));
    }

    @Test
    public void testIsPrime10() throws Exception {
        assertFalse(ip.IsPrime(10));
    }

    @Test
    public void testIsPrime1() throws Exception {
        assertFalse(ip.IsPrime(1));
    }

    @Test
    public void testIsPrime20() throws Exception {
        assertFalse(ip.IsPrime(20));
    }
}