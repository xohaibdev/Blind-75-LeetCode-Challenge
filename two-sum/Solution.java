import java.util.Arrays;
import java.util.HashMap;

public class Solution{

    public static void main(String[] args)
    {

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum(nums2, target2);
        for(int index: result2)
        {
            System.out.println(index);
        }
    }

    public static int[] twoSum(int[] nums, int target)
    {

        HashMap<Integer, Integer> hM =  new HashMap<Integer, Integer>();

        for(int i =0; i< nums.length; i++)
        {
            int complement = target-nums[i];

            if(hM.containsKey(complement))
            {
                return new int[]{hM.get(complement), i};
            }else{
                hM.put(nums[i], i);
            }
        }

        return new int[]{};
    }
}