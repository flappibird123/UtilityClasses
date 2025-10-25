package Utils.stringUtil;

public class StringPadder {
    public static String pad(String str, char padChar, int length, char option) {
        if(length == 0) {
            return str;
        }
        String added = String.valueOf(padChar).repeat(length);
        if(option == 'b'){
            return added + str;
        }
        else if(option == 'f'){
            return added + str + added;
        }
        else if(option == 'e'){
            return str + added;
        }
        else{
            return null;
        }
    }
}
