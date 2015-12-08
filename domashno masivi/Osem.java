package masivi;

public class Osem {

	public static void main(String[] args) {

		int[] masiv = { 3, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7, 7, 7, 7, 4, 5, 7, 7, 7, 7, 2, 3, 4, 5, };
		int count = 0;
		int result = 0;
		int elNumber = 0;
		for (int bro = 0; bro <= masiv.length - 2; bro++) {
			if (masiv[bro] == masiv[bro + 1]) {
				count++;

			} else {
				if (count > result) {
					result = count;
					count = 0;
					elNumber = bro;
				}
			}
		}
		for (int br = 0; br <= result; br++) {
			System.out.print(masiv[elNumber] + " ");
			elNumber--;
		}

	}
}
