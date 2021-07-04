import java.util.Locale;

public class LongestPalidrome {

    private String adjustString(String s) {
        if (null == s) return null;
        String retval = "|";
        for (int x = 0; x < s.length(); x++) {
            retval += s.charAt(x);
            retval += '|';
        }
        return retval;
    }

    private String filterString(String s) {
        if (null == s) return null;
        String retval = "";
        s = s.toLowerCase();
        for (int x = 0; x < s.length(); x++) {
            if ((s.charAt(x) >= 'a') && (s.charAt(x) <= 'z')) {
                retval += s.charAt(x);
            }
        }
        return retval;
    }

    public String LongestPalidrome(String s) {
        if (null == s) return null;
        String text = filterString(s);
        text = adjustString(text);
        int center = 0;
        int radius = 0;
        int max_radius = 0;
        int max_center = 0;
        while (center < text.length()) {
            radius = 0;
            while ((center - (radius + 1) >= 0) && (center + (radius + 1) < text.length()) && (text.charAt(center - (radius + 1)) == text.charAt(center + (radius + 1)))) {
                radius++;
            }
            if (radius > max_radius) {
                max_radius = radius;
                max_center = center;
            }
            center++;
        }
        String retval = text.substring(max_center - max_radius, max_center + max_radius).replace("|", "");

        return retval;
    }
}
