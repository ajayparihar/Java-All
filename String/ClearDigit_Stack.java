package String;

import java.util.Stack;

/**
 * This class provides a method to clear digits from a string and reverse the remaining characters.
 * 
 * Time Complexity: O(n) - where n is the length of the input string
 * Space Complexity: O(n) - for the stack and the StringBuilder
 */
public class ClearDigits_Stack {

    public static void main(String[] args) {
        // Sample input string
        String input = "abc12";

        // Call the function to clear digits and reverse the string
        System.out.println(clearDigits(input));
    }

    /**
     * This method removes digits from the input string and returns the reversed result.
     * 
     * @param s the input string
     * @return the string with digits removed and characters reversed
     */
    private static String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        
        // Iterate over each character in the string
        for (char ch : s.toCharArray()) {
            // Skip digits
            if (ch >= '0' && ch <= '9') {
                continue;
            }
            // Push non-digit characters onto the stack
            st.push(ch);
        }
        
        StringBuilder sb = new StringBuilder();
        
        // Pop characters from the stack and append to StringBuilder
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        
        // Reverse the StringBuilder to get the final result
        return sb.reverse().toString();
    }
}
