import java.util.*;

public class Solution2 {

    //three sum example using hash table approach
    public static void main(String[] args) {
        
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int target = 0;
        List<int[]> result = threeSum(nums, target);

        for (int[] triplet : result) {
            System.out.println("Result triplet: " + Arrays.toString(triplet));
        }
    } 
    
    public static List<int[]> threeSum(int[] nums, int target) {
        List<int[]> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            HashMap<Integer,Integer> seen = new HashMap<>();
            int currentTarget = target - nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                
                int complement = currentTarget - nums[j];

                if (seen.containsKey(complement)) {

                    result.add(new int[]{nums[i], nums[seen.get(complement)], nums[j]});
                }else{
                    seen.put(nums[j],j);
                }

                
            }
        }

        return result;
    }
}
