import org.junit.Test;

import static org.junit.Assert.*;

public class FindCommonElementsTest {

    FindCommonElements fce = new FindCommonElements();

    @Test
    public void testFindCommonElements1() throws Exception {
        Integer[] inputa = {1,2,3};
        Integer[] inputb = {4,5,1};
        Integer[] expected = {1};
        assertArrayEquals(expected, fce.FindCommonElements(inputa, inputb));
    }

    @Test
    public void testFindCommonElementsHappyPath() throws Exception {
        Integer[] inputa = {5,4,3,2,1};
        Integer[] inputb = {2,3,4};
        Integer[] expected = {2,3,4};
        assertArrayEquals(expected, fce.FindCommonElements(inputa, inputb));
    }

    @Test
    public void testFindCommonElementsNone() throws Exception {
        Integer[] inputa = {1,2,3};
        Integer[] inputb = {4,5,6};
        Integer[] expected = {};
        assertArrayEquals(expected, fce.FindCommonElements(inputa, inputb));
    }

    @Test
    public void testFindCommonElementsRepeat() throws Exception {
        Integer[] inputa = {1,2,3};
        Integer[] inputb = {4,2,2,6};
        Integer[] expected = {2};
        assertArrayEquals(expected, fce.FindCommonElements(inputa, inputb));
    }

    @Test
    public void testFindCommonElementsNoneMismatchSize() throws Exception {
        Integer[] inputa = {1,2,3};
        Integer[] inputb = {4,5,6,7,8};
        Integer[] expected = {};
        assertArrayEquals(expected, fce.FindCommonElements(inputa, inputb));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindCommonElementsBadFirstList() throws Exception {
        Integer[] inputb = {1,2,3};
        fce.FindCommonElements(null, inputb);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindCommonElementsBadSecondList() throws Exception {
        Integer[] inputa = {1,2,3};
        fce.FindCommonElements(inputa, null);
    }

}