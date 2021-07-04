import java.util.HashMap;
import java.util.Random;
import java.util.Stack;
import java.util.concurrent.ThreadLocalRandom;

public class TinyURL {

    final String domain = "mytinyurl.com";
    final int maxSeeds = 100;
    Stack<Long> seeds = new Stack<>();
    HashMap<String, String> map = new HashMap<>();
    final int base = 62; //DO NOT Exceed (0:9)10+(A:Z)26+(a:z)26=62
    final int maxchars = 6;

    TinyURL(int seedCount) {
        if (seedCount>maxSeeds) seedCount = maxSeeds;
        Random rand = new Random();
        int count = 0;
        while (count < seedCount) {
            long val = ThreadLocalRandom.current().nextLong((long) Math.pow(base, maxchars));
            if (seeds.contains(val)) continue;
            seeds.add(val);
            count++;
        }
    }

    private String seedToAlpha(long seed) {
        if (base > 62) return null;
        if (base <= 36) return Long.toString(seed, base);

        String retval = "";
        while (seed > 0) {
            long val = seed % base;
            if (val < 10) {
                retval += (char) ('0' + val);
            } else if ((val >= 10) && (val < 36)) {
                retval += (char) ('A' + (val - 10));
            } else {
                retval += (char) ('a' + (val - 36));
            }
            seed /= base;
        }
        return retval;
    }

    public String create(String url) {
        if (seeds.empty()) return null;

        long seed = seeds.pop();
        String tinyURL = seedToAlpha(seed);
        tinyURL = "http://" + domain + "/" + tinyURL + "/";
        map.put(tinyURL, url);
        return tinyURL;
    }

    public String lookup(String url) {
        return map.get(url);
    }

}
