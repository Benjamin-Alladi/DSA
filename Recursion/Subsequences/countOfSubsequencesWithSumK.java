package Subsequences;
import java.util.*;

class countOfSubsequencesWithSumK{

    static int func(int ind,int[] a,ArrayList<Integer> al,int sum,int targetSum)
    {
        if(ind==a.length)
        {
            if(sum==targetSum)
            {
                return 1;
            }
            return 0;
        }

        sum+=a[ind];
        al.add(a[ind]);
        int taken=func(ind+1, a, al, sum, targetSum);

        sum-=al.get(al.size()-1);
        al.remove(al.size()-1);
        int notTaken=func(ind+1, a, al, sum, targetSum);

        return taken+notTaken;
    }
    
    public static void main(String[] args){

        int[] a={1,2,1};
        int count=func(0,a,new ArrayList<>(),0,2);
        System.out.println(count);
    }
}
