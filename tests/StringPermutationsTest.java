import org.junit.Test;

import static org.junit.Assert.*;

public class StringPermutationsTest {

    StringPermutations sp = new StringPermutations();

    @Test(expected = IllegalArgumentException.class)
    public void testPermutationsNull() throws Exception {
        sp.Permutations(null);
    }

    @Test
    public void testPermutationsEmpty() throws Exception {
        String input = "";
        String[] expected = {""};
        assertArrayEquals(expected, sp.Permutations(input));
    }

    @Test
    public void testPermutations1() throws Exception {
        String input = "a";
        String[] expected = {"a"};
        assertArrayEquals(expected, sp.Permutations(input));
    }

    @Test
    public void testPermutations2() throws Exception {
        String input = "ab";
        String[] expected = {"ab", "ba"};
        assertArrayEquals(expected, sp.Permutations(input));
    }

    @Test
    public void testPermutations3() throws Exception {
        String input = "abc";
        String[] expected = {"abc","acb","bac","bca","cab","cba"};
        assertArrayEquals(expected, sp.Permutations(input));
    }
}