public class reverseString {
    public static void main(String[] args) {
        String name = "0P";
        System.out.println(isPalindrome(name));
    }

    public static boolean isPalindrome(String s) {
        String sortedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return reverseString(sortedString).equals(sortedString);
    }

    static String reverseString(String s) {
        return revCounter(s, s.length() - 1);
    }

    static String revCounter(String str, int index) {
        if (index < 0) {
            return "";
        }
        char lastCharacter = str.charAt(index);
        return lastCharacter + revCounter(str, index - 1);
    }
}