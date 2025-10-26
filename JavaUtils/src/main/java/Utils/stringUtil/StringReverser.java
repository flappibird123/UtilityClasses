package Utils.stringUtil;

public class StringReverser {
    public static String reverse(String str) {
        if (str == null) {
            return null;
        }
        int len = str.length();
        if (len == 0) {
            return str;
        }
        char[] chars = str.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}
