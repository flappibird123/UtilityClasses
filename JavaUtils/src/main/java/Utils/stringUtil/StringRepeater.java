package Utils.stringUtil;

public class StringRepeater {
    public static String repeat(String str, int count) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("str is null or empty");
        }
        if (count <= 0) {
            throw new IllegalArgumentException("count <= 0");
        }
        return str.repeat(count);
    }
}
