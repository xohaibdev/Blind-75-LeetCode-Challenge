import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silentdd";

        if(anagramString(str1, str2))
        {
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams!");
        }

        
    }

    public static boolean anagramString(String str1, String str2)
    {
        if(str1.length() != str2.length()){
            return false;
        }

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1, ch2))
        {
            return true;
        }
        return false;


    }
}
