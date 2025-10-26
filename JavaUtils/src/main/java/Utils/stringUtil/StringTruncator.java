package Utils.stringUtil;

public class StringTruncator {
    public static String truncate(String str, int length) {
        if(str.length() <= length){
            return str;
        }
        else if(str.length() > length){
            return str.substring(0, length);
        }
        else{
            return str;
        }

    }
}
