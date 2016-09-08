import org.junit.Test;

import static org.junit.Assert.*;

public class FindMax2ValuesTest {

    FindMax2Values fm2v = new FindMax2Values();

    @Test
    public void testFindMax2ValuesTop2Only() throws Exception {
        Integer[] input = {1,2};
        Integer[] expected = {2,1};
        assertArrayEquals(expected, fm2v.FindMax2Values(input));
    }

    @Test
    public void testFindMax2ValuesTop2OnlySame() throws Exception {
        Integer[] input = {2,2};
        Integer[] expected = {2,2};
        assertArrayEquals(expected, fm2v.FindMax2Values(input));
    }

    @Test
    public void testFindMax2ValuesTop2AreSameNumber() throws Exception {
        Integer[] input = {1, 2, 2, 1};
        Integer[] expected = {2, 2};
        assertArrayEquals(expected, fm2v.FindMax2Values(input));
    }

    @Test
    public void testFindMax2ValuesHappyPath() throws Exception {
        Integer[] input = {34,23,12,134,111,22,6};
        Integer[] expected = {134, 111};
        assertArrayEquals(expected, fm2v.FindMax2Values(input));
    }

    @Test
    public void testFindMax2ValuesOvertake() throws Exception {
        Integer[] input = {34,23,12,134,111,135,22,6};
        Integer[] expected = {135, 134};
        assertArrayEquals(expected, fm2v.FindMax2Values(input));
    }

    @Test
    public void testFindMax2ValuesUndertake() throws Exception {
        Integer[] input = {34,23,12,134,111,22,120,6};
        Integer[] expected = {134, 120};
        assertArrayEquals(expected, fm2v.FindMax2Values(input));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testFindMax2ValuesArrayToSmall() throws Exception {
        Integer[] input = {34};
        fm2v.FindMax2Values(input);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testFindMax2ValuesArrayEmpty() throws Exception {
        Integer[] input = {};
        fm2v.FindMax2Values(input);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testFindMax2ValuesNullInput() throws Exception {
        fm2v.FindMax2Values(null);
    }
}