import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListTest {

    @Test (expected = IllegalArgumentException.class)
    public void testAddNull() throws Exception {
        MyArrayList myList = new MyArrayList();
        myList.add(null);
    }

    @Test
    public void testAddOne() throws Exception {
        MyArrayList myList = new MyArrayList();
        myList.add(0);
        assertEquals(1, myList.size());
        assertEquals(0, myList.get(0));
    }

    @Test
    public void testAddTwo() throws Exception {
        MyArrayList myList = new MyArrayList();
        myList.add(0);
        myList.add(1);
        assertEquals(2, myList.size());
        assertEquals(0, myList.get(0));
        assertEquals(1, myList.get(1));
    }

    @Test
    public void testSizeInitial0() throws Exception {
        MyArrayList myList = new MyArrayList();
        assertEquals(0, myList.size());
    }

    @Test
    public void testSizeAddTo1() throws Exception {
        MyArrayList myList = new MyArrayList();
        myList.add(1);
        assertEquals(1, myList.size());
    }

    @Test
    public void testSizeReturnTo0() throws Exception {
        MyArrayList myList = new MyArrayList();
        myList.add(1);
        myList.remove(0);
        assertEquals(0, myList.size());
    }

    @Test
    public void testGetHappyPath() throws Exception {
        MyArrayList myList = new MyArrayList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        assertEquals(1, myList.get(0));
        assertEquals(2, myList.get(1));
        assertEquals(3, myList.get(2));
    }

    @Test
    public void testRemoveFirst() throws Exception {
        MyArrayList myList = new MyArrayList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        Object retval = myList.remove(0);
        assertEquals(1, retval);
        assertEquals(2, myList.get(0));
        assertEquals(3, myList.get(1));
    }

    @Test
    public void testRemoveMiddle() throws Exception {
        MyArrayList myList = new MyArrayList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        Object retval = myList.remove(1);
        assertEquals(2, retval);
        assertEquals(1, myList.get(0));
        assertEquals(3, myList.get(1));
    }

    @Test
    public void testRemoveLast() throws Exception {
        MyArrayList myList = new MyArrayList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        Object retval = myList.remove(2);
        assertEquals(3, retval);
        assertEquals(1, myList.get(0));
        assertEquals(2, myList.get(1));
    }

    @Test
    public void testRemoveFirstTwice() throws Exception {
        MyArrayList myList = new MyArrayList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.remove(0);
        myList.remove(0);
        assertEquals(3, myList.get(0));
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBoundsHigh() throws Exception {
        MyArrayList myList = new MyArrayList();
        myList.add(0);
        myList.get(1);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBoundsLow() throws Exception {
        MyArrayList myList = new MyArrayList();
        myList.get(-1);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testRemoveOutOfBoundsHigh() throws Exception {
        MyArrayList myList = new MyArrayList();
        myList.add(0);
        myList.remove(1);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testRemoveOutOfBoundsLow() throws Exception {
        MyArrayList myList = new MyArrayList();
        myList.get(-1);
    }
}