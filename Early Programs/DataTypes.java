import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char str = sc.nextLine().charAt(0);
		System.out.println(checkSize(str));
		sc.close();
	}

	public static int checkSize(char ch) {
		if (ch == 'I' || ch == 'i') {
			return 4;
		}
		return -1;
	}
}