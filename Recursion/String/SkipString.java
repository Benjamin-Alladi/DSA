package String;

public class SkipString {

    static String skipString(String s, String t)
    {
        if(s.isEmpty())
        {
            return "";
        }
        else
        {
            if(s.startsWith(t))
            {
                return skipString(s.substring(1),t);
            }
            else
            {
                return s.charAt(0)+skipString(s.substring(1),t);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(skipString("Raining in Indore", "in"));
    }
}
