package String;

public class IntegerToEnglishWords {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(numberToWords(num));
    }

    private static final String[] ONES = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
            "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] TENS = {
            "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    private static final String[] THOUSANDS = { "", "Thousand", "Million", "Billion" };

    static String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        int index = 0;
        String words = "";

        while (num > 0) {
            if (num % 1000 != 0) {
                words = convertLessThanThousand(num % 1000) + THOUSANDS[index] + " " + words;
            }
            num /= 1000;
            index++;
        }

        return words.trim();
    }

    static String convertLessThanThousand(int num) {
        if (num == 0) {
            return "";
        } else if (num < 20) {
            return ONES[num] + " ";
        } else if (num < 100) {
            return TENS[num / 10] + " " + convertLessThanThousand(num % 10);
        } else {
            return ONES[num / 100] + " Hundred " + convertLessThanThousand(num % 100);
        }
    }
}
