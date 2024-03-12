package BinarySearch;

public class SingleElement {
    public static int singleNonDuplicate(int[] nums) {
        if(nums.length==1 || nums[0]!=nums[1])
        {
            return nums[0];
        }
        if(nums[nums.length-1]!=nums[nums.length-2])
        {
            return nums[nums.length-1];
        }
        int l=1,h=nums.length-2;
        while(l<=h)
        {
            int m= (l+h)>>1;
            if(nums[m]!=nums[m+1] && nums[m]!=nums[m-1])
            {
                return nums[m];
            }

            if(m%2==1 && nums[m]==nums[m-1])
            {
                l=m+1;
            }
            else if(m%2==0 && nums[m]==nums[m+1])
            {
                l=m+2;
            }
            else
            {
                h=m-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[]{3,3,7,7,10,11,11}));
    }
}