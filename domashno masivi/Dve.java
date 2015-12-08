package masivi;

public class Dve {

	public static void main(String[] args) {
		int[] masiv = { 3, 5, 11, 2, 4, 8, 9 };
		int count = 0;
		for (int broiko = 0; broiko <= masiv.length - 1; broiko++) {
			count++;
		}
		int vrutka = count * 2;
		int[] pakMasiv = new int[vrutka];
		for (int broqch = 0; broqch <= masiv.length - 1; broqch++) {
			pakMasiv[broqch] = masiv[broqch];
			pakMasiv[(pakMasiv.length - 1) - broqch] = masiv[broqch];
		}
		for (int pakBroqch = 0; pakBroqch <= pakMasiv.length - 1; pakBroqch++) {
			System.out.print(pakMasiv[pakBroqch] + " ");
		}
	}

}
