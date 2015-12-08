import java.util.Scanner;

public class ZadShest {

	public static void main(String[] args) {

		Scanner potr = new Scanner(System.in);
		System.out.println("Enter number:");
		int user = potr.nextInt();
		int result = 0;
		for (int broqch = 1; broqch <= user; broqch++) {

			result = result + broqch;
		}
		System.out.println("The result is " + result);

	}

}
