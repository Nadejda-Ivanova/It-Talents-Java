package masivi;

import java.util.Scanner;

public class Tri {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);

		System.out.println("Enter number:");
		int user = potr.nextInt();
		int[] masiv = new int[10];
		masiv[0] = user;
		masiv[1] = user;
		for (int bro = 2; bro <= 9; bro++) {

			masiv[bro] = masiv[bro - 2] + masiv[bro - 1];
		}
		for (int broDve = 0; broDve <= masiv.length - 1; broDve++) {
			System.out.print(masiv[broDve] + " ");
		}
	}

}
