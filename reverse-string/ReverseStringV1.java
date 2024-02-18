

public class ReverseStringV1 {
    public static void main(String[] args) {
        String originalString = "Hello, World!";

        System.out.println("Original String "+originalString);
        System.out.println("Reversed String "+reverseStringPointerApproach(originalString));

    }

    public static String reverseStringPointerApproach(String str){
        
        char[] charArray = str.toCharArray();
        
        int lower = 0;
        int higher = charArray.length - 1;

        while(lower <= higher)
        {
            swap(charArray, lower, higher);
            lower++;
            higher--;
        }

        return new String(charArray);
        
    }

    public static void swap(char[] ch, int lower, int higher){

        char temp = ch[lower];

        ch[lower] = ch[higher];

        ch[higher] = temp;

    }
}
