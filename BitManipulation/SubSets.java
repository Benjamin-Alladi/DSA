import java.util.*;

public class SubSets {

    public static ArrayList subsets(int[] a)
    {
        ArrayList<ArrayList<Integer>> r= new ArrayList<>();

        for(int i=0;i<Math.pow(2,a.length);i++)
        {
            ArrayList<Integer> al= new ArrayList<>();
            for(int n=0;n<32;n++)
            {
                if(((i&(1<<n))>>n)==1)
                {
                    al.add(a[n]);
                }
            }
            r.add(al);
        }
        return r;
    }
    public static void main(String[] args) {
        int[] a= new int[] {1,2,3};
        ArrayList<ArrayList<Integer>> r= subsets(a);
        System.out.println("Subsets of "+" "+Arrays.toString(a)+" are:");
        System.out.println(r);
    }
}
