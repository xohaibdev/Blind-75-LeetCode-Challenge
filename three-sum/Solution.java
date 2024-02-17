import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> answer = threeSum(nums);
        
    } 
    
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();

        if(nums.length < 3)
        {
            return answer;
        }
        for(int i = 0; i < nums.length; i++)
        {
            int pivot = nums[i];

            for(int inner = i+1; inner < nums.length; inner++)
            {
                int lower = inner; 
                int higher = nums.length-1;

                while(lower < higher)
                {
                    if( (pivot + nums[lower] + nums[higher]) < 0)
                    {
                        lower++;
                    }else if((pivot + nums[lower] + nums[higher]) > 0)
                    {
                        higher--;
                    }else{
                        answer.add(Arrays.asList(pivot, nums[lower], nums[higher]));
                    }
                }
            }
        }
        return answer;
    }
}
