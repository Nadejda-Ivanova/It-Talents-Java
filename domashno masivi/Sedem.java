package masivi;

import java.util.Scanner;

public class Sedem {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		System.out.println("Enter array length:");
		int dulj = potr.nextInt();
		int pakDulj = potr.nextInt();
		int[] masiv = new int[dulj];
		int[] pakMasiv = new int[pakDulj];
		boolean length = true;
		boolean equal = true;

		for (int bro = 0; bro <= dulj - 1; bro++) {
			System.out.println("Enter number for the first array:");
			masiv[bro] = potr.nextInt();
		}
		for (int br = 0; br <= pakDulj - 1; br++) {
			System.out.println("Enter number for the second array:");
			pakMasiv[br] = potr.nextInt();
		}
		if (dulj != pakDulj) {
			length = false;
			equal = false;
		} else {
			for (int brr = 0; brr <= dulj - 1; brr++) {
				if (masiv[brr] != pakMasiv[brr]) {
					equal = false;
					break;
				}

			}

		}
		if (length == true) {
			if (equal == true) {
				System.out.println("The arrays are equal and have the same length. ");
			} else {
				System.out.print("The arrays have the same length, but are not equal.");
			}
		} else {
			System.out.println("The arrays have different length, hense cannot be equal. ");
		}

	}
}
