import org.junit.Test;

import static org.junit.Assert.*;

public class IsArmstrongNumberTest {

    IsArmstrongNumber ian = new IsArmstrongNumber();

    @Test
    public void testIsArmstrongNumber0() throws Exception {
        assertTrue(ian.IsArmstrongNumber(0));
    }

    @Test
    public void testIsArmstrongNumber1() throws Exception {
        assertTrue(ian.IsArmstrongNumber(1));
    }

    @Test
    public void testIsArmstrongNumber153() throws Exception {
        assertTrue(ian.IsArmstrongNumber(153));
    }

    @Test
    public void testIsArmstrongNumber154() throws Exception {
        assertFalse(ian.IsArmstrongNumber(154));
    }

    @Test
    public void testIsArmstrongNumber370() throws Exception {
        assertTrue(ian.IsArmstrongNumber(370));
    }

    @Test
    public void testIsArmstrongNumber371() throws Exception {
        assertTrue(ian.IsArmstrongNumber(371));
    }
}