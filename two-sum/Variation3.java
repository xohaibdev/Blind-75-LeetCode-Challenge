import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Variation3 {
    //what if we need to find all the  pairs who's sum is equal to the target using HashMap approach?
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

        HashMap<Integer, Integer> hM =  new HashMap<>();


        int[] prev = {};
        
        for(int i =0; i<nums.length; i++)
        {
            int sum = target - nums[i];

            if(hM.containsKey(sum))
            {
                if(!Arrays.equals(new int[]{hM.get(sum),i}, prev))
                {
                    answer.add(new int[]{hM.get(sum),i});
                }
                
                prev = new int[]{hM.get(sum),i};
            }else {
                hM.put(nums[i], i);
            }
           
        }

        return answer;
    }
}
