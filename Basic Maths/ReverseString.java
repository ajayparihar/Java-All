public class ReverseString {
    public static void main(String[] args) {
        String str = "Aja";
        System.out.println(isPalindrome(str));

    }

    /**
     * Checks if a string is a palindrome after removing non-alphanumeric characters
     * Time Complexity: O(n) where n is the length of the input string
     * Space Complexity: O(n) for storing the filtered string
     */
    static Boolean isPalindrome(String str) {
        String sortedString = str.replaceAll("[^a-zA-Z0-9]", "");
        return revString(sortedString).equals(sortedString);
    }

    /**
     * Reverses a string by iterating from end to start
     * Time Complexity: O(n) where n is the length of the input string
     * Space Complexity: O(n) for storing the reversed string
     */
    static String revString(String str) {
        String revString = "";
        for (int i = str.length() - 1; i > 0; i--) {
            char lastCharacter = str.charAt(i);
            revString = revString + lastCharacter;
        }
        return revString;
    }
}
