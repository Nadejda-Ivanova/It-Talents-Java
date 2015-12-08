package masivi;

public class Pet {

	public static void main(String[] args) {
		int[] masiv = new int[10];
		for (int bro = 0; bro <= 9; bro++) {
			masiv[bro] = bro * 3;
		}
		for (int br = 0; br <= 9; br++) {
			System.out.print(masiv[br] + " ");
		}

	}

}
