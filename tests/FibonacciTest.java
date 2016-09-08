import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    Fibonacci f = new Fibonacci();

    @Test
    public void testFibonacci0() throws Exception {
        Integer expected[] = {};
        assertArrayEquals(expected, f.Fibonacci(0));
    }

    @Test
    public void testFibonacci1() throws Exception {
        Integer expected[] = {0};
        assertArrayEquals(expected, f.Fibonacci(1));
    }

    @Test
    public void testFibonacci2() throws Exception {
        Integer expected[] = {0,1};
        assertArrayEquals(expected, f.Fibonacci(2));
    }

    @Test
    public void testFibonacci3() throws Exception {
        Integer expected[] = {0,1,1};
        assertArrayEquals(expected, f.Fibonacci(3));
    }

    @Test
    public void testFibonacci10() throws Exception {
        Integer expected[] = {0,1,1,2,3,5,8,13,21,34};
        assertArrayEquals(expected, f.Fibonacci(10));
    }
}