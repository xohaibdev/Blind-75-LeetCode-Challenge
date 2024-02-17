import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Variation {
    //what if we need to find all the pairs who's sum is equal to the target using two pointer approach?

    public static void main(String[] args) {
        int[] nums = {2, 2, 4, 5, 6, 6};
        int target = 8;
        List<int[]> answer = variation(nums, target);

        if(!answer.isEmpty())
        {
            for(int[] pair: answer)
            {
                System.out.println("result arrays are "+Arrays.toString(pair));
            }
        }

    }

    public static List<int[]> variation(int[] nums, int target)
    {
        List<int[]> answer = new ArrayList<>();

        int left = 0;
        int right = nums.length-1;

        while(left < right)
        {
            if(nums[left] + nums[right] == target)
            {
                answer.add(new int[]{nums[left], nums[right]});
                left++;
                right--;

            }else if((nums[left] + nums[right]) < target){

                left++;

            }else if((nums[left] + nums[right]) > target){

                right--;

            }
        }

        return answer;
    }
}
