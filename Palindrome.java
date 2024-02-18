public class Palindrome {
    public static void main(String[] args) {
        String inputString = "radardd";

        if(palind(inputString))
        {
            System.out.println("Palindromic");
        }else{
            System.out.println("Non Palindromic");
        }
    }

    public static boolean palind(String str)
    {
        char[] ch = str.toCharArray();

        int lower = 0;
        int higher = ch.length - 1;

        while(lower < higher)
        {

            if(ch[lower] == ch[higher])
            {
                lower++;
                higher--;
            }else{
                return false;
            }
        }
        return true;
    }
}
