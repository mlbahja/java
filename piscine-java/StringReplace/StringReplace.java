
public class StringReplace{
    public static String replace(String s, String target, String replacement){
        return s.replaceAll(target, replacement);
    }
    public static String replace(String s, char target, char replacement){
        return s.replace(target, replacement);
    }
}