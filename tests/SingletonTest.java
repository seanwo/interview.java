import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void testGetInstance() throws Exception {
        Singleton a = Singleton.GetInstance();
        Singleton b = Singleton.GetInstance();
        assertEquals(a,b);
    }
}