package masivi;

import java.util.Scanner;

public class Petnaiset {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		double max = 0;
		double notsomax = 0;
		double lessmax = 0;

		System.out.println("Enter array length:");
		int dulj = potr.nextInt();
		double[] masiv = new double[dulj];
		for (int bro = 0; bro <= dulj - 1; bro++) {
			System.out.println("Enter number: ");
			masiv[bro] = potr.nextDouble();
		}
		if (masiv[0] < 0) {
			masiv[0] = -masiv[0];
		}
		for (int br = 1; br < dulj - 1; br++) {
			if (masiv[br] < 0) {
				masiv[br] = -masiv[br];
			}
			if (masiv[0] > max) {
				max = masiv[0];
			}
			if (masiv[br] > max) {
				max = masiv[br];
			}

		}
		for (int pakbr = 1; pakbr <= dulj - 1; pakbr++) {
			if (masiv[pakbr] < 0) {
				masiv[pakbr] = -masiv[pakbr];
			}
			if (masiv[pakbr] > notsomax && masiv[pakbr] != max) {
				notsomax = masiv[pakbr];
			}
		}
		for (int amanbr = 1; amanbr <= dulj - 1; amanbr++) {
			if (masiv[amanbr] < 0) {
				masiv[amanbr] = -masiv[amanbr];
			}
			if (masiv[amanbr] >lessmax && masiv[amanbr] != max && masiv[amanbr] != notsomax) {
				lessmax = masiv[amanbr];
			}
		}
		System.out.println(max + " " + notsomax + " " + lessmax);

	}

}
