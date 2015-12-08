package masivi;

import java.util.Scanner;

public class RealEdinaiset {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);

		int[] masiv = new int[7];
		int count = 0;

		for (int bro = 0; bro <= 6; bro++) {
			System.out.println("Enter number:");
			masiv[bro] = potr.nextInt();
		}

		for (int br = 0; br <= 6; br++) {
			if (masiv[br] > 5 && masiv[br] % 5 == 0) {
				System.out.print(masiv[br] + " ");
				count++;
			}
		}
		System.out.print("- " + count + " numbers.");
	}

}
