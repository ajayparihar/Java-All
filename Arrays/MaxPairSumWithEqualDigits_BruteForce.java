package Arrays;

public class MaxPairSumWithEqualDigits_BruteForce {
public static void main(String[] args) {
    int[] nums = {18,43,36,13,7};

    System.out.println(maximumSum(nums));
}

static int maximumSum(int[] nums){
    int[] sumOfNum = new int[nums.length];
        int index = 0;
        for(int i : nums){
            sumOfNum[index] = sumOfDigits(i);
            index++;
        }
        int maxSum = 0;
        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(sumOfNum[i] == sumOfNum[j]){
                    counter++;
                    maxSum = Math.max(maxSum, nums[i] + nums[j]);
                }
            }
        }
        if(counter == 0){
            return -1;
        }
        return maxSum;
    }
static int sumOfDigits(int num){
      int sum = 0;
      while(num > 0) {
        sum += num % 10;
        num /= 10;
      } 
      return sum;
}
}
