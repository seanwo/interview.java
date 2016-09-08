import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.*;

import static org.junit.Assert.*;

public class WordFrequencyTest {

    WordFrequency wf = new WordFrequency();

    @Test
    public void testWordFrequency() throws Exception {
        String input = "it was the best. it was the worst!";
        HashMap<String, Integer> expected= new HashMap<>();
        expected.put("it", 2);
        expected.put("the", 2);
        expected.put("was", 2);
        expected.put("best", 1);
        expected.put("worst",1);

        ArrayList<WordFrequency.FrequencyEntity> actual = wf.WordFrequency(input);

        int freqCount = Integer.MAX_VALUE;
        Iterator<WordFrequency.FrequencyEntity> it = actual.iterator();
        while(it.hasNext()){
            WordFrequency.FrequencyEntity fe = it.next();
            assertEquals(expected.get(fe.value).intValue(), fe.count.intValue());
            if (fe.count>freqCount) fail("list not in ascending order");
            freqCount=fe.count;
        }
    }

    @Test (expected = IllegalArgumentException.class)
    public void testWordFrequencyNull() throws Exception {
        wf.WordFrequency(null);
    }
}