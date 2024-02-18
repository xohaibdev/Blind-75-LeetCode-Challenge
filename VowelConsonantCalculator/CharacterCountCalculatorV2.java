public class CharacterCountCalculatorV2 {
    public static void main(String[] args) {
        String inputString = "Hello, World! 123";

        int[] stats = chCounter(inputString);

        System.out.println("Numeric "+stats[1]);
        System.out.println("Alphabets "+stats[0]);

    }

    public static int[] chCounter(String str)
    {
        int numeric = 0;
        int alph = 0;


        for(char ch: str.toCharArray())
        {
            if(isLetter(ch))
            {
                alph++;
            }else if(isNumeric(ch)){
                numeric++;
            }
        }
       
        return new int[]{alph,numeric};

    }

    public static boolean isLetter(char ch)
    {
        if( (ch >= 'a' && ch <= 'z' )|| (ch >= 'A' && ch <= 'Z') )
        {
            return true;
        }
        return false;
    }

    public static boolean isNumeric(char ch)
    {
        if( (ch >= '0' && ch <= '9' ))
        {
            return true;
        }

        return false;
    }
}
