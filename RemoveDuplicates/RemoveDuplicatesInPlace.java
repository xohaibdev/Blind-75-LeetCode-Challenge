import java.util.Arrays;

public class RemoveDuplicatesInPlace {
    public static void main(String[] args) {
        int[] ages = { 5, 2, 1, 5, 8, 5, 1, 7, 7, 0 };

        int uniqueElements = removeDp(ages);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(ages, uniqueElements)));
    }

    public static int removeDp(int[] ages)
    {
        Arrays.sort(ages);
        int uniq = 1;
        for(int i = 1; i < ages.length; i++)
        {
            if(ages[i] != ages[i-1])
            {
                ages[uniq] = ages[i];
                uniq++;
            }
        }
        return uniq;
    }
}
