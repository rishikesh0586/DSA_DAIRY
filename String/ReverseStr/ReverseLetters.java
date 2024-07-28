package ReverseStr;

public class ReverseLetters {
    public static String reverseLetters(String text) {
        String[] words = text.split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (String word : words) {
            reversed.append(new StringBuilder(word).reverse()).append(" ");
        }
        //in javascript
        // return str.split(' ').map(word => word.split('').reverse().join('')) .join(' ');

        return reversed.toString().trim();
    }

    public static void main(String[] args) {
        String text = "ram is mad";
        String result = reverseLetters(text);
        System.out.println(result); // Output: mar si dam
    }
}
