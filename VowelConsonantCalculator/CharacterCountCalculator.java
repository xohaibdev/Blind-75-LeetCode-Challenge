
public class CharacterCountCalculator {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        int[] stats = chCounter(inputString);


        System.out.println("vowels "+stats[0]);
        System.out.println("consonents "+stats[1]);

    }

    public static int[] chCounter(String str)
    {
        char[] ch =  str.toCharArray();
        int vowels = 0;
        int consonent = 0;

        for(char c: ch){
            if(c =='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                vowels++;
            }else{
                consonent++;
            }
        }

        return new int[]{vowels, consonent};
    }
}
