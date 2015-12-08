
public class Pet {

	public static void main(String[] args) {
		int[][] masiv = { 	{ 1, 2, 3, 4 }, 
							{ 5, 6, 7, 8 }, 
							{ 9, 10, 11, 12 }, 
							{ 13, 14, 15, 16 } };
		int maxRow = 0;
		int maxCol = 0;
		int sumRow = 0;
		int sumCol = 0;

		for (int col = 0; col <= 3; col++) {
			for (int row = 0; row <= 3; row++) {
				sumCol = sumCol + masiv[row][col];

			}
			if (sumCol > maxCol) {
				maxCol = sumCol;
			}
			sumCol = 0;
		}
		for (int pakRow = 0; pakRow <= 3; pakRow++) {
			for (int pakCol = 0; pakCol <= 3; pakCol++) {
				sumRow = sumRow + masiv[pakRow][pakCol];
			}
			if (sumRow > maxRow) {
				maxRow = sumRow;
			}
			sumRow = 0;
		}
		System.out.println("Maximalmata suma po redove e " + maxRow + ".");
		System.out.println("Maximalnata suma po koloni e " + maxCol + ".");
		if (maxRow > maxCol) {
			System.out.println("Maximalnata suma po redove > maximalnata suma po koloni.");
		} else {
			System.out.println("Maximalnata suma po koloni > maximalnata suma po redove.");
		}
	}
}
