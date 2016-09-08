import org.junit.Test;

import static org.junit.Assert.*;

public class FindMiddleSumIndexTest {

    FindMiddleSumIndex fmsi = new FindMiddleSumIndex();

    @Test
    public void testFindMiddleSumIndexHappyPath() throws Exception {
        Integer[] input = {2,4,4,5,4,1};
        assertEquals(2,fmsi.FindMiddleSumIndex(input));
    }

    @Test
    public void testFindMiddleSumIndexTwoElements() throws Exception {
        Integer[] input = {2,2};
        assertEquals(0,fmsi.FindMiddleSumIndex(input));
    }

    @Test
    public void testFindMiddleSumIndexThreeElements() throws Exception {
        Integer[] input = {1,2,3};
        assertEquals(1,fmsi.FindMiddleSumIndex(input));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testFindMiddleSumIndexNullArray() throws Exception {
        fmsi.FindMiddleSumIndex(null);
    }

    @Test (expected = FindMiddleSumIndex.NoMiddleException.class)
    public void testFindMiddleSumIndexEmptyArray() throws Exception {
        Integer[] input = {};
        fmsi.FindMiddleSumIndex(input);
    }

    @Test (expected = FindMiddleSumIndex.NoMiddleException.class)
    public void testFindMiddleSumIndexNoSolution() throws Exception {
        Integer[] input = {2,4,4,5,4,2};
        fmsi.FindMiddleSumIndex(input);
    }

}