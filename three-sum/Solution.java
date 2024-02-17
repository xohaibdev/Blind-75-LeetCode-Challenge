import java.util.*;

public class Solution {

    //three sum example using two pointers approach
    public static void main(String[] args) {
        
        int[] nums = {-1,0,1,2,-1,-4};
        List<int[]> answer = threeSum(nums);
        
        if(!answer.isEmpty())
        {
            for(int[] pairs: answer)
            {
                System.out.println(Arrays.toString(pairs));
            }
        }else{

            System.out.println("No pairs found");

        }
    } 
    
    public static List<int[]> threeSum(int[] nums) {
        
        List<int[]> answer = new ArrayList<>();
        Arrays.sort(nums);
        int[] prev = null;
        for(int i = 0; i < nums.length; i++)
        {
            int lower = i + 1; 
            int higher = nums.length-1;
            
            while(lower < higher)
            {
                if( (nums[i] + nums[lower] + nums[higher]) < 0)
                {
                    lower++;
                }else if((nums[i] + nums[lower] + nums[higher]) > 0)
                {
                    higher--;
                }else{
                    int[] current = new int[]{nums[i], nums[lower], nums[higher]};
                    if(!Arrays.equals(current,prev))
                    {
                        answer.add(current);
                    }
                    prev = current;
                    lower++;
                    higher--;
                }
            }
        }
        return answer;
    }
}
