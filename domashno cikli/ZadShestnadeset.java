import java.util.Scanner;

public class ZadShestnadeset {

	public static void main(String[] args) {

		Scanner potr = new Scanner(System.in);
		System.out.println("Enter number between 10 and 5555:");
		int n = potr.nextInt();
		System.out.println("Enter number between 10 and 5555:");
		int m = potr.nextInt();
		while (n < 10 || n > 5555 || m < 10 || m > 5555) {
			System.out.println("One of your numbers is not between 10 and 5555. Please enter new numbers");
			System.out.println("Enter number between 10 and 5555:");
			n = potr.nextInt();
			System.out.println("Enter number between 10 and 5555:");
			m = potr.nextInt();

		}
		if (n < m) {
			for (int a = m; a >= n; a--) {
				if (a % 50 == 0) {
					System.out.println(a);
				}
			}

		} else {
			for (int b = n; b >= m; b--) {
				if (b % 50 == 0) {
					System.out.println(b);
				}
			}

		}

	}

}
