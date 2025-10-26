package Utils.stringUtil;

public class CaseConverter {
    public static String toSnakeCase(String str){
        String[] letters = str.split("");
        for(int i = 0; i < letters.length; i++){
           if(letters[i].equals(" ")){
               letters[i] = "_";
           }
        }
        return String.join("", letters);
    }
    public static String toCamelCase(String str){
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(i == 0){
                if(Character.isUpperCase(chars[0])){
                    chars[0] = Character.toLowerCase(chars[0]);
                    continue;
                }
            }
            else if(chars[i] == ' '){
                chars[i] = Character.toUpperCase(chars[i]);
            }
            else if(Character.isUpperCase(chars[i])){
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }
        return new String(chars);
    }
    public static String toPascalCase(String str){
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(Character.isUpperCase(chars[i])){
                chars[i] = Character.toLowerCase(chars[i]);
            }
            else if(Character.isLowerCase(chars[i])){
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return new String(chars);
    }
    public static String toKebabCase(String str){
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == ' '){
                chars[i] = '-';
            }
        }
        return new String(chars);
    }
}
