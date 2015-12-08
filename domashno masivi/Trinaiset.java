package masivi;

import java.util.Scanner;

public class Trinaiset {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		System.out.println("Enter number");
		int num = potr.nextInt();
		int divide = num;
		int count = 0;

		while (divide != 0) {
			divide = divide / 2;
			count++;
		}

		int[] masiv = new int[count];
		for (int bro = count - 1; bro >= 0; bro--) {
			masiv[bro] = num % 2;
			num = num / 2;

		}
		for (int br = 0; br <= count - 1; br++) {
			System.out.print(masiv[br]);
		}

	}

}
