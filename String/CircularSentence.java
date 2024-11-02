package String;

public class CircularSentence {
    public static void main(String[] args) {
        String sentence = "Leetcode is cool";

        System.out.println(isCircularSentence(sentence));
    }

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
