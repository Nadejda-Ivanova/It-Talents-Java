import java.util.Scanner;

public class ZadDevet {

	public static void main(String[] args) {
		Scanner potr = new Scanner(System.in);
		System.out.println("Please enter number a:");
		int a = potr.nextInt();
		System.out.println("Please enter number b:");
		int b = potr.nextInt();
		int d = a;
		int j = 0;
		int e;
		for (int c = a; c <= b * b; c++) {
			if (c % 3 == 0) {
				System.out.println("skip " + c);
			} else {
				System.out.println(c);
			}

			e = d + (j * c);
			j++;
			if (c % 3 == 0) {
				e = (d + ((j - 1) * c) - c);
			}
			if (e > 200) {
				break;
			}
		}

	}

}
