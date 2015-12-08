import java.util.Scanner;

public class RealZadDvaisetIPet {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = potr.nextInt();
		int product = 1;
		int mnojitel = 1;

		do {
			product = product * mnojitel;
			mnojitel++;

		} while (mnojitel <= n);
		System.out.println(product);

	}
}
