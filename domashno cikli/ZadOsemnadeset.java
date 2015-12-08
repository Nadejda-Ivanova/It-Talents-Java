import java.util.Scanner;

public class ZadOsemnadeset {

	public static void main(String[] args) {

		Scanner potr = new Scanner(System.in);
		System.out.println("Enter number between 1 and 9:");
		int n = potr.nextInt();
		System.out.println("Enter another number between 1 and 9:");
		int m = potr.nextInt();
		int product = 0;
		while (n < 1 || n > 9 || m < 1 || m > 9) {
			System.out.println("Your numbers are not between 1 and 9. Enter different numbers:");
			n = potr.nextInt();
			m = potr.nextInt();
		}
		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= m; b++) {
				product = a * b;
				System.out.println(a + "*" + b + "=" + product + ";");

			}

		}

	}
}
