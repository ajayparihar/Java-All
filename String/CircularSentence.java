package String;

public class CircularSentence {
    public static void main(String[] args) {
        String sentence = "Leetcode is cool";

        System.out.println(isCircularSentence(sentence));
    }

    /**
     * Checks if a sentence is circular (last char of each word matches first char of next word, and last char matches first char)
     * @param sentence The input sentence to check
     * @return true if the sentence is circular, false otherwise
     * Time Complexity: O(n) where n is the length of the input sentence
     * Space Complexity: O(1) as we only use constant extra space
     */
    public static boolean isCircularSentence(String sentence) {
        int length = sentence.length();

        if (sentence.isEmpty()) {
            return true;
        }

        if (sentence.charAt(0) != sentence.charAt(length - 1)) {
            return false;
        }

        for (int i = 1; i < length - 1; i++) {
            if (sentence.charAt(i) == ' ') {
                if (sentence.charAt(i - 1) != sentence.charAt(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }
}
