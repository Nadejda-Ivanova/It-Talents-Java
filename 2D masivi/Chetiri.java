
public class Chetiri {

	public static void main(String[] args) {
		int[][] masiv = { 	{ 1, 2, 3, 4 }, 
							{ 5, 6, 7, 8 }, 
							{ 9, 10, 11, 12 }, 
							{ 13, 14, 15, 16 } };
		int[][] pakMasiv = new int[4][4];
		int countRow = 0;
		int countCol = 0;

		for (int row = 3; row >= 0; row--) {
			for (int col = 0; col <= 3; col++) {
				pakMasiv[countRow][countCol] = masiv[row][col];
				countRow++;
			}

			countCol++;
			countRow = 0;
		}
		for (int pakRow = 0; pakRow <= 3; pakRow++) {
			for (int pakCol = 0; pakCol <= 3; pakCol++) {
				masiv[pakRow][pakCol] = pakMasiv[pakRow][pakCol];
			}
		}
		for (int fRow = 0; fRow <= 3; fRow++) {
			for (int fCol = 0; fCol <= 3; fCol++) {
				System.out.print(masiv[fRow][fCol] + " ");
			}
			System.out.println();
		}
	}

}
