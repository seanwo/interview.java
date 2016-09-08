import org.junit.Test;

import static org.junit.Assert.*;

public class DecimalToBinaryTest {

    DecimalToBinary d2b = new DecimalToBinary();

    @Test
    public void testDecimalToBinary0() throws Exception {
        assertEquals(0,d2b.DecimalToBinary(0));
    }

    @Test
    public void testDecimalToBinary1() throws Exception {
        assertEquals(1,d2b.DecimalToBinary(1));
    }

    @Test
    public void testDecimalToBinary2() throws Exception {
        assertEquals(10,d2b.DecimalToBinary(2));
    }

    @Test
    public void testDecimalToBinary3() throws Exception {
        assertEquals(11,d2b.DecimalToBinary(3));
    }

    @Test
    public void testDecimalToBinary8() throws Exception {
        assertEquals(1000,d2b.DecimalToBinary(8));
    }

    @Test
    public void testDecimalToBinary9() throws Exception {
        assertEquals(1001,d2b.DecimalToBinary(9));
    }

    @Test
    public void testDecimalToBinary255() throws Exception {
        assertEquals(11111111,d2b.DecimalToBinary(255));
    }

}