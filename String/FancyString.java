package String;

public class FancyString {
    public static void main(String[] args) {
        String s = "leeetcode";

        System.out.println(makeFancyString(s));
    }

    /**
     * Makes a string fancy by removing characters that appear more than two times consecutively
     * @param s The input string to make fancy
     * @return The fancy string where no character appears more than two times consecutively
     * Time Complexity: O(n) where n is the length of the input string
     * Space Complexity: O(n) for storing the result in StringBuilder
     */
    private static String makeFancyString(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        StringBuilder fancyString = new StringBuilder();
        int consecutiveCount = 1;

        fancyString.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            char previousChar = s.charAt(i - 1);

            if (currentChar == previousChar) {
                consecutiveCount++;
            } else {
                consecutiveCount = 1;
            }

            if (consecutiveCount < 3) {
                fancyString.append(currentChar);
            }
        }

        return fancyString.toString();
    }

}
