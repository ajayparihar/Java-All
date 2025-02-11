package String;

/*
 * TC: O(n) - where n is length of string s, for string concatenation and contains operation
 * SC: O(n) - for storing the concatenated string twoS
 */
public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        System.out.println(rotateString(s, goal));        
    }

    public static boolean rotateString(String s, String goal){
        String twoS = s+s;

        return twoS.contains(goal);
    }
}