
public class Edno {

	public static void main(String[] args) {
		int minimum = Integer.MAX_VALUE;
		int maximum = Integer.MIN_VALUE;
		int[][] masiv = { 	{ 48, 72, 13, 14, 15 }, 
							{ 21, 22, 53, 24, 75 }, 
							{ 31, 57, 33, 34, 35 },
							{ 41, 95, 43, 44, 45 }, 
							{ 59, 52, 53, 54, 55 }, 
							{ 61, 69, 63, 64, 65 } };

		for (int bro = 0; bro <= 5; bro++) {
			for (int pakBro = 0; pakBro <= 4; pakBro++) {
				if (masiv[bro][pakBro] < minimum) {
					minimum = masiv[bro][pakBro];
				} else {
					if (masiv[bro][pakBro] > maximum) {
						maximum = masiv[bro][pakBro];
					}
				}
			}
		}
		System.out.println(
				"Nai-malkoto chislo v masiva e " + minimum + ". Nai-golqmoto chislo v masiva e " + maximum + ".");

	}
}
