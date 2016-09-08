import org.junit.Test;

import java.util.HashMap;
import static org.junit.Assert.*;

public class FindRepeatingCharsTest {

    FindRepeatingChars frc = new FindRepeatingChars();

    @Test
    public void testFindRepeatingCharsOneChar() throws Exception {
        String str = "abbc";
        HashMap<Character, Integer> expected = new HashMap<>();
        expected.put('b',2);
        HashMap<Character, Integer> actual = frc.FindRepeatingChars(str);
        assertArrayEquals(expected.keySet().toArray(new Character[0]),actual.keySet().toArray(new Character[0]));
        assertArrayEquals(expected.values().toArray(new Integer[0]),actual.values().toArray(new Integer[0]));
    }

    @Test
    public void testFindRepeatingCharsHappyPath() throws Exception {
        String str = "abcdefgcbahia";
        HashMap<Character, Integer> expected = new HashMap<>();
        expected.put('a',3);
        expected.put('b',2);
        expected.put('c',2);
        HashMap<Character, Integer> actual = frc.FindRepeatingChars(str);
        assertArrayEquals(expected.keySet().toArray(new Character[0]),actual.keySet().toArray(new Character[0]));
        assertArrayEquals(expected.values().toArray(new Integer[0]),actual.values().toArray(new Integer[0]));
    }

    @Test
    public void testFindRepeatingCharsNone() throws Exception {
        String str = "abc";
        HashMap<Character, Integer> expected = new HashMap<>();
        HashMap<Character, Integer> actual = frc.FindRepeatingChars(str);
        assertArrayEquals(expected.keySet().toArray(new Character[0]),actual.keySet().toArray(new Character[0]));
        assertArrayEquals(expected.values().toArray(new Integer[0]),actual.values().toArray(new Integer[0]));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testFindRepeatingCharsNullInput() throws Exception {
        frc.FindRepeatingChars(null);
    }
}