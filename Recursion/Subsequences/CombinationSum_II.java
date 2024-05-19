package Subsequences;
import java.util.*;

// can take the element for only once and the satisfied subsets should be in lexographical order
public class CombinationSum_II {

    static void func(int index,int[] a,int target,ArrayList<Integer> al,HashSet<ArrayList<Integer>> res)
    {
        if(index==a.length)
        {
            if(target==0)
            {
                res.add(new ArrayList<>(al));
            }
            return;
        }

        // take
        if(target>=a[index])
        {
            al.add(a[index]);
            func(index,a,target-a[index],al,res);
            al.remove(al.size()-1);
        }

        // not take
        func(index+1,a,target,al,res);
    }
    public static void main(String[] args) {
        int[] a={2,3,1,7};
        Arrays.sort(a);

        int target=7;
        ArrayList<Integer> al=new ArrayList<>();
        HashSet<ArrayList<Integer>> res=new HashSet<>();
        func(0,a,target,al,res);

        System.out.println(res);
    }
}
