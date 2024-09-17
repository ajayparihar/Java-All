package Arrays;

public class LemonadeChange {
  public static void main(String[] args) {
    int[] bills = { 5, 5, 5, 10, 20 };
    boolean result = lemonadeChange(bills);

    System.out.println(result);
  }

  static boolean lemonadeChange(int[] bills) {
    int countOfFive = 0;
    int countOfTen = 0;

    for (int bill : bills) {
      if (bill == 5) {
        countOfFive++;
      } else if (bill == 10) {
        if (countOfFive == 0) {
          return false;
        }
        countOfFive--;
        countOfTen++;
      } else {
        if (countOfTen > 0 && countOfFive > 0) {
          countOfTen--;
          countOfFive--;
        } else if (countOfFive >= 3) {
          countOfFive -= 3;
        } else {
          return false;
        }
      }
    }
    return true;
  }
}
