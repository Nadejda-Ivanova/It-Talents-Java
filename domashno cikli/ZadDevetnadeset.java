import java.util.Scanner;

public class ZadDevetnadeset {

	public static void main(String[] args) {

		Scanner potr = new Scanner(System.in);
		System.out.println("Enter number between 10 and 99:");
		int n = potr.nextInt();
		while (n < 10 || n > 99) {
			System.out.println("The number is not between 10 and 99. Enter another number:");
		}
		int b = n;

		for (int a = 1; a < 5;) {

			if (b % 2 == 0) {
				b = b / 2;
				System.out.print(b + " ");
			} else {
				b = (3 * b) + 1;
				System.out.print(b + " ");
			}
			if (b == 1) {
				break;
			}
		}

	}
}
