package masivi;

import java.util.Scanner;

public class Sedemnaiset {

	public static void main(String[] args) {
		boolean zigzag = true;
		Scanner potr = new Scanner(System.in);
		System.out.println("Enter array length:");
		int dulj = potr.nextInt();
		int[] masiv = new int[dulj];
		for (int bro = 0; bro <= dulj - 1; bro++) {
			System.out.println("Enter number:");
			masiv[bro] = potr.nextInt();
		}
		if (masiv[0] > masiv[1]) {
			zigzag = false;
		}
		for (int broqch = 1; broqch < masiv.length - 1; broqch++) {

			boolean uslEdno = ((masiv[broqch] < masiv[broqch - 1]) && (masiv[broqch] < masiv[broqch + 1]));
			boolean uslDve = ((masiv[broqch] > masiv[broqch - 1]) && (masiv[broqch] > masiv[broqch + 1]));

			if (!(uslEdno || uslDve)) {
				zigzag = false;
				break;
			}
		}
		if (zigzag) {
			System.out.println("Redicata izpulnqva iziskvaniqta za zigzagoobrazna nagore redica.");
		} else {
			System.out.println("Redicata ne izpulnqva iziskvaniqta za zigzagoobrazna nagore redica.");
		}

	}
}
