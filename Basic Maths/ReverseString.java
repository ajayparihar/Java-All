public class ReverseString {
    public static void main(String[] args) {
        String str = "Aja";
        System.out.println(isPalindrome(str));

    }

    static Boolean isPalindrome(String str) {
        String sortedString = str.replaceAll("[^a-zA-Z0-9]", "");
        return revString(sortedString).equals(sortedString);
    }

    static String revString(String str) {
        String revString = "";
        for (int i = str.length() - 1; i > 0; i--) {
            char lastCharacter = str.charAt(i);
            revString = revString + lastCharacter;
        }
        return revString;
    }
}
