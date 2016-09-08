import org.junit.Test;

import static org.junit.Assert.*;

public class FindLongestUniqueSubstringTest {

    FindLongestUniqueSubstring flus = new FindLongestUniqueSubstring();

    @Test
    public void testFindLongestUniqueSubstringSimple() throws Exception {
        String input = "abcabcdabc";
        assertEquals("abcd", flus.FindLongestUniqueSubstring(input));
    }

    @Test
    public void testFindLongestUniqueSubstringSimple2() throws Exception {
        String input = "abcbcdabc";
        assertEquals("bcda", flus.FindLongestUniqueSubstring(input));
    }

    @Test
    public void testFindLongestUniqueSubstringFront() throws Exception {
        String input = "aba";
        assertEquals("ab", flus.FindLongestUniqueSubstring(input));
    }

    @Test
    public void testFindLongestUniqueSubstringMiddle() throws Exception {
        String input = "aaba";
        assertEquals("ab", flus.FindLongestUniqueSubstring(input));
    }

    @Test
    public void testFindLongestUniqueSubstringEnd() throws Exception {
        String input = "aaab";
        assertEquals("ab", flus.FindLongestUniqueSubstring(input));
    }

    @Test
    public void testFindLongestUniqueSubstringSingleChar() throws Exception {
        String input = "a";
        assertEquals("a", flus.FindLongestUniqueSubstring(input));
    }

    @Test
    public void testFindLongestUniqueSubstringTwoSameChars() throws Exception {
        String input = "aa";
        assertEquals("a", flus.FindLongestUniqueSubstring(input));
    }

    @Test
    public void testFindLongestUniqueSubstringTieFirstWins() throws Exception {
        String input = "bbccaa";
        assertEquals("bc", flus.FindLongestUniqueSubstring(input));
    }

    @Test
    public void testFindLongestUniqueSubstringEmpty() throws Exception {
        String input = "";
        assertEquals("", flus.FindLongestUniqueSubstring(input));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testFindLongestUniqueSubstringNull() throws Exception {
        flus.FindLongestUniqueSubstring(null);
    }
}