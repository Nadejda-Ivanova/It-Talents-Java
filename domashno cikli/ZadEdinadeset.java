import java.util.Scanner;

public class ZadEdinadeset {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		int user = potr.nextInt();
		int c = user;
		int v = 0;
		for (int e = 1; e <= user; e++) {

			for (int d = c - 1; d >= 1; d--) {
				System.out.print(" ");
			}
			c--;
			for (int h = 1; h <= e + v; h++) {
				System.out.print("*");
			}
			v++;
			System.out.println();

		}
	}

}
