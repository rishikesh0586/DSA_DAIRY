package ReverseStr;
public class ReverseWords {
    
        public static String reverseWords(String s) {
            String[] words = s.trim().split("\\s+");
            StringBuilder reversed = new StringBuilder();
    
            for (int i = words.length - 1; i >= 0; i--) {
                reversed.append(words[i]).append(" ");
            }
    // Javascript code for the above approach
    // let text= "i like this program very much";
    // let str = text.split(" ").reverse().join(" ");

            return reversed.toString().trim();
        }
    
        public static void main(String[] args) {
            String str1 = "  the sky is blue  ";
            String str2 = "a good   example";
    
            System.out.println(reverseWords(str1)); // Output: blue is the sky
            System.out.println(reverseWords(str2)); // Output: example   good a
        }
    }
    