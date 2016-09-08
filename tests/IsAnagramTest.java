import org.junit.Test;

import static org.junit.Assert.*;

public class IsAnagramTest {

    IsAnagram ia = new IsAnagram();

    @Test
    public void testIsAnagramSimpleTrue() throws Exception {
        String inputa = "dog";
        String inputb = "god";
        assertTrue(ia.IsAnagram(inputa,inputb));
    }

    @Test
    public void testIsAnagramSimpleFalse() throws Exception {
        String inputa = "dog";
        String inputb = "pin";
        assertFalse(ia.IsAnagram(inputa,inputb));
    }

    @Test
    public void testIsAnagramBothEmpty() throws Exception {
        String inputa = "";
        String inputb = "";
        assertTrue(ia.IsAnagram(inputa,inputb));
    }

    @Test
    public void testIsAnagramBothSingle() throws Exception {
        String inputa = "a";
        String inputb = "a";
        assertTrue(ia.IsAnagram(inputa,inputb));
    }

    @Test
    public void testIsAnagramSubstringVar1() throws Exception {
        String inputa = "abc";
        String inputb = "abcd";
        assertFalse(ia.IsAnagram(inputa,inputb));
    }

    @Test
    public void testIsAnagramSubstringVar2() throws Exception {
        String inputa = "abcd";
        String inputb = "abc";
        assertFalse(ia.IsAnagram(inputa,inputb));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsAnagramFirstStringNull() throws Exception {
        ia.IsAnagram(null,"abc");
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsAnagramSecondStringNull() throws Exception {
        ia.IsAnagram("abc", null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIsAnagramBothStringsNull() throws Exception {
        ia.IsAnagram(null, null);
    }

}