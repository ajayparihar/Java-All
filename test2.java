
class Test2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int max = a > b ? a : b;
        int min = (a + b) - max;

        for (int i = min; i >= 1; i--) {
            int mini = min % i;
            int maxi = max % i;
            if ((mini == 0) && (maxi == 0)) {
                System.out.println(i);
                break;
            }
        }
    }

}