import java.util.Scanner;

public class ZadSedemnadeset {

	public static void main(String[] args) {

		Scanner potr = new Scanner(System.in);
		System.out.println("Enter the length of the square side between 3 and 20: ");
		int b = potr.nextInt();
		while (b < 3 || b > 20) {
			System.out.println("The number is too big/too small. Enter another number:");
			b = potr.nextInt();
		}
		System.out.println("Enter symbol to fill the square:");
		char c = potr.next().charAt(0);

		for (int a = 1; a <= b; a++) {
			System.out.print("*");
		}
		System.out.println();
		for (int f = 1; f <= b - 2; f++) {
			System.out.print("*");
			for (int g = 1; g <= b - 2; g++) {
				System.out.print(c);
			}
			System.out.print("*");
			System.out.println();
		}
		for (int v = 1; v <= b; v++) {
			System.out.print("*");
		}

	}

}
