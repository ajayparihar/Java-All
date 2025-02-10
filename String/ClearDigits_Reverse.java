package String;

public class ClearDigits_Reverse {

    public static void main(String[] args) {
        // Sample input string
        String input = "abc123xyz45";
        
        // Call the function to clear digits and reverse the string
        System.out.println(clearDigits(input));

    }

    /**
     * This method removes the digits from the input string and reverses the remaining characters.
     * @param s The input string from which digits need to be removed and the remaining part reversed
     * @return A string with digits removed and the remaining characters reversed
     */
    private static String clearDigits(String s) {
        // StringBuilder to store the result of non-digit characters
        StringBuilder result = new StringBuilder();
        
        // Counter to track consecutive digits
        int digit_counter = 0;

        // Iterate through the string from the end to the beginning (reverse order)
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            
            // Check if the current character is a digit
            if (isDigit(currentChar)) {
                digit_counter++;  // Increment the counter if it's a digit
                continue; // Skip adding this digit to the result
            } else {
                // If no digits were skipped, add the character to the result
                if (digit_counter == 0) {
                    result.append(currentChar);
                } else {
                    digit_counter--;  // Reduce the counter after processing a non-digit
                }
            }
        }

        // Reverse the collected characters and return as a string
        return result.reverse().toString();
    }

    /**
     * Helper method to check if a character is a digit.
     * @param c The character to check
     * @return true if the character is a digit, false otherwise
     */
    private static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }
}
