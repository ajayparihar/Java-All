package String;

/*
 * TC: O(n*m) where n = length of string s, m = length of part
 * SC: O(n) for StringBuilder to store the accumulated result
 */
public class RemoveAllOccurrences_Substring {
    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";

        System.out.println(removeOccurrences(s,part)); 
    }
    private static String removeOccurrences(String s, String part){
        // StringBuilder to accumulate the result after processing each character
        StringBuilder accumulatedString = new StringBuilder();
        int partLength = part.length();
        
        // Traverse through each character in the input string 's'
        for (int i = 0; i < s.length(); i++) {
            // Append the current character from the original string to the accumulated result
            accumulatedString.append(s.charAt(i));
            
            // Ensure the accumulated string is at least as long as the part we are looking to remove
            // and check if the last 'partLength' characters in the accumulated string match the target 'part'
            if (accumulatedString.length() >= partLength) {
                // Extract the last 'partLength' characters from the accumulated string
                String lastSegment = accumulatedString.substring(accumulatedString.length() - partLength);
                
                // If the last 'partLength' characters match the target 'part', remove them
                if (lastSegment.equals(part)) {
                    accumulatedString.delete(accumulatedString.length() - partLength, accumulatedString.length());
                }
            }
        }
        
        // Convert the accumulated result into a string and return it after all occurrences are removed
        return accumulatedString.toString();
    }
}
