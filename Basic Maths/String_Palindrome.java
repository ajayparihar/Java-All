public class String_Palindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }

    /**
     * Checks if a string is palindrome after removing non-alphanumeric characters and converting to lowercase
     * @param str The string to check
     * @return true if the string is palindrome, false otherwise
     * Time Complexity: O(n) where n is the length of the input string
     * Space Complexity: O(n) for storing the filtered string
     */
    static Boolean isPalindrome(String str) {
        String finalStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (finalStr.length() == 0 || finalStr.length() == 1) {
            return true;
        }

        for (int i = 0; i < finalStr.length() / 2; i++) {
            if (finalStr.charAt(i) != finalStr.charAt(finalStr.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    // Brute Force Method

    // static Boolean isPalindrome(String str) {
    // String sortedString = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    // return revString(sortedString).equals(sortedString);
    // }

    // static String revString(String str) {
    // String revString = "";
    // for (int i = str.length() - 1; i >= 0; i--) {
    // char lastCharacter = str.charAt(i);
    // revString = revString + lastCharacter;
    // }
    // return revString;
    // }

}
