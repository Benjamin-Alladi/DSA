package Strings;

class SkpCharacter{

    // Parametric Recursion
    static void skipCharacter(String s,String r)
    {
        if(s=="")
        {
            System.out.println(r);
            return;
        }
        
        char ch=s.charAt(0);
        if(ch!='a')
        {
            r+=ch;
        }
        skipCharacter(s.substring(1),r);
    }

    // Functional Recursion
    static String skipChar(String s)
    {
        if(s=="")
        {
            return "";
        }
        String res="";
        if(s.charAt(0)!='a')
        {
            res+= s.charAt(0);
        }
        return res+skipChar(s.substring(1));
    }

    public static void main(String[] args) {
        skipCharacter("baccahdah","");
        skipCharacter("bacccaad","");

        System.out.println(skipChar("baccahdah"));
        System.out.println(skipChar("bacccaad"));
    }
}