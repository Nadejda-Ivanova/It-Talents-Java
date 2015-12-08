package masivi;

public class Chetirinaiset {

	public static void main(String[] args) {

		double[] masiv = { 7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2 };
		int count = 0;
		int place = 0;
		for (int bro = 0; bro <= masiv.length - 1; bro++) {
			if (masiv[bro] > -2.99 && masiv[bro] < 2.99) {
				count++;
			}
		}
		double[] pakMasiv = new double[count];
		for (int br = 0; br <= masiv.length - 1; br++) {
			if (masiv[br] > -2.99 && masiv[br] < 2.99) {
				pakMasiv[place] = masiv[br];
				place++;
			}

		}
		for (int broqch = 0; broqch <= pakMasiv.length - 1; broqch++) {
			System.out.print(pakMasiv[broqch] + " ");
		}

	}

}
