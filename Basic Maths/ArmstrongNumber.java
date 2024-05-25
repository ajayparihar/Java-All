public class ArmstrongNumber {
    public static void main(String[] args) {

        int num = 371;
        // int num = 111;

        System.out.println(isArmstrongNumber(num));
    }

    static boolean isArmstrongNumber(int num) {
        int size = Integer.toString(num).length();
        // Integer converted to string then its length is taken
        int calculatedValue = 0;
        int originalNum = num;

        while (num > 0) {
            int rem = num % 10; // reminder of num i.e -> last digit
            calculatedValue = (int) (Math.pow(rem, size) + calculatedValue);
            // last digit with the power size is added to armNumber
            num = num / 10; // last digit removal
        }
        return calculatedValue == originalNum;
        // return calculatedValue == originalNum ? true : false;
    }
}