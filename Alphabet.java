import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		int result = checkAlphabet(str.charAt(0));
		System.out.println(result);
	}

	public static int checkAlphabet(char ch) {
		if (ch >= 'A' && ch <= 'Z') {
			return 0;
		} else if (ch >= 'a' && ch <= 'z') {
			return 1;
		} else {
			return -1;
		}
	}
}
