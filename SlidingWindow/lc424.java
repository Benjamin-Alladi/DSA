package SlidingWindow;
import java.util.*;

/*
 You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
Return the length of the longest substring containing the same letter you can get after performing the above operations.

Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.
Example 2:

Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.

s =
"ABCDE"
k =
1
Output
2
Expected
2
*/
public class lc424
{
	public static void main(String[] args) {
	    String str= "ABCCAA";
	    int k=2;
	    HashMap<Character,Integer> h= new HashMap<>();
        int i=0,j=0,ml=0,max=0;

        while(j<str.length())
        {
            char ch= str.charAt(j);
            h.put(ch, h.getOrDefault(ch,0)+1);

            max= Math.max(max, h.get(ch));
            while((j-i+1)-max>k)
            {
                h.put(str.charAt(i), h.get(str.charAt(i))-1);
                if(h.get(str.charAt(i))==0)
                {
                    h.remove(str.charAt(i));
                }
                max= Collections.max(h.values());
                i++;
            }

            
            ml= Math.max(ml, j-i+1);
            
            j++;
        }
        System.out.println(ml);
    }
}
