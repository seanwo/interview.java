import org.junit.Test;

import static org.junit.Assert.*;

public class FindDuplicateTest {

    FindDuplicate fd = new FindDuplicate();

    @Test
    public void testFindDuplicateHappyPath() throws Exception {
        Integer[] input = {1,2,2,3};
        assertEquals(2, fd.FindDuplicate(input));
    }

    @Test
    public void testFindDuplicateAllDups() throws Exception {
        Integer[] input = {1,1};
        assertEquals(1, fd.FindDuplicate(input));
    }

    @Test
    public void testFindDuplicateBookends() throws Exception {
        Integer[] input = {3,1,2,3};
        assertEquals(3, fd.FindDuplicate(input));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testFindDuplicateNullList() throws Exception {
        fd.FindDuplicate(null);
    }

    @Test (expected = FindDuplicate.NoDuplicateException.class)
    public void testFindDuplicateNoDups() throws Exception {
        Integer[] input = {1,2,3};
        fd.FindDuplicate(input);
    }

    @Test (expected = FindDuplicate.NoDuplicateException.class)
    public void testFindDuplicateEmptyList() throws Exception {
        Integer[] input = {};
        fd.FindDuplicate(input);
    }

    @Test (expected = FindDuplicate.NoDuplicateException.class)
    public void testFindDuplicateOneElementList() throws Exception {
        Integer[] input = {1};
        fd.FindDuplicate(input);
    }
}