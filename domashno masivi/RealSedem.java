package masivi;

import java.util.Scanner;

public class RealSedem {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		System.out.println("Enter array length:");
		int dulj = potr.nextInt();
		int[] masiv = new int[dulj];
		int[] pakMasiv = new int[dulj];
		for (int brr = 0; brr <= dulj - 1; brr++) {
			System.out.println("Enter number:");
			masiv[brr] = potr.nextInt();
		}
		pakMasiv[0] = masiv[0];
		pakMasiv[dulj - 1] = masiv[dulj - 1];
		for (int bro = 1; bro <= masiv.length - 2; bro++) {
			pakMasiv[bro] = masiv[bro - 1] + masiv[bro + 1];
		}
		for (int br = 0; br <= pakMasiv.length - 1; br++) {
			System.out.print(pakMasiv[br] + " ");
		}

	}

}
