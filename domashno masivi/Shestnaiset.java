package masivi;

public class Shestnaiset {

	public static void main(String[] args) {
		double[] masiv = { -1.12, -2.43, 3.1, 4.2, 0, 6.4, -7.5, 8.6, 9.1, -4 };
		for (int bro = 0; bro <= masiv.length - 1; bro++) {
			System.out.print(masiv[bro] + " ");
		}

		System.out.println();

		for (int br = 0; br < masiv.length; br++) {
			if (masiv[br] < (-0.231)) {
				masiv[br] = (br + 1) * (br + 1) + 41.25;
			} else {
				masiv[br] = masiv[br] * (double) (br + 1);
			}
		}
		for (int broqch = 0; broqch <= masiv.length - 1; broqch++) {
			System.out.print(masiv[broqch] + " ");
		}
	}

}
