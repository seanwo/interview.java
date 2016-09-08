import org.junit.Test;

import static org.junit.Assert.*;

public class SumDigitsRecursiveTest {

    SumDigitsRecursive sdr = new SumDigitsRecursive();

    @Test
    public void testSumDigitsSimple() throws Exception {
        assertEquals(6,sdr.SumDigits(123));
    }

    @Test
    public void testSumDigitsZero() throws Exception {
        assertEquals(0,sdr.SumDigits(0));
    }

    @Test
    public void testSumDigitsSingle() throws Exception {
        assertEquals(1,sdr.SumDigits(1));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSumDigitsNegative() throws Exception {
        sdr.SumDigits(-12);
    }

    @Test
    public void testSumDigitsLarge() throws Exception {
        assertEquals(28,sdr.SumDigits(1234567));
    }

}