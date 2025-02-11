package String;

public class RemoveAllOccurrences_Substring_BruteForce2 {
    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";

        System.out.println(removeOccurrences(s,part)); 
    }

    private static String removeOccurrences(String s, String part){
        // Use StringBuilder for efficient string manipulation
        StringBuilder sb = new StringBuilder(s);
        
        // Iterate until no more occurrences of 'part' are found
        while (sb.indexOf(part) != -1) {
            int index = sb.indexOf(part);
            sb.delete(index, index + part.length());
        }
        
        // Return the modified string
        return sb.toString();
}
}
