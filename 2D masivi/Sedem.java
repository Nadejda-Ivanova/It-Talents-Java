
public class Sedem {

	public static void main(String[] args) {
		int row = 0;
		int col = 0;
		int sum = 0;
		int allSum = 0;
		int[][] masiv = { { 11, 12, 13, 14, 15, 16 }, 
					{ 21, 22, 23, 24, 25, 26 }, 
					{ 31, 32, 33, 34, 35, 36 },
					{ 41, 42, 43, 44, 45, 46 }, 
					{ 51, 52, 53, 54, 55, 56 }, 
					{ 61, 62, 63, 64, 65, 66 } };

		while (row < 6) {

			if ((col + 1 + row + 1) % 2 == 0) {
				sum = sum + masiv[row][col];
				System.out.print(masiv[row][col] + " ");

			}

			if (col == 5) {
				col = -1;
				row++;
				allSum = allSum + sum;
				System.out.println(", suma na elementite ot reda " + sum);
				sum = 0;
			}
			col++;
		}
		System.out.println("Suma na elementite " + allSum);

	}
}
