package masivi;

public class Osemnaiset {

	public static void main(String[] args) {
		int[] masiv = { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };
		int[] pakMasiv = { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };

		int broqch = 0;
		if (masiv.length > pakMasiv.length) {
			broqch = pakMasiv.length;
		} else {
			broqch = masiv.length;
		}
		int[] kraen = new int[broqch];

		for (int br = 0; br <= broqch - 1; br++) {

			if (masiv[br] > pakMasiv[br]) {
				kraen[br] = masiv[br];
			} else {
				kraen[br] = pakMasiv[br];
			}

		}

		for (int broiko = 0; broiko <= masiv.length - 1; broiko++) {
			System.out.print(masiv[broiko] + " ");
		}
		System.out.println();
		for (int pakBroiko = 0; pakBroiko < pakMasiv.length; pakBroiko++) {
			System.out.print(pakMasiv[pakBroiko] + " ");
		}
		System.out.println();
		for (int broikoFinal = 0; broikoFinal <= kraen.length - 1; broikoFinal++) {
			System.out.print(kraen[broikoFinal] + " ");
		}
	}

}
