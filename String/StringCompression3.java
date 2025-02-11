package String;

/*
 * TC: O(n) - single pass through the string where n is length of input string
 * SC: O(n) - for StringBuilder to store compressed string in worst case
 */
public class StringCompression3 {
    public static void main(String[] args) {
        String word = "aaaaaaaaaaaaaabb";

        System.out.println(compressedString(word));
    }

    public static String compressedString(String word){
        int size = word.length();
        int count = 1;
        int index = 1;

        StringBuilder finalString = new StringBuilder();

        while(index < size){

            if(count == 9 || word.charAt(index) != word.charAt(index - 1)){
                finalString.append(count);
                finalString.append(word.charAt(index - 1));
                count = 1;
                index++;
                continue;
            }

            if(word.charAt(index) == word.charAt(index - 1)){
                count++;
                index++;
            }
        }

        finalString.append(count);
        finalString.append(word.charAt(size - 1));

        return finalString.toString();
    }
}
