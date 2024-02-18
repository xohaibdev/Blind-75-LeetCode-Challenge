import java.util.Arrays;

public class FirstNonRepeatedCharacterFinder {
    public static void main(String[] args) {
        String inpuString = "programming";
        inpuString = inpuString.toLowerCase();

        char uniqueFirst = chCount(inpuString);

        System.out.println("First non-repeating character is " + uniqueFirst);

    }

    public static char chCount(String inputString)
    {
        int[] ch = new int[256]; 
        Arrays.fill(ch, 0); 

        for (char c : inputString.toCharArray()) {
            ch[c]++;
        }

        for (char c : inputString.toCharArray()) {
            if (ch[c] == 1) {
                return c;
            }
        }

        return '\0';

    }
}
