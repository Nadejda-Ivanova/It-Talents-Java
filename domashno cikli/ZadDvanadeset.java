import java.util.Scanner;

public class ZadDvanadeset {

	public static void main(String[] args) {

		int a, b, c;

		for (int d = 100; d <= 999; d++) {

			a = d / 100;
			b = (d % 100) / 10;
			c = (d % 100) % 10;

			if (a != b && b != c && a != c) {
				System.out.println(d + " ");

			}
		}

	}

}
