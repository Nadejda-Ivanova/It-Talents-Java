package masivi;

import java.util.Scanner;

public class purva {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		System.out.println("Enter array length:");
		int dulj = potr.nextInt();
		int[] masiv = new int[dulj];
		int minEl = Integer.MAX_VALUE;
		for (int brr = 0; brr <= dulj - 1; brr++) {
			System.out.println("Enter number:");
			masiv[brr] = potr.nextInt();
		}
		for (int broiko = 0; broiko <= dulj - 1; broiko++) {
			if (masiv[broiko] % 3 == 0 && masiv[broiko] < minEl) {
				minEl = masiv[broiko];
			}
		}
		System.out.println("Nai-malkoto chislo v masiva, kratno na 3, e " + minEl + ".");
	}

}
