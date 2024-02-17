import java.util.Arrays;
import java.util.HashMap;

public class Solution2{

    public static void main(String[] args)
    {
        // int[] nums = {2,7,11,15};
        // int target = 9;


        // int[] indexes = twoSum(nums, target);

        // for(int index: indexes)
        // {
        //     System.out.println(index);
        // }


        int[] nums2 = {3, 2, 4};
        int target2 = 9;
        int[] result2 = twoSum(nums2, target2);

        for(int index: result2)
        {
            System.out.println(index);
        }
    }

    public static int[] twoSum(int[] nums, int target)
    {
        Arrays.sort(nums);

        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        while(leftPointer < rightPointer)
        {
            if(nums[leftPointer] + nums[rightPointer] < target)
            {
                rightPointer--;
            }else if(nums[leftPointer] + nums[rightPointer] > target){
                leftPointer++;
            }else{
                return new int[]{leftPointer, rightPointer};
            }
        }

     
        return new int[]{-1, -1};
    }
}