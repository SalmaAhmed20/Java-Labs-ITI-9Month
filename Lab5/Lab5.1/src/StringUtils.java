import java.util.function.BiPredicate;

public class StringUtils {
    public static String betterString(String s1, String s2, BiPredicate<String, String> P) {
        if (s1 != null && s2 != null) {
            if (P.test(s1, s2)) {
                return s1;
            } else
                return s2;
        }
        return null;
    }

    public static void main(String[] args) {
        String string1= new String("Hello" );
        String string2= new String("welcome" );
        String longer = StringUtils .betterString(string1,string2,(s1,s2)-> string1.length() > string2.length());
        String first = StringUtils .betterString(string1,string2,(s1,s2)->true);
        System.out.println("longer "+longer);
        System.out.println("first "+first);

    }
}
