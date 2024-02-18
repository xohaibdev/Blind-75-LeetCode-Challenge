import java.util.Stack;

public class ReverseStringV2 {
    public static void main(String[] args) {
        String org = "Hello World!";

        System.out.println("original string "+org);
        System.out.println("Reversed using  stack string "+reversedUsingStack(org));

    }

    public static String reversedUsingStack(String str)
    {
        Stack<Character> chStack =  new Stack<>();

        for(char ch: str.toCharArray())
        {
            chStack.push(ch);
        }
        StringBuilder reversedStringBuilder = new StringBuilder();
        
        while(!chStack.isEmpty())
        {
            reversedStringBuilder.append(chStack.pop());
        }

        return reversedStringBuilder.toString();
    }
}
