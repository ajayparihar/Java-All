public class print1ToN {
    public static void main(String[] args) {
        print1ToN obj = new print1ToN();
        int n = 5;
        obj.printNos(n);
    }

    void printNos(int n) {
        if (n <= 0) {
            return;
        } else {
            printNos(n - 1);
            System.out.print(n + " ");
        }
    }
}