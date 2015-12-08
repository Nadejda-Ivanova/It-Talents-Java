import java.util.Scanner;

public class ZadSedem {

	public static void main(String[] args) {

		Scanner potr = new Scanner(System.in);
		System.out.println("Enter number:");
		int user = potr.nextInt();
		int kratno = 3;
		for (int broqch = 1; broqch <= user; broqch++) {
			int result = kratno * broqch;
			System.out.print(result + ",");
		}

	}

}
