public class printNTo1 {
    public static void main(String[] args) {
        printNTo1 obj = new printNTo1();
        int n = 5;
        obj.printNos(n);
    }

    void printNos(int n) {
        if (n <= 0) {
            return;
        } else {
            System.out.print(n + " ");
            printNos(n - 1);
        }
    }
}
