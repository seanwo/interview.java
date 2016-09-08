import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryToDecimalTest {

    BinaryToDecimal b2d = new BinaryToDecimal();

    @Test
    public void testBinaryToDecimal0() throws Exception {
        assertEquals(0,b2d.BinaryToDecimal(0));
    }

    @Test
    public void testBinaryToDecimal1() throws Exception {
        assertEquals(1,b2d.BinaryToDecimal(1));
    }

    @Test
    public void testBinaryToDecimal2() throws Exception {
        assertEquals(2,b2d.BinaryToDecimal(10));
    }

    @Test
    public void testBinaryToDecimal3() throws Exception {
        assertEquals(3,b2d.BinaryToDecimal(11));
    }
    @Test
    public void testBinaryToDecimal8() throws Exception {
        assertEquals(8,b2d.BinaryToDecimal(1000));
    }

    @Test
    public void testBinaryToDecimal9() throws Exception {
        assertEquals(9,b2d.BinaryToDecimal(1001));
    }
}