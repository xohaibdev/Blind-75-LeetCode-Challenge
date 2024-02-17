import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int[] result = productExceptSelf(nums);

        System.out.println("Result array: " + Arrays.toString(result));
    }

    public static int[] productExceptSelf(int[] nums)
    {
        int[] result  = new int[nums.length];


        int[] leftArray  = new int[nums.length];
        int[] rightArray  = new int[nums.length];

        int left = 1; 

        for(int i = 0; i < nums.length; i++)
        {
            leftArray[i] = left;
            left = left * nums[i];
        }

        int right = 1;
        for(int i = nums.length-1; i >= 0; i--)
        {
            rightArray[i] = right;
            right = right * nums[i];
        }

        for(int i = 0; i < nums.length; i++)
        {
            result[i] = leftArray[i]*rightArray[i];
        }

        return result;
    }
}
