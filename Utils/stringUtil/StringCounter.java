package Utils.stringUtil;

public class StringCounter {
    public static int countChars(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        return count;
    }
    public static int countWords(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
}
