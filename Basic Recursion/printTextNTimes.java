public class printTextNTimes {
    public static void main(String[] args) {
        printTextNTimes obj = new printTextNTimes();
        int n = 5;
        obj.printNTimes(n);
    }

    void printNTimes(int n) {
        if (n <= 0) {
            return;
        }
        System.out.print("Ajay ");
        printNTimes(n - 1);
    }
}
