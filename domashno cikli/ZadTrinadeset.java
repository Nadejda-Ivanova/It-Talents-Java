import java.util.Scanner;

public class ZadTrinadeset {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		System.out.println("Please enter number:");
		int n = potr.nextInt();
		int f=0;
		 int b =0;
		 int c=0;
		int sum = f+b+c;

		for (int a = 100; a <= 999; a++) {

			f = a / 100;
			b = (a % 100) / 10;
			c = (a % 100) % 10;
			sum = f+b+c;
			if (sum == n) {
				System.out.print(a + ",");
			}
		}

	}

}
