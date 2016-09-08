import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveArrayDuplicatesTest {

    RemoveArrayDuplicates rad = new RemoveArrayDuplicates();

    @Test
    public void testRemoveArrayDuplicates1223() throws Exception {
        Integer[] input = {1,2,2,3};
        Integer[] expected = {1,2,3};
        Integer[] actual = rad.RemoveArrayDuplicates(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveArrayNoDuplicates() throws Exception {
        Integer[] input = {1,2,3};
        Integer[] expected = {1,2,3};
        Integer[] actual = rad.RemoveArrayDuplicates(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveArrayDuplicates11() throws Exception {
        Integer[] input = {1,1};
        Integer[] expected = {1};
        Integer[] actual = rad.RemoveArrayDuplicates(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveArrayDuplicates1() throws Exception {
        Integer[] input = {1};
        Integer[] expected = {1};
        Integer[] actual = rad.RemoveArrayDuplicates(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveArrayDuplicatesEmpty() throws Exception {
        Integer[] input = {};
        Integer[] expected = {};
        Integer[] actual = rad.RemoveArrayDuplicates(input);
        assertArrayEquals(expected, actual);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRemoveArrayDuplicatesNull() throws Exception {
        rad.RemoveArrayDuplicates(null);
    }
}