import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Variation2 {
    //what if we need to find all the unique pairs who's sum is equal to the target using two pointer approach?
    public static void main(String[] args) {
        int[] nums = {2, 2, 4, 5, 6, 6};
        int target = 8;

        List<int[]> answer = variationtwo(nums, target);

        if(!answer.isEmpty()){
            for(int[] pair: answer)
            {
                System.out.println(Arrays.toString(pair));
            }
        }else{
            System.err.println("no pairs found!");
        }
    }

    public static List<int[]> variationtwo(int[] nums, int target)
    {
        List<int[]> answer = new ArrayList<>();

        int left = 0;
        int right = nums.length -1;
        int[] prev = {};
        while(left < right)
        {
            int sum = nums[left] + nums[right];

            if(sum ==  target)
            {
                if(!Arrays.equals(prev, new int[]{nums[left], nums[right]}))
                {
                    answer.add(new int[]{nums[left], nums[right]});
                }
                prev = new int[]{nums[left], nums[right]};
                left++;
                right--;


            }else if(sum > target)
            {
                right--;
            }else if(sum < target){
                left++;
            }
        }
        return answer;
    }
}
