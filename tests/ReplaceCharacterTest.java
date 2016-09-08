import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharacterTest {

    ReplaceCharacter rc = new ReplaceCharacter();

    @Test
    public void testReplaceCharacterSimpleMiddle() throws Exception {
        String input = "abc";
        assertEquals("adc", rc.ReplaceCharacter(input,'b','d'));
    }

    @Test
    public void testReplaceCharacterSimpleBeginning() throws Exception {
        String input = "abc";
        assertEquals("dbc", rc.ReplaceCharacter(input,'a','d'));
    }

    @Test
    public void testReplaceCharacterSimpleEnd() throws Exception {
        String input = "abc";
        assertEquals("abd", rc.ReplaceCharacter(input,'c','d'));
    }

    @Test
    public void testReplaceCharacterMultiple() throws Exception {
        String input = "aba";
        assertEquals("dbd", rc.ReplaceCharacter(input,'a','d'));
    }

    @Test
    public void testReplaceCharacterAll() throws Exception {
        String input = "aaa";
        assertEquals("ddd", rc.ReplaceCharacter(input,'a','d'));
    }

    @Test
    public void testReplaceCharacterEmpty() throws Exception {
        String input = "";
        assertEquals("", rc.ReplaceCharacter(input,'a','d'));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testReplaceCharacterNull() throws Exception {
        String input = null;
        rc.ReplaceCharacter(input,'a','d');
    }
}