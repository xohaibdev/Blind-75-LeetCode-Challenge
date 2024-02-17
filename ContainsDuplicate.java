import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        if(containsDuplicate(nums))
        {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    public static boolean containsDuplicate(int[] nums)
    {
        HashSet<Integer> unique =  new HashSet<>();

        for(int i = 0; i < nums.length; i++)
        {
            if(unique.contains(nums[i]))
            {
                return true;   
            }
            unique.add(nums[i]);
        }

        return false;
    }
    
}
