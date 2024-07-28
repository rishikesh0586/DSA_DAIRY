package ReverseStr;


//package ReverseStr;

/**
 * ReverseString
 */
 public class ReverseString {
    public static String reverse(String str) {
        //StringBuilder sb = new StringBuilder(str);
        //sb.reverse();  direct method and more efficient
        
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        
        while (left < right) {
            // Swap characters at left and right pointers
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            
            // Move pointers towards the center
            left++;
            right--;
        }
        return new String(charArray);
        //here .toString() method not worked so use string constrructor
    }

    public static void main(String[] args) {
        String str= "random";
        System.out.println(reverse(str));
    }
    
}