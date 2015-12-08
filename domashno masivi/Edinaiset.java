package masivi;

public class Edinaiset {

	public static void main(String[] args) {

		int[] masiv = { 1, 2, 3, 4, 5, 6, 7 };
		int posrednik = 0;
		posrednik = masiv[0];
		masiv[0] = masiv[1];
		masiv[1] = posrednik;
		masiv[2] = masiv[2] + masiv[3];
		masiv[3] = masiv[2] - masiv[3];
		masiv[2] = masiv[2] - masiv[3];
		masiv[4] = masiv[4] * masiv[5];
		masiv[5] = masiv[4] / masiv[5];
		masiv[4] = masiv[4] / masiv[5];

		for (int broqch = 0; broqch <= 6; broqch++) {
			System.out.print(masiv[broqch] + " ");
		}
	}

}
