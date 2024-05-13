import java.util.Arrays;

public class ArrayReverse {

    static void reverse(int[] a,int i)
    {
        if(i==a.length/2)
        {
            return;
        }
        int temp=a[i];
        a[i]=a[a.length-1-i];
        a[a.length-1-i]=temp;

        reverse(a,i+1);
    }

    static boolean isPalindrome(String s,int i)
    {
        if(i==s.length()/2)
        {
            return true;
        }
        if(s.charAt(i)==s.charAt(s.length()-1-i))
        {
            return isPalindrome(s,i+1);
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        int[] a={1,10,6,5};
        reverse(a,0);
        System.out.println(Arrays.toString(a));

        System.out.println(isPalindrome("madam",0));
        System.out.println(isPalindrome("nice",0));
    }
}
