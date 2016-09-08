import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

    Sort s = new Sort();

    @Test
    public void testSimpleSortNormal() throws Exception {
        int[] values = {23, 12, 32, 1, 45, 101, 56};
        int[] expected = {1, 12, 23, 32, 45, 56, 101};
        assertArrayEquals(expected, s.SimpleSort(values));
    }

    @Test
    public void testSimpleSortEndsSwapped() throws Exception {
        int[] values = {3,2,1};
        int[] expected = {1,2,3};
        assertArrayEquals(expected, s.SimpleSort(values));
    }

    @Test
    public void testSimpleSortAlreadySorted() throws Exception {
        int[] values = {1,2,3};
        int[] expected = {1,2,3};
        assertArrayEquals(expected, s.SimpleSort(values));
    }

    @Test
    public void testSimpleSortReversed() throws Exception {
        int[] values = {3,2,1};
        int[] expected = {1,2,3};
        assertArrayEquals(expected, s.SimpleSort(values));
    }

    @Test
    public void testSimpleSortOneElement() throws Exception {
        int[] values = {1};
        int[] expected = {1};
        assertArrayEquals(expected, s.SimpleSort(values));
    }

    @Test
    public void testSimpleSortTwoElementsReversed() throws Exception {
        int[] values = {2,1};
        int[] expected = {1,2};
        assertArrayEquals(expected, s.SimpleSort(values));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSimpleSortNull() throws Exception {
        s.SimpleSort(null);
    }

    @Test
    public void testBubbleSortNormal() throws Exception {
        int[] values = {23, 12, 32, 1, 45, 101, 56};
        int[] expected = {1, 12, 23, 32, 45, 56, 101};
        assertArrayEquals(expected, s.BubbleSort(values));
    }

    @Test
    public void testBubbleSortEndsSwapped() throws Exception {
        int[] values = {3,2,1};
        int[] expected = {1,2,3};
        assertArrayEquals(expected, s.BubbleSort(values));
    }

    @Test
    public void testBubbleSortAlreadySorted() throws Exception {
        int[] values = {1,2,3};
        int[] expected = {1,2,3};
        assertArrayEquals(expected, s.BubbleSort(values));
    }

    @Test
    public void testBubbleSortReversed() throws Exception {
        int[] values = {3,2,1};
        int[] expected = {1,2,3};
        assertArrayEquals(expected, s.BubbleSort(values));
    }

    @Test
    public void testBubbleSortOneElement() throws Exception {
        int[] values = {1};
        int[] expected = {1};
        assertArrayEquals(expected, s.BubbleSort(values));
    }

    @Test
    public void testBubbleSortTwoElementsReversed() throws Exception {
        int[] values = {2,1};
        int[] expected = {1,2};
        assertArrayEquals(expected, s.BubbleSort(values));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testBubbleSortNull() throws Exception {
        s.BubbleSort(null);
    }

    @Test
    public void testInsertionSortNormal() throws Exception {
        int[] values = {23, 12, 32, 1, 45, 101, 56};
        int[] expected = {1, 12, 23, 32, 45, 56, 101};
        assertArrayEquals(expected, s.InsertionSort(values));
    }

    @Test
    public void testInsertionSortEndsSwapped() throws Exception {
        int[] values = {3,2,1};
        int[] expected = {1,2,3};
        assertArrayEquals(expected, s.InsertionSort(values));
    }

    @Test
    public void testInsertionSortAlreadySorted() throws Exception {
        int[] values = {1,2,3};
        int[] expected = {1,2,3};
        assertArrayEquals(expected, s.InsertionSort(values));
    }

    @Test
    public void testInsertionSortReversed() throws Exception {
        int[] values = {3,2,1};
        int[] expected = {1,2,3};
        assertArrayEquals(expected, s.InsertionSort(values));
    }

    @Test
    public void testInsertionSortOneElement() throws Exception {
        int[] values = {1};
        int[] expected = {1};
        assertArrayEquals(expected, s.InsertionSort(values));
    }

    @Test
    public void testInsertionSortTwoElementsReversed() throws Exception {
        int[] values = {2,1};
        int[] expected = {1,2};
        assertArrayEquals(expected, s.InsertionSort(values));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testInsertionSortNull() throws Exception {
        s.InsertionSort(null);
    }


}