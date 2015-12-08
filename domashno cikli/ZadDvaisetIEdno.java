import java.util.Scanner;

public class ZadDvaisetIEdno {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		System.out.println("Enter card number:");
		int n = potr.nextInt();
		int polz = 0;
		int color = 0;
		while (n < 1 || n > 52) {
			System.out.println("The card number you entered cannot be found in the deck. Enter another card number:");
			n = potr.nextInt();

		}
		for (int a = n; a <= 52; a++) {

			polz = ((a - 1) / 4) + 2;

			switch (polz) {
			case 2:
				System.out.print("2 ");
				break;
			case 3:
				System.out.print("3 ");
				break;
			case 4:
				System.out.print("4 ");
				break;
			case 5:
				System.out.print("5 ");
				break;
			case 6:
				System.out.print("6 ");
				break;
			case 7:
				System.out.print("7 ");
				break;
			case 8:
				System.out.print("8 ");
				break;
			case 9:
				System.out.print("9 ");
				break;
			case 10:
				System.out.print("10 ");
				break;
			case 11:
				System.out.print("J ");
				break;
			case 12:
				System.out.print("Q ");
				break;
			case 13:
				System.out.print("K ");
				break;
			case 14:
				System.out.print("A ");
				break;
			}

			color = a % 4;
			switch (color) {
			case 1:
				System.out.println("Club, ");
				break;
			case 2:
				System.out.println("Diamond, ");
				break;
			case 3:
				System.out.println("Heart, ");
				break;
			case 0:
				System.out.println("Spade, ");
				break;

			}

		}
	}

}
