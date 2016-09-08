import org.junit.Test;

import static org.junit.Assert.*;

public class SwapNoTempVariableTest {

    SwapNoTempVariable sntv = new SwapNoTempVariable();

    @Test
    public void testSwapNoTempVariableSimple() throws Exception {
        Integer[] input = {1,2};
        Integer[] expected = {2,1};
        assertArrayEquals(expected, sntv.SwapNoTempVariable(input));
    }

    @Test
    public void testSwapNoTempVariableLarge() throws Exception {
        Integer[] input = {12345,54321};
        Integer[] expected = {54321,12345};
        assertArrayEquals(expected, sntv.SwapNoTempVariable(input));
    }

    @Test
    public void testSwapNoTempVariableSame() throws Exception {
        Integer[] input = {123,123};
        Integer[] expected = {123,123};
        assertArrayEquals(expected, sntv.SwapNoTempVariable(input));
    }

    @Test
    public void testSwapNoTempVariableBothZero() throws Exception {
        Integer[] input = {0,0};
        Integer[] expected = {0,0};
        assertArrayEquals(expected, sntv.SwapNoTempVariable(input));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSwapNoTempVariableNullInput() throws Exception {
        sntv.SwapNoTempVariable(null);
    }
}