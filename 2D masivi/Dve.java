import java.util.Scanner;

public class Dve {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		int row = 0;
		int col = 0;
		System.out.println("Vuvedete duljina za stranata na kvadrata:");
		int strana = potr.nextInt();
		int[][] masiv = new int[strana][strana];
		for (int bro = 0; bro <= strana - 1; bro++) {
			for (int pakBro = 0; pakBro <= strana - 1; pakBro++) {
				System.out.println("Vuvedete chislo:");
				masiv[bro][pakBro] = potr.nextInt();
			}
		}
		for (int broq = 0; broq <= strana - 1; broq++) {
			System.out.print(masiv[row][col] + " ");
			row++;
			col++;
		}
		System.out.println();
		row = 0;
		col = strana - 1;
		for (int brr = 0; brr <= strana - 1; brr++) {
			System.out.print(masiv[row][col] + " ");
			row++;
			col--;
		}

	}

}
