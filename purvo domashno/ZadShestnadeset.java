import java.util.Scanner;

public class ZadShestnadeset {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		int nach = potr.nextInt();
		while (nach < 100 || nach > 999) {
			System.out.println("The number is either too big or too small please try again!");
			nach = potr.nextInt();
		}
		int a = nach / 100;
		int b = (nach % 100) / 10;
		int c = (nach % 100) % 10;

		if (a==b && b==c || a>b && b> c || a<b && b< c) {

			if (a==b && b==c) {
				System.out.println("The digits in the number are equal");
			}
			if (a>b && b> c) {
				System.out.println("The digits in the number are in descending order.");
			}
			if (a<b && b<c) {
				System.out.println("The digits in the number are in accending order");
			}
		}
		else {
			System.out.println("The digits in the number are not in any of the given orders.");
		}
	}

}
