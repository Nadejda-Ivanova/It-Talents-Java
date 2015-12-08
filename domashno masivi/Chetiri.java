package masivi;

import java.util.Scanner;

public class Chetiri {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		System.out.println("Enter array legth:");

		int dulj = potr.nextInt();
		boolean mirror = true;
		int[] masiv = new int[dulj];
		int[] pakMasiv = new int[dulj];
		for (int bro = 0; bro <= dulj - 1; bro++) {

			System.out.println("Enter number");
			masiv[bro] = potr.nextInt();
		}
		for (int broiko = 0; broiko <= dulj - 1; broiko++) {
			pakMasiv[dulj - 1 - broiko] = masiv[broiko];
		}

		for (int br = 0; br <= dulj - 1; br++) {
			if (masiv[br] != pakMasiv[br]) {
				mirror = false;
				break;
			}
		}

		if (mirror = false) {
			System.out.println("Masivut ne e ogledalen.");
		} else {
			System.out.println("Masivut e ogledalen.");
		}
	}
}
