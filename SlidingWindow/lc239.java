package SlidingWindow;
import java.util.*;

public class lc239{
    public static int[] msw(int[] nums, int k)
    {
        int[] r= new int[nums.length-k+1];
        TreeMap<Integer,Integer> t= new TreeMap<>();
        int i=0,j=0,ind=0;

        while(j<nums.length)
        {
            t.put(nums[j],j);
            // System.out.println(t.toString());
            // [1,3,1,2,0,5]
            if(j-i+1==k)
            {
                r[ind++]= t.lastKey();
                if(t.get(nums[i])==i)
                {
                    t.remove(nums[i]);
                    // System.out.println(t.toString());
                    i++;
                }
                else
                {
                    i++;
                }
                // System.out.println(Arrays.toString(r));
            }
            j++;
        }
        return r;
    }
    
    public static void main(String... args)
    {
        System.out.println(Arrays.toString(msw( new int[]{1,3,1,2,0,5}, 3)));
    }
}

