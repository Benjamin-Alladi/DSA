package Sorting;
import java.util.*;

class MergeSort{
    public static void ms(int[] a,int l,int h)
    {
        // single element
        if(l>=h)
        {
            return;
        }
        else
        {
            // Finding Mid to divide the array into two subarrays each-time
            int m= l+(h-l)/2;
            // Dividing left or right array into subarrays until we get a single element or l==h
            ms(a,l,m);
            ms(a,m+1,h);

            // Sorting
            merge(a,l,m,h);
        }
    }
    
    public static void merge(int[] a,int l,int m,int h)
    {
        // comparing elements of left and right subarrays and storing them in scending order
        ArrayList<Integer> al= new ArrayList<>();

        // Index of the First elements of both subarrays.
        int i=l;
        int j=m+1;
        while(i<=m && j<=h)
        {
            if(a[i]<=a[j])
            {
                al.add(a[i]);
                i++;
            }
            else
            {
                al.add(a[j]);
                j++;
            }
        }

        // Adding left array elements if right array is exhausted
        while(i<=m)
        {
            al.add(a[i]);
            i++;
        }

        // Adding right array elements if right array is exhausted
        while(j<=h)
        {
            al.add(a[j]);
            j++;
        }


        // Placing the sorted elements strored in ArrayList back in the Array
        for(int ind=l;ind<=h;ind++)
        {
            a[ind]= al.get(ind-l);
        }
    }
    public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
     int[] a={1,2,1,-4,6,3,10,100};
     ms(a,0,a.length-1);
     System.out.println(Arrays.toString(a));
     sc.close();
    }
}