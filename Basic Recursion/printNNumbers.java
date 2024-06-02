public class printNNumbers {
    public static void main(String[] args) {
        System.out.println("Main");

        int N = 5;
        int neNum = increaseNumByOne(N);
        if (neNum > N) {
            return;
        }
        System.out.print(neNum);
    }

    static int increaseNumByOne(int N) {
        int result = 1;
        result++;
        return result;
    }

}
