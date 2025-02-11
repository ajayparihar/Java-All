package String;

/*
 * TC: O(n) - single pass through the string comparing adjacent characters
 * SC: O(1) - only uses a counter variable regardless of input size
 */
public class MinChangestoMakeBeautifulString {
    public static void main(String[] args) {
        String s = "1001";
        System.out.println(changeCount(s));
    }

    public static int changeCount(String s){
        int changeCount = 0;

        for (int i = 0; i < s.length() - 1; i += 2) {
            if(s.charAt(i) != s.charAt(i + 1)){
                changeCount++;
            }
        }
        return changeCount;
    }
}
