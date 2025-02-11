package String;

public class RemoveAllOccurrences_Substring_BruteForce {
    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";

        System.out.println(removeOccurrences(s,part)); 
    }

    private static String removeOccurrences(String s, String part){
        while(s.contains(part)){
            s = s.replace(part, "");
        }
        return s;
    }
}
